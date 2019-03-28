package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.mail.EMail;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EMail email = (EMail) context.getBean("email");

		String senderEmailId = "peter@ramstore.com";
		String receiverEmailId = "rahul@gmail.com";
		String subject = "Leave Letter";
		String message = "I am not feeling well, I am taking sick leave";

		email.sendMail(senderEmailId, receiverEmailId, subject, message);

		System.out.println("Email sent successfully");

	}
}
