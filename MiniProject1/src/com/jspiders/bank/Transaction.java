package com.jspiders.bank;

public class Transaction {
	
	void deposit(Account acc,double amount) {
		System.out.println("Depositing Rs"+ amount+" to account with a/c number "+acc.getAccnum());
		acc.setAccbal(acc.getAccbal()+amount);
	}
	void withDraw(Account acc,double amount) {
		System.out.println("Withdrawing Rs "+amount+" from the account with a/c number "+acc.getAccnum());
		if(amount<acc.getAccbal()) {
			acc.setAccbal(acc.getAccbal()-amount);
			System.out.println("Withdraw Succesfull");
		}
		else {
			System.out.println("Withdraw Failed due to insufficient funds");
		}
	}
	
	void fundtransfer(Account from,Account to,double amount) {
		//homework
		System.out.println("Rs "+amount+" has been transferred from "+from.getAccnum()+" to "+to.getAccnum()+" .");
		from.setAccbal(from.getAccbal()-amount);
		to.setAccbal(to.getAccbal()+amount);
	}

}
