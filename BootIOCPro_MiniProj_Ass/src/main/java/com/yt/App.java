package com.yt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yt.controller.HospitalController;
import com.yt.model.Hospital;

@SpringBootApplication
public class App {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
		HospitalController controller = ctx.getBean("hospController",HospitalController.class);
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
			System.out.println(list);
		} 
        catch (Exception e) 
        {
			e.printStackTrace();
		}
        ctx.close();
        sc.close();
	}

}
