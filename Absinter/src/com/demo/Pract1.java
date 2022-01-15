package com.demo;

public class Pract1 implements Pract,Pract0{

	public void mul() {
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println("total:"+z);
	}
	public void add() {
		String first="Happy";
		String last="Diwali";
		String full=first+last;
		System.out.println(full);		
	}
	public static void main(String[] args) {
		Pract1 obj=new Pract1();
		obj.mul();
		obj.add();
	}	
}
