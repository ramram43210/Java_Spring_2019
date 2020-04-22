package com.ram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.helper.EmailHelper;

@RestController
public class EmailController
{

	@Autowired
	private EmailHelper emailHelper;
	
	@RequestMapping(value = "/sendemail")
	public String sendEmail()
	{
		emailHelper.sendEmail();
		return "Email sent successfully";
	}

}
