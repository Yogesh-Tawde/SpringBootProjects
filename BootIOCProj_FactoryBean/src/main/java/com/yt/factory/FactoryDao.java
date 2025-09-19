package com.yt.factory;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.yt.dao.IEmployeeDao;
import com.yt.dao.MysqlEmpDao;
import com.yt.dao.OracleEmpDao;

@Component("empDaoFactory")
public class FactoryDao implements FactoryBean<IEmployeeDao>
{
	
	@Value("${choose.dao}")
	private String daoId;
	
	@Autowired
	private DataSource ds;

	@Override
	public IEmployeeDao getObject() throws Exception
	{
		if(daoId.equalsIgnoreCase("oracleDao"))
		{
			return new OracleEmpDao(ds);
		}
		else if(daoId.equalsIgnoreCase("mysqlDao"))
		{
			return new MysqlEmpDao(ds);
		}
	    
		 throw new IllegalArgumentException();
	}

	@Override
	public Class<?> getObjectType() {
		
		return IEmployeeDao.class;
	}
	

}
