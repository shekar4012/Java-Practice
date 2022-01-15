package com.demo;

public class Demo {
	
	public int add(int x, int y) {
		System.out.println("my name is nandana");
		int z=x+y;
		return z;
	}
	public static void main(String[] args) {
		Demo obj=new Demo();
		
		int a=40;
		int z=obj.add(10, 20);
		System.out.println(z+a);
	
	}
}
