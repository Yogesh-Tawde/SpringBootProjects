package com.yt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.yt.model.Employee;

public class MysqlEmpDao implements IEmployeeDao
{
	
	private DataSource ds;
	
	@Autowired
	public MysqlEmpDao(DataSource ds)
	{
		this.ds=ds;
		
	}
	
	private static final String INSERT_EMPLOYEE="INSERT INTO EMP(ENAME,JOB,SAL,DEPTNO) VALUES(?,?,?,?)";

	@Override
	public int insertEmployee(Employee emp) throws Exception 
	{   
		int result = 0;
		try(Connection con= ds.getConnection();
		PreparedStatement ps = con.prepareStatement(INSERT_EMPLOYEE);)
		{
			ps.setString(1, emp.getEmpName());
			ps.setString(2, emp.getJob());
			ps.setDouble(3, emp.getSal());
			ps.setInt(4, emp.getDeptNo());
			result = ps.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}

}
