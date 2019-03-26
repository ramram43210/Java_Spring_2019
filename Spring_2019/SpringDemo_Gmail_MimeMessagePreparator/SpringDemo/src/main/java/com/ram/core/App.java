package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.mail.Email;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Email email = (Email) context.getBean("email");

		String senderEmailId = "testram4321@gmail.com";
		String receiverEmailId = "testram4321@gmail.com";
		String subject = "Leave Letter";
		String message = "I am not feeling well, I am taking sick leave";

		email.sendEmail(senderEmailId, receiverEmailId, subject, message);

		System.out.println("Email sent successfully");

	}
}
