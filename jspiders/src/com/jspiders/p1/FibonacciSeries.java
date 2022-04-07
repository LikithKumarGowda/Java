package com.jspiders.p1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int addition=0;
		System.out.print(n1+" "+n2);
		for(int i=1;i<n-1;i++) {
			addition=n1+n2;
			System.out.print(" "+addition);
			n1=n2;
			n2=addition;
		}
		sc.close();

	}

}
