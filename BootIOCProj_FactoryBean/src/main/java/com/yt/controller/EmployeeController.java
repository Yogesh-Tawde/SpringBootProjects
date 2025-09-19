package com.yt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yt.model.Employee;
import com.yt.service.IEmployeeService;

@Controller("empController")
public class EmployeeController 
{
	
	@Autowired
	private IEmployeeService service;
	
	public String InsertDeatilsOfEmployee(Employee emp) throws Exception
	{
		String details = service.registerEmployee(emp);
		
		return details;
	}

}
