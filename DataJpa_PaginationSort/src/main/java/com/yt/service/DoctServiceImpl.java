package com.yt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.yt.entity.Doctor;
import com.yt.repository.IDoctorRepo;

@Service("doctService")
public class DoctServiceImpl implements IDoctorService 
{
   @Autowired
	private IDoctorRepo doctRepo;
	@Override
	public Iterable<Doctor> showDoctInfoBySort(boolean asc, String... props)
	{
		 Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC,props);
		 Iterable<Doctor> it = doctRepo.findAll(sort);
		return it;
	}

}
