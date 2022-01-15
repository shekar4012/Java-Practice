package com.demo;

public class Pract2 extends Pract3
{

	public void add() {
		System.out.println("hi");	
	}

	public void div() {
		System.out.println("how are you");
	}
	
	public static void main(String[] args) {
		Pract2 obj=new Pract2();
		obj.add();
		obj.div();
		obj.sub();
		
	}
}
