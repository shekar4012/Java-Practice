package com.demo;

public class Demo {
	int x;
	String name;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		Demo obj=new Demo();
		obj.setX(1988);
		obj.setName("Hello");
		int x=obj.getX();
		
		String y=obj.getName();
		System.out.println(x+" "+y);
		//System.out.println(y);
	}
}