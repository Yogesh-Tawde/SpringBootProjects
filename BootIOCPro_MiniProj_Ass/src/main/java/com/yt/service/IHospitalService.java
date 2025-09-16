package com.yt.service;
import java.util.List;
import com.yt.model.Hospital;

public interface IHospitalService 
{
	public List<Hospital> fetchHospitalDetails(String loc1,String loc2,String loc3)throws Exception;

}
