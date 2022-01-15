package com.demo;

public class Shekar {
	
	public void add(int x, int y) {  //2 inputs required
		int a=x+y;
		System.out.println(a);
	}
	
	public void add(int x,int y,int z) {   //3 inputs required
		int b=x+y+z;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Shekar obj=new Shekar();
		obj.add(10, 20); //depending on inputs we assign method gets executed
		obj.add(10, 20, 30);  
	}
}
