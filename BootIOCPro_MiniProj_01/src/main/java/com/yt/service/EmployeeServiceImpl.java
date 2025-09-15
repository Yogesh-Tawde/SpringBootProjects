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
		List<Employee> list = dao.getEmpsByDesg(desg1, desg2, desg3);
		
		return list;
	}

}
