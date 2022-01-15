package com.demo;

public class Pra1 {
	int x=100; //if the local variable is not found then it search within the class to execute the program
	public void add() {
		
		int x=10; //While executing the program it looks for the local variable within the method first
		int y=20;
		
		System.out.println(x+y);
			
	}
	public void add2() {
		System.out.println(x*100);
	}
public static void main(String[] args) {
	Pra1 obj=new Pra1();
	obj.add();
	obj.add2();
}
}
