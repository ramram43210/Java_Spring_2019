package com.ram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ram.model.Employee;
import com.ram.service.EmployeeService;

@Controller
public class EmployeeServiceController
{
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ModelAndView getEmployees(@ModelAttribute Employee employee)
	{
		ModelAndView modelAndView = new ModelAndView();
		List<Employee> employeeList = employeeService.getEmployees();
		modelAndView.setViewName("employeeDetails");
		modelAndView.addObject("employeeList", employeeList);
		return modelAndView;
	}

}
