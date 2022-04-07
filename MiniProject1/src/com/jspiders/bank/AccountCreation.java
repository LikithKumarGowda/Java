package com.jspiders.bank;

public class AccountCreation 
{
	private static int randnum=1002000;
	Account openAccount(String custname,double amount) 
	{
		Account acc=new Account("JSP"+ ++randnum,amount,custname);
		return acc;
		
	}
}
