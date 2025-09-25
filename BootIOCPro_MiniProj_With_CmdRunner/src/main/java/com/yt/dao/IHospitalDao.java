package com.yt.dao;
import java.util.List;
import com.yt.model.Hospital;


public interface IHospitalDao 
{
	
	public List<Hospital> getHospDetails(String loc1,String loc2,String loc3)throws Exception;

}
