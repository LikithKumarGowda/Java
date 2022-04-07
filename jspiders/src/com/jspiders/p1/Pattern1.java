package com.jspiders.p1;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print(j+" ");
				}
				else {
					char c='A';
					for(int k=1;k<=i;k++) {
						System.out.print(c+"  ");
						
						c=(char)(c+1);
						
					}
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
