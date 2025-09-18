package com.yt.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yt.model.Employee;

@Repository("empDao")
public class IEmployeeDao  implements IEmpDao
{
	
	private static final String INSERT_EMPLOYEE="INSERT INTO EMP_DATA(EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES(EMPNO_SEQ.NEXTVAL,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	@Override
	public int insertEmployee(Employee emp) throws Exception 
	{   
		int result =0;
		try(Connection con = ds.getConnection();
		PreparedStatement ps=con.prepareStatement(INSERT_EMPLOYEE);)
		{  
			ps.setString(1,emp.getEname());
			ps.setString(2,emp.getJob());
			ps.setDouble(3,emp.getSal());
			ps.setInt(4, emp.getDeptno());
			
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
