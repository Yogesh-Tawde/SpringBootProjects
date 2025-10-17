package com.yt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.entity.Doctor;
import com.yt.repository.IDoctorRepository;

@Service("doctService")
public class DoctorServiceImpl implements IDoctorService
{
	
	@Autowired
	private IDoctorRepository doctRepo;

	@Override
	public Doctor findDoctorById(Integer id) 
	{
		
		Doctor doctor = doctRepo.getReferenceById(id);
		return doctor;
	}
	

}
