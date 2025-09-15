package com.yt.service;

import java.util.List;

import com.yt.model.Employee;

public interface IEmployeeService 
{
	public List<Employee> fetchAllEmpsByDesg(String desg1,String desg2,String desg3)throws Exception;
}
