package com.demo;

public class Exmp2 extends Exmp1{
	public void Demo2() {
		int x=100;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Exmp2 obj=new Exmp2();
		obj.Demo2();
	}
}
