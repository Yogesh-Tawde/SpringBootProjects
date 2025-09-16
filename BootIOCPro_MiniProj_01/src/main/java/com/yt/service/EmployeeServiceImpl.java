package com.yt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.dao.IEmployeeDao;
import com.yt.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService 
{
	
	@Autowired
	private IEmployeeDao dao;

	@Override
	public List<Employee> fetchAllEmpsByDesg(String desg1, String desg2, String desg3) throws Exception 
	{
		
		desg1 = desg1.toUpperCase()	;
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();
		List<Employee> list = dao.getEmpsByDesg(desg1, desg2, desg3);
		
		list.forEach(emp->
		{
			 double grossSalary = emp.getSalary() * 1.5;  
			    double netSalary   = grossSalary * 0.8;     

			    emp.setGrossSalary(grossSalary);
			    emp.setNetSalary(netSalary);
		   
		});
		
		return list;
	}

}
