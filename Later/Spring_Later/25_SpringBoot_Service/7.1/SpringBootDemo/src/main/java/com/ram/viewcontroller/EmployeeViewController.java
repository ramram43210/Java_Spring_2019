package com.ram.viewcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeViewController
{
	@RequestMapping("/view-employees")
	public String viewEmployees()
	{
		return "view-employees";
	}

	@RequestMapping("/add-employees")
	public String addEmployees()
	{
		return "add-employees";
	}

}
