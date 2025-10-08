package com.yt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.entity.Doctor;
import com.yt.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorManagementService implements IDoctorService 
{  
	@Autowired
    private IDoctorRepo doctorRepo;
    
	
	@Override
	public String registerDoctor(Doctor doctor) 
	{
        System.out.println("Doctor Id Before Save: "+doctor.getDocId());
		 doctorRepo.save(doctor);
		 return "Doctor Object Saved: "+doctor.getDocId();
	}

}
