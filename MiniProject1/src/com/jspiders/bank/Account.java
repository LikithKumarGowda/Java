package com.jspiders.bank;

public class Account {
	final private String accnum;
	private double accbal;
	private String custname;
	
	public Account(String accnum, double accbal, String custname) {
		super();
		this.accnum = accnum;
		this.accbal = accbal;
		this.custname = custname;
	}

	public double getAccbal() {
		return accbal;
	}

	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getAccnum() {
		return accnum;
	}
	
	

}
