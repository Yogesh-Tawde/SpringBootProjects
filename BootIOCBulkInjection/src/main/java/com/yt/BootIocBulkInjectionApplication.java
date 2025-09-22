package com.yt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootIocBulkInjectionApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocBulkInjectionApplication.class, args);
		Company comp = ctx.getBean("company",Company.class);
		System.out.println(comp);
		ctx.close();
	}

}
