package com.ram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ram.config.AppConfig;

public class MessageConsumerApp
{

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		try
		{
			Thread.sleep(6000000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		((AbstractApplicationContext) context).close();
	}

}
