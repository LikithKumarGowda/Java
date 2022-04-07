package com.jspiders.p1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String s=sc.nextLine().toUpperCase();
		String s2=s;
		String s1="";
		System.out.println("==========================");
		System.out.println("String in reverse order");
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i); 
		}
		System.out.println(s1);
		System.out.println("==========================");
		System.out.println(" is string palindrome");
		if(s2.equals(s1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		sc.close();

	}

}
