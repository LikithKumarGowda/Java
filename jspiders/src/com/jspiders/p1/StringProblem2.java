package com.jspiders.p1;

public class StringProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hELLO123?Hi";
		String s2="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				s2+=(char)(s.charAt(i)-32);
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
				s2+=(char)(s.charAt(i)+32);
			}
			else {
				s2+=s.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
