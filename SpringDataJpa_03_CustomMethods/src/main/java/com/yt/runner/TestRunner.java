package com.yt.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.yt.repository.IDoctorRepo;


@Component
public class TestRunner implements CommandLineRunner 
{
	@Autowired
	private IDoctorRepo repo;
	@Override
	public void run(String... args) throws Exception 
	{
		repo.findByNameEquals("YOGESH")
		.forEach(System.out::println);
		
		repo.findByNameStartingWith("M")
		.forEach(System.out::println);
	}

}
