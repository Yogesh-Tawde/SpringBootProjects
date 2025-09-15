package com.yt.dao;

import java.util.List;

import com.yt.model.Employee;

public interface IEmployeeDao {
	
	public List<Employee> getEmpsByDesg(String desg1,String desg2,String desg3)throws Exception;

}
