package com.yt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yt.service.IDoctorPagingSer;

@Component
public class TestRunner implements CommandLineRunner
{

	
	/*	@Autowired
    private IDoctorService doctorService;
	@Override
	public void run(String... args) throws Exception 
	{
		
		doctorService.showDoctInfoBySort(true, "name")
		.forEach(System.out::println);
	}
	*/
	
	
//	@Autowired
//	private IDoctorpagingService service;
    
	@Autowired
	private IDoctorPagingSer service;
	@Override
	public void run(String... args) throws Exception 
	{
//		try
//		{
//			Page<Doctor> page = service.shoAllDoctorByPageNo(0, 3, true, "name");
//			System.out.println("Page No: "+page.getNumber());
//			System.out.println("Number Of Pages: "+page.getTotalPages());
//			System.out.println("Is It first Page: "+page.isFirst());
//			System.out.println("Is It last  Page: "+page.isLast());
//			System.out.println("size: "+page.getSize());
//			System.out.println("page element count: "+page.getNumberOfElements());
//			
//			if(!page.isEmpty())
//			{
//				List<Doctor> content = page.getContent();
//				content.forEach(System.out::println);
//			}
//			else
//			{
//				System.out.println("Page Not Found");
//			}
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		service.showDataThroughPaging(3);
		
		
	}
	
	

}
