package com.demo;

public class DemoOr {

	public static void main(String[] args) {
		int x=11;
		int y=22;
		int z=33;
		if (x>y || y>z) {							//OR F+F=F
													// F+T=T
													// T+F=T
													// T+T=T
			System.out.println("hello world");
		}
		else if (z>y || x<y) {
			System.out.println("welcome"); //when condition if satisfied at a stage remaining steps gets terminated and executes only that
		}
	}
}
