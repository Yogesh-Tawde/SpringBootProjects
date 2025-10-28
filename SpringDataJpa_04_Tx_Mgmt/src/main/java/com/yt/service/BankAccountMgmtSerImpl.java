package com.yt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.entity.BankAccount;
import com.yt.repository.IBankAccountRepository;

@Service
public class BankAccountMgmtSerImpl implements IBankAccountMgmtService
{
	
	@Autowired
	private IBankAccountRepository repository;

	@Override
	public String openBankAccount(BankAccount account) 
	{
		account.setCreatedBy(System.getProperty("user.name"));
		Long accNo = repository.save(account).getAccNo();
		return "Bank Account is opened with account No: "+accNo;
	}

	@Override
	public String withdraw(long accNo, double amount) 
	{
		BankAccount account =repository.findById(accNo).orElseThrow(()->new RuntimeException("Invalid accNo"));
		account.setBalance(account.getBalance()-amount);
		account.setUpdatedBy(System.getProperty("user.name"));
		repository.save(account);
		return amount+" is withdrwan from account no: "+accNo;
	}

	@Override
	public BankAccount showAccountDetails(long accNo) 
	{
		BankAccount account = repository.findById(accNo).orElseThrow(()->new RuntimeException("Invalid Input"));
		return account;
	}

	@Override
	public String deposite(long accNo, double amount)
	{   
		BankAccount account = repository.findById(accNo).orElseThrow(()->new RuntimeException("Invalid AccountNo"));
		account.setBalance(account.getBalance()+amount);
		return amount+" is deposited successfully in account no: "+accNo;
	}

	@Override
	public String transferMoney(long srcAccNo, long destAccNo, double amount) 
	{
		
		withdraw(srcAccNo,amount);
		deposite(destAccNo,amount);
		return amount+" is transfered from "+srcAccNo+" to "+destAccNo;
	}

}
