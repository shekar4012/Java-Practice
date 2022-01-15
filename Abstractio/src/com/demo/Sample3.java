package com.demo;

public class Sample3 implements Sample1, Sample2{

	
	public void mul() {
		int a=5;
		int b=6;
		int c=a*b;
		System.out.println(c);
	}


	public void add() {	
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}
public static void main(String[] args) {
	Sample3 obj=new Sample3();
	obj.add();
	obj.mul();
	
}
}
