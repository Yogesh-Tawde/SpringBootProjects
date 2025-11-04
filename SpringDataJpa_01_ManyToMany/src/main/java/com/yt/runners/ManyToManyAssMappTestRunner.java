package com.yt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yt.service.IManyToManyAssMappService;


@Component
public class ManyToManyAssMappTestRunner implements CommandLineRunner 
{
   @Autowired
	private IManyToManyAssMappService service;
	@Override
	public void run(String... args) throws Exception
	{
		
		try
		{
			service.saveDataUsingParent();
			service.loadDataUsingParent();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
