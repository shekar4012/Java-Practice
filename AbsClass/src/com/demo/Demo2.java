package com.demo;

public class Demo2 extends Demo{
	// when normal class extends abstract class we need to implement 
	// all abstract methods in it or related to it
	public void mul() {
		System.out.println("bye bye");
		
	}
	public static void main(String[] args) {
		Demo2 obj=new Demo2();
			obj.add();
			obj.mul();
			obj.div();
	}
	public void div() {
	System.out.println(":)");
		
	}

}
