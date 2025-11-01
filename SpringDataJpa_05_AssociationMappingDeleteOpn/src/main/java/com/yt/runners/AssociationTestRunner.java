package com.yt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yt.service.IAssociationMgmtServiceImpl;
@Component
public class AssociationTestRunner implements CommandLineRunner 
{
    
	@Autowired
	private IAssociationMgmtServiceImpl   service;
	
	@Override
	public void run(String... args) throws Exception 
	{
		
	  //service.deleteAllPhoneNumbersOfAPerson(402);
		//service.deleteAllPhoneNumbersOfAPerson(453);
		service.addNewChildToParentById(502);
		
	}

}
