package com.demo;

public class MultiCond {

	public static void main(String[] args) {
		
		int x=15;
		int y=20;
		int z=30;
				//when multiple conditions are applied based upon condition statement changes
		if(x>y) {
			int i=x+y;
			System.out.println(i);
		}
		else if(y>z) {
			int i=x*y;
			System.out.println(i);
		}
		else if(z>y) {
			int i=z*y+x;
			System.out.println(i);
		}
		
	}

}

