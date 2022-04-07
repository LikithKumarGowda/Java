package com.jspiders.p1;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		//aeiou replace vowels with dollar $
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.nextLine().toLowerCase();
		String s1="";
		
		  for(int i=0;i<s.length();i++) {
		  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.
		  charAt(i)=='u') {
			  s1+='$';
		  }
		  else {
			  s1+=s.charAt(i);
		  }
		  }
		  System.out.println(s1);
		  sc.close();
		 
		

	}

}
