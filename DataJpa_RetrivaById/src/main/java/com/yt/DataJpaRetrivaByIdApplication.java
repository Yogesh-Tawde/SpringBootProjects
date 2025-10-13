package com.yt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yt.service.PoliticianServiceImpl;

@SpringBootApplication
public class DataJpaRetrivaByIdApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(DataJpaRetrivaByIdApplication.class, args);
		PoliticianServiceImpl service = ctx.getBean("politicianService",PoliticianServiceImpl.class);
		
		try
		{
			service.showAllPoliticiansById(List.of(1,2,3)).forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
