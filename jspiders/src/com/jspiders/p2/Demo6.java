package com.jspiders.p2;

public class Demo6 {
	int x;
	int y;
	Demo6(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void disp() {
		
		System.out.println("i am in disp method");
		System.out.println(x+"      "+y);
	}
}
