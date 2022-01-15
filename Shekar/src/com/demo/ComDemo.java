package com.demo;

public class ComDemo {

	public int add(int x,int y) {
		System.out.println("hello world");
		int z=x+y;
		return z;
	}
public static void main(String[] args) {
	ComDemo obj=new ComDemo() ;
	//int x=10;
	//int y=20;
	int a=40;
	int z=obj.add(10, 20);
	//System.out.println(z);
	System.out.println(z+a);
	// returning and passing the value at same time 
}
}
