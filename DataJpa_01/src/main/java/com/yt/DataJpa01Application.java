package com.yt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yt.entity.Doctor;
import com.yt.service.DoctorManagementService;

@SpringBootApplication
public class DataJpa01Application 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(DataJpa01Application.class, args);
		DoctorManagementService service = ctx.getBean("doctorService",DoctorManagementService.class);
		try
		{
			Doctor d = new Doctor();
			d.setDocName("Raghav");
			d.setSpecialization("Hurt Sergen");
			d.setDocIncome(100000.0);
			service.registerDoctor(d);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ctx.close();
	}

}
