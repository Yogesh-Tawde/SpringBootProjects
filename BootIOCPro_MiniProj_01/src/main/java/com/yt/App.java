package com.yt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yt.controller.PayroleOperationController;
import com.yt.model.Employee;

@SpringBootApplication
public class App 
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
		PayroleOperationController ctlr = ctx.getBean("payroll",PayroleOperationController.class);
		try 
		{
			List<Employee> list = ctlr.showAllEmpsByDesg("CLERK", "MANAGER", "SALESMAN");
			list.forEach(emps->System.out  .println(emps));
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}

}
