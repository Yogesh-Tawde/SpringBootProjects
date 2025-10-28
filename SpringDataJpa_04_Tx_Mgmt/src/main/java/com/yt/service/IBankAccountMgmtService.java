package com.yt.service;

import com.yt.entity.BankAccount;

public interface IBankAccountMgmtService 
{
	
	public String openBankAccount(BankAccount acccount);
	public String withdraw(long accNo ,double amount);
	public BankAccount showAccountDetails(long accNo);
	public String deposite(long accNo,double amount);
	public String transferMoney(long srcAccNo,long destAccNo,double amount);

}
