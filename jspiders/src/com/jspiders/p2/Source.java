package com.jspiders.p2;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s1=new Sample1();
		Demo2 d1=new Demo2();
		s1.test(d1);
		System.out.println(d1.x);
		System.out.println(d1.y);

	}

}
class Demo2{
	int x=10;
	int y=20;
	void disp() {
		System.out.println("Hi i am in display method");
	}
}
class Sample1{
	void test(Demo2 arg) {
		System.out.println(arg.x);
		System.out.println(arg.y);
		arg.disp();
		arg.x=25;
		arg.y=35;
	}
}
