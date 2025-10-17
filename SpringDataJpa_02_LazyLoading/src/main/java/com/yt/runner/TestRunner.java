package com.yt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yt.service.IDoctorService;

@Component
public class TestRunner implements CommandLineRunner
{

  
   @Autowired
	private IDoctorService service;

    
   
	@Override
	public void run(String... args) throws Exception 
	{
		
		System.out.println(service.findDoctorById(8));
		
	}

}
