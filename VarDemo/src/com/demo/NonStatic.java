package com.demo;

public class NonStatic {
	// Doubt
	public void add() {
		int x=10;
		int y=20;
		System.out.println(x+y);
		mul();
	}
	
	public static void mul() {
		int a=40;
		int b=50;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		NonStatic obj=new NonStatic();
		obj.add();
	}

}
