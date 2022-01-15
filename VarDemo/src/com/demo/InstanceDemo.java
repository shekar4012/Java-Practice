package com.demo;

public class InstanceDemo {


	int a=80;
	int b=10;
	
	
	public void add() {
		
		int a=10;
		System.out.println(a+b);
	
	}
	
	
	public static void main(String[] args) {
		
	InstanceDemo obj=new InstanceDemo();
	obj.add();
	
	
	}
}
	