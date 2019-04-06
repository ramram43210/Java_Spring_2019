package com.ram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ram.configuration.AppConfig;
import com.ram.service.MailService;
import com.ram.service.MailServiceImpl;

public class App
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		MailService mailService = context.getBean("mailService", MailServiceImpl.class);

		String senderEmailId = "testram4321@gmail.com";
		String receiverEmailId = "testram4321@gmail.com";
		String subject = "Inline Tree Image";
		String message = "Please see the below tree image";

		mailService.sendEmail(senderEmailId, receiverEmailId, subject, message);
		context.close();
	}

}
