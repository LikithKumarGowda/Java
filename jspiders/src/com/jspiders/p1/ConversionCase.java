package com.jspiders.p1;

public class ConversionCase {

	public static void main(String[] args) {
		// Case Conversion
		// To convert lowercase to uppercase without using predefined function
		String s="hello";
		String s2="";
		for(int i=0;i<s.length();i++) 
		{
			
			s2=s2+(char)(s.charAt(i)-32); // for upper to lower case use(+32);
		
		}
		System.out.println(s2);
		
		// byte-->short--> 
		//                int--> long--> float--> double
		//        char-->
	}

}
