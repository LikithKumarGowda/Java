package com.jspiders.bank;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JSP Bank");
		
		AccountCreation ac1=new AccountCreation();
		Account a1=ac1.openAccount("Ramesh",25000.0);
		System.out.println("Account number is "+a1.getAccnum());
		AccountCreation ac2=new AccountCreation();
		Account a2=ac2.openAccount("Raju",15000.0);
		System.out.println("Account number is "+a2.getAccnum());
		Transaction t1=new Transaction();
		t1.deposit(a1,2000.0);
		System.out.println("Account Balance: "+a1.getAccbal());
		t1.withDraw(a1, 500.0);
		System.out.println("Account Balance: "+a1.getAccbal());
		t1.fundtransfer(a1, a2, 12500);
		System.out.println("Account Balance: "+a1.getAccbal());
		System.out.println("Account Balance: "+a2.getAccbal());

	}

}
