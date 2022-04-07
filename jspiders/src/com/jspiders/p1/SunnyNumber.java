package com.jspiders.p1;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int input=n+1;
		int sum=0;
		boolean flag=false;
		for(int i=1;i<n;i++) {
			sum=i*i;
			if(sum==input) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Sunny nos");
		}
		else{
			System.out.println("not sunny nos");
		}
		sc.close();
		

	
	}

}
