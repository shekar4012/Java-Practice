package com.demo;

public class Demo {

	
	int a=10;
	int b=5;
	
	public void add() {

		int x=100;
		int y=200;
		System.out.println(x+y);	
	}
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.add();	
		obj.mul();
	}

	public void mul() {
		
		System.out.println(StaticDemo.h);
		
	}
	
	}
