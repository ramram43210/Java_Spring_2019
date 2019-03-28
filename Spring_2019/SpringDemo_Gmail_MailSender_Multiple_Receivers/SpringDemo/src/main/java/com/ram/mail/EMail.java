package com.ram.mail;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class EMail
{
	private MailSender mailSender;

	public void setMailSender(MailSender mailSender)
	{
		this.mailSender = mailSender;
	}

	public void sendEmail(String from, String[] to, String subject, String message)
	{

		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		simpleMailMessage.setFrom(from);
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		mailSender.send(simpleMailMessage);
	}
}
