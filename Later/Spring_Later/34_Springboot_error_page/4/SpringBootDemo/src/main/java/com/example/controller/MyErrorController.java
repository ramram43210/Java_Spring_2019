package com.example.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyErrorController implements ErrorController
{

	@RequestMapping(value = "/error")
	public ModelAndView handleError(HttpServletResponse response)
	{
		ModelAndView modelAndView = new ModelAndView();

		if (response.getStatus() == HttpStatus.NOT_FOUND.value())
		{
			modelAndView.setViewName("error_404.html");
		}

		else if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value())
		{
			modelAndView.setViewName("error_500.html");
		}
		else
		{
			modelAndView.setViewName("error.html");
		}

		return modelAndView;
	}

	@Override
	public String getErrorPath()
	{
		return "/error";
	}
}
