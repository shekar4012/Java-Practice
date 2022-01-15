package com.demo;

public class Demo implements Demo1,Demo2{
	public void add() {
		System.out.println("Raja");
	}
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.add();
		obj.mul();
	}
	public void mul() {
		System.out.println("Shekar");
	}
}

