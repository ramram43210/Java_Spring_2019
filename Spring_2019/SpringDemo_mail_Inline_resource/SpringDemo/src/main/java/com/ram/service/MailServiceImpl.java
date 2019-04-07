package com.ram.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailServiceImpl implements MailService
{

	@Autowired
	private JavaMailSender mailSender;

	public void sendEmail(final String senderEmailId, final String receiverEmailId,
			final String subject, final String message)
	{

		MimeMessagePreparator preparator = new MimeMessagePreparator()
		{

			public void prepare(MimeMessage mimeMessage) throws Exception
			{
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

				helper.setFrom(senderEmailId);
				helper.setTo(receiverEmailId);
				helper.setSubject(subject);

				/*
				 * Add an inline resource. use the true flag to indicate you need a multipart
				 * message
				 */
				helper.setText(
						"<html><body><p>" + message + "</p><img src='cid:tree'></body></html>",
						true);
				helper.addInline("tree", new ClassPathResource("tree.jpg"));
			}
		};

		try
		{
			mailSender.send(preparator);
			System.out.println("Message Sent...Hurrey");
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}
	}

}
