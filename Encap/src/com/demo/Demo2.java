package com.demo;

public class Demo2 {
	public String add() {
		String first="raja";
		String last="shekar";
		String full=first+last;
		return full;
	}
	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		
		String full=obj.add();
		System.out.println(full);
		Demo1 obj1=new Demo1();
		
		obj1.setX(4444);
		int x=obj1.getX();
		
		System.out.println(x);
		}
	
}
