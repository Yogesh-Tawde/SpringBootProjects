package com.yt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yt.model.Hospital;

@Repository("hospDao")
public class IHospitalDaiImpl implements IHospitalDao 
{
    private static final String GET_HOSP_BY_LOC =
    		"SELECT REG_ID,H_NAME,H_LOC FROM HOSP_DETAILS WHERE H_LOC IN(?,?,?) ORDER BY H_LOC";
	
	@Autowired
	private DataSource ds;
	@Override
	public List<Hospital> getHospDetails(String loc1, String loc2, String loc3) throws Exception
	{ 
		List<Hospital> list = new ArrayList<>();
		
		try(Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(GET_HOSP_BY_LOC);)
		{
			ps.setString(1, loc1);
			ps.setString(2, loc2);
			ps.setString(3, loc3);
			
			try(ResultSet rs = ps.executeQuery())
			{
				while(rs.next())
				{
					Hospital hosp = new Hospital();
					hosp.setHospitalId(rs.getInt(1));
					hosp.setHospitalName(rs.getString(2));
					hosp.setHospitalLoc(rs.getString(3));
					list.add(hosp);
				}
				
			}
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}

}
