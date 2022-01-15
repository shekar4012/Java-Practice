package com.demo;

public class Sample4 extends Sample3 implements Sample1{
	public void string() {
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		Sample4 obj=new Sample4();
		obj.string();
	}
}
