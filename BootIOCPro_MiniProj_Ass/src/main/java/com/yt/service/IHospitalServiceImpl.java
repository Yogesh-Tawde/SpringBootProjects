package com.yt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.dao.IHospitalDao;
import com.yt.model.Hospital;

@Service("hospService")
public class IHospitalServiceImpl implements IHospitalService 
{
   @Autowired
	private IHospitalDao dao;
	@Override
	public List<Hospital> fetchHospitalDetails(String loc1, String loc2, String loc3)throws Exception
	{
		 loc1 = loc1.toUpperCase();
		 loc2 = loc2.toUpperCase();
		 loc3 = loc3.toUpperCase();
		 
		List<Hospital> list = dao.getHospDetails(loc1, loc2, loc3);
		
		return list;
	}

}
