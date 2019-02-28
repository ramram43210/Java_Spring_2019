package com.ram.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Scheduler
{
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedDelay = 10000, initialDelay = 5000)
	public void reportCurrentTime()
	{
		System.out.println("Current time = " + dateFormat.format(new Date()));
	}
}
