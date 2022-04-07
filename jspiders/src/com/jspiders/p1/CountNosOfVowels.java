package com.jspiders.p1;

import java.util.Scanner;

public class CountNosOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine().toLowerCase();
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("The nos of vowels in the string is: ");
		System.out.println(count);
		sc.close();

	}

}
