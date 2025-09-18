package com.yt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yt.model.Employee;
import com.yt.service.IEmpService;

@Controller("empController")
public class EmpController 
{
	
	@Autowired
	private IEmpService service;
	
	public String processEmployee(Employee emp) throws Exception
	{
		String registerEmployee = service.registerEmployee(emp);
		return registerEmployee;
		
	}

}
