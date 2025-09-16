package com.yt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yt.model.Employee;
import com.yt.service.IEmployeeService;

@Controller("payroll")
public class PayroleOperationController 
{
	
	@Autowired
	private IEmployeeService service;
	
	
	public List<Employee>  showAllEmpsByDesg(String desg1,String desg2,String desg3)throws Exception
	{
		
		List<Employee> list = service.fetchAllEmpsByDesg(desg1, desg2, desg3);
		return  list;
		
	}

}
