package com.jspiders.p1;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int n1=0,n2=1;
		int n3=0;
		System.out.println(n1+"\n"+n2);
		for(int i=1;i<n-1;i++) {
			n3=n1+(n2*2);
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}

	}

}
