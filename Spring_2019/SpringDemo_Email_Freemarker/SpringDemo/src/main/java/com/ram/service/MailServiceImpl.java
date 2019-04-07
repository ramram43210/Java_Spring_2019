package com.ram.service;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.ram.model.ProductOrder;

import freemarker.template.Configuration;

@Service("mailService")
public class MailServiceImpl implements MailService
{

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private Configuration freemarkerConfiguration;

	public void sendEmail(Object object)
	{

		ProductOrder order = (ProductOrder) object;
		MimeMessagePreparator preparator = getMessagePreparator(order);

		try
		{
			mailSender.send(preparator);
			System.out.println("Message has been sent.............................");
		}
		catch (MailException ex)
		{
			System.err.println(ex.getMessage());
		}
	}

	private MimeMessagePreparator getMessagePreparator(final ProductOrder order)
	{

		MimeMessagePreparator preparator = new MimeMessagePreparator()
		{

			public void prepare(MimeMessage mimeMessage) throws Exception
			{
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

				helper.setSubject("Your order Info");
				helper.setFrom("testram4321@gmail.com");
				helper.setTo(order.getCustomerInfo().getEmail());

				Map<String, Object> model = new HashMap<String, Object>();
				model.put("order", order);

				String text = geFreeMarkerTemplateContent(model);
				System.out.println("Template content : " + text);

				/*
				 * use the true flag to indicate you need a multipart message
				 */
				helper.setText(text, true);

				/*
				 * Additionally, let's add a resource as an attachment as well.
				 */
				helper.addAttachment("cutie.png", new ClassPathResource("linux-icon.png"));

			}
		};
		return preparator;
	}

	public String geFreeMarkerTemplateContent(Map<String, Object> model)
	{
		StringBuffer content = new StringBuffer();
		try
		{
			content.append(FreeMarkerTemplateUtils.processTemplateIntoString(
					freemarkerConfiguration.getTemplate("fm_mailTemplate.txt"), model));
			return content.toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}

}
