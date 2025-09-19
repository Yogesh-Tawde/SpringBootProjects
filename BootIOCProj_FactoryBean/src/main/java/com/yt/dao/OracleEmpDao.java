package com.yt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.yt.model.Employee;

public class OracleEmpDao implements IEmployeeDao 
{
   
	private DataSource ds;
	@Autowired
	public OracleEmpDao(DataSource ds)
	{
		this.ds = ds;
	}
	
	public static final String INSERT_EMP = "INSERT INTO EMP_DATA(EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES(EMPNO_SEQ.NEXTVAL,?,?,?,?)";
	
	@Override
	public int insertEmployee(Employee emp) throws Exception 
	{
		int result = 0;
		
		try(Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(INSERT_EMP))
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
