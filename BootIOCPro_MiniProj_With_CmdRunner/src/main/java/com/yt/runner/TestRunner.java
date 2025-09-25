package com.yt.runner;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yt.controller.HospitalController;
import com.yt.model.Hospital;

@Component
public class TestRunner implements CommandLineRunner 
{
    @Autowired
	private HospitalController controller;
    
	@Override
	public void run(String... args) throws Exception 
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Location: ");
		String loc1 = sc.next();
		
		System.out.println("Enter Second Location: ");
		String loc2 = sc.next();
		
		System.out.println("Enter Third Location: ");
		String loc3 = sc.next();
		
        try 
        {
			List<Hospital> list = controller.shoAllHospitalDetails(loc1, loc2, loc3);
			list.forEach(l->System.out.println(l));
		} 
        catch (Exception e) 
        {
			e.printStackTrace();
		}
		sc.close();
		
	}

}
