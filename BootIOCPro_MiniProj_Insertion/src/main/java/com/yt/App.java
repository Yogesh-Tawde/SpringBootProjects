package com.yt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yt.controller.EmpController;
import com.yt.model.Employee;

@SpringBootApplication
public class App {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
		EmpController controller = ctx.getBean("empController",EmpController.class);
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String empName=sc.next();
		
		System.out.println("Enter Employee Job: ");
		String empJob = sc.next();
		
		System.out.println("Enter Employee Salary: ");
		double sal = sc.nextDouble();
		
		System.out.println("Enter Employee Department No: ");
		int deptno = sc.nextInt();
		emp.setEname(empName);
		emp.setJob(empJob);
		emp.setSal(sal);
		emp.setDeptno(deptno);
		
		try
		{
			String resultMsg = controller.processEmployee(emp);
			System.out.println(resultMsg);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		sc.close();
		ctx.close();
	}

}
