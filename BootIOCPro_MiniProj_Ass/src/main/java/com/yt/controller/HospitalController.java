package com.yt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yt.model.Hospital;
import com.yt.service.IHospitalService;

@Controller("hospController")
public class HospitalController 
{
	
	@Autowired
	private IHospitalService service;
	
	
	public List<Hospital> shoAllHospitalDetails(String loc1,String loc2,String loc3) throws Exception
	{
		return service.fetchHospitalDetails(loc1, loc2, loc3);
	}

}
