package com.yt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.dao.IEmployeeDao;
import com.yt.model.Employee;

@Service("empService")
public class IEmployeeServiceImpl implements IEmployeeService
{
   
	@Autowired
	private IEmployeeDao dao;
 
	@Override
	public String registerEmployee(Employee emp) throws Exception 
	{
		int result = dao.insertEmployee(emp);
		 return result==0 ?"Employee Not Registered":"Employee is Registered";
	}

}
