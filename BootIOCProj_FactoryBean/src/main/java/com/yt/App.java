package com.yt;



import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yt.controller.EmployeeController;
import com.yt.model.Employee;

@SpringBootApplication
public class App 
{

	public static void main(String[] args)
	{
		 ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
		  EmployeeController controller= ctx.getBean("empController",EmployeeController.class);
		  Employee emp = new Employee();
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter Employee Name: ");
		  String empName = sc.nextLine();
		  
		  System.out.println("Enter Employee Job: ");
		  String empJob = sc.nextLine();
		  
		  System.out.println("Enter Employee Salary: ");
		  double empSalary = sc.nextDouble();
		  
		  
		  System.out.println("Enter Employee Deartment No: ");
		  int deptNo = sc.nextInt();
		  
		  emp.setEmpName(empName);
		  emp.setJob(empJob);
		  emp.setSal(empSalary);
		  emp.setDeptNo(deptNo);
		  
		  try 
		  {
			  String insert = controller.InsertDeatilsOfEmployee(emp);
			  System.out.println(insert);
			  
		   } 
		   catch (Exception e) 
		  {
			
			 e.printStackTrace();
		  }
		  sc.close();
		  ctx.close();
		
	}

}
