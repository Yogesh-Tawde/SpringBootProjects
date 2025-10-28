package com.yt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.yt.entity.BankAccount;
import com.yt.service.IBankAccountMgmtService;


@Component
public class BankAccountRunner implements CommandLineRunner 
{

   
	@Autowired
	private IBankAccountMgmtService service;

 
	
	@Override
	public void run(String... args) throws Exception
	{
//		try
//		{
//			BankAccount account = new BankAccount();
//			String openBankAccount = service.openBankAccount(account);
//			System.out.println(openBankAccount);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		try
		{
			BankAccount account = new BankAccount();
			String withdraw = service.withdraw(52, 1000.0);
		    System.out.println(withdraw);
		    BankAccount details = service.showAccountDetails(52);
		    System.out.println(details);
		    System.out.println("Account created on "+account.getCreationTime()+" last accessed on "+account.getLastAccessTime()+" modified for "+account.getUpdationCount());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
