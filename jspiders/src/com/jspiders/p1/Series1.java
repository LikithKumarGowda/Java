package com.jspiders.p1;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i*2);
			}
			else {
				System.out.println(i*3);
			}
		}
		sc.close();

	}

}
