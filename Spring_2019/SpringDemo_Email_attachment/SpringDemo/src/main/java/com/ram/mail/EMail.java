package com.ram.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EMail
{
	private JavaMailSender javaMailSender;

	public void setMailSender(JavaMailSender javaMailSender)
	{
		this.javaMailSender = javaMailSender;
	}

	public void sendEmail(String message)
	{
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try
		{
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

			helper.setFrom("testram4321@gmail.com");
			helper.setTo("testram4321@gmail.com");
			helper.setSubject("Leave Leter");
			helper.setText(message);

			FileSystemResource file = new FileSystemResource("D:\\work\\tree.jpg");
			helper.addAttachment(file.getFilename(), file);
			javaMailSender.send(mimeMessage);
		}
		catch (MessagingException e)
		{
			e.printStackTrace();
		}

	}
}
