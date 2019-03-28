package com.ram.mail;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class EMail
{
	private MailSender mailSender;
	private SimpleMailMessage simpleMailMessage;

	public void setMailSender(MailSender mailSender)
	{
		this.mailSender = mailSender;
	}

	public SimpleMailMessage getSimpleMailMessage()
	{
		return simpleMailMessage;
	}

	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage)
	{
		this.simpleMailMessage = simpleMailMessage;
	}

	public void sendEmail(String name, String message)
	{
		simpleMailMessage.setText(String.format(simpleMailMessage.getText(), name, message));
		mailSender.send(simpleMailMessage);
	}
}
