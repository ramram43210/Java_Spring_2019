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

		String message = "I am not feeling well, I am taking sick leave";

		email.sendEmail(message);

		System.out.println("Email sent successfully");

	}
}
