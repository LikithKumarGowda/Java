package com.jspiders.p2;

public class Source3 {

	public static void main(String[] args) {
		
		// normal disp method prints first
		Sample6 s1=new Sample6();
		Demo6 d1=s1.createObject(12,23);
		System.out.println("===========================");
		// now i am printing again the value of x and y
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println("============================");
		// ia m creating a new object again
		//which prints the value of disp method
		Sample6 s2=new Sample6();
		Demo6 d3=s2.createObject(34,76);
		System.out.println("==============================");
		// again prints x and y
		System.out.println(d3.x);
		System.out.println(d3.y);
		System.out.println("=============================");
		//the value of x and y  
		Demo6 d2=new Demo6(123,234);
		System.out.println(d2.x);
		//we cant use demo6 like this so check Source4

	}

}
