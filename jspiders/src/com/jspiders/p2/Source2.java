package com.jspiders.p2;

public class Source2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample();
		Demo d1=new Demo();
		Demo3 d2=new Demo3();
		Demo4 d3=new Demo4();
		s1.test(d1); //same type
		s1.test(d2); // implicit Upcasting.         // this topic is generalization
		s1.test(d3); // implicit Upcasting.
		
		// if in sample we use demo3
		//s1.xyz(d1);  // error due to downcasting
		s1.xyz(d2);                               // this is specialization.
		//s1.xyz(d3);  // error due to no relationship
		

	}

}
class Demo{
	int x=10;
	int y=20;
	void disp() {
		System.out.println("Hi i am in display method");
	}
	
	
}
class Demo3 extends Demo{
	int p;
	void view() {
		System.out.println("I am in view method");
	}
}
class Demo4 extends Demo{
	int q;
	void run() {
		System.out.println("I am in run method");
	}
}
class Sample{
	void test(Demo arg) {
		System.out.println(arg.x);
		System.out.println(arg.y);
		arg.disp();
		arg.x=25;
		arg.y=35;
	}
	void xyz(Demo3 arg) {
		System.out.println(arg.x);
		System.out.println(arg.y);
		arg.disp();
		arg.x=25;
		arg.y=35;
	}
}