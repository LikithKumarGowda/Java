package com.jspiders.p1;

public class StringProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HeLLO123?Hi";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			if(a>=65 && a<=90) {
				s1+= (char)(s.charAt(i)+32);
			}
			else if(a>=97 &&a<=122) {
				s1+=(char)(s.charAt(i)-32);
			}
			else{
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
