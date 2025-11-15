package com.yt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.yt.model.Customer;
@Controller
public class CustomerController 
{
	
	@GetMapping("/")
	public String getWelcomePage()
	{
		return "welcome";
	}
    
	@GetMapping("/register")
	public String showCustomerForm(Map<String,Object> map,@ModelAttribute("cust")Customer cus)
	{
		return "register_customer";
	}
	
	@PostMapping("/register")
	public String registerCustomer(Map<String,Object> map,@ModelAttribute("cust")Customer cus)
	{ 
		return "display";
	}
	
	
}
