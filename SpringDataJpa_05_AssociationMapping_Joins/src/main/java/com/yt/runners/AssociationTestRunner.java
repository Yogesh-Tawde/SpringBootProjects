package com.yt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yt.service.IAssociationMgmtService;

@Component
public class AssociationTestRunner implements CommandLineRunner 
{
	
	@Autowired
	private IAssociationMgmtService service;
	
	
	@Override
	public void run(String... args) throws Exception 
	{
		
		service.fetchDataByJoinUningParent()
		.forEach(row->{
			for(Object val:row)
			{
				System.out.println(val);
			}
			System.out.println();
		});
		
	}

}
