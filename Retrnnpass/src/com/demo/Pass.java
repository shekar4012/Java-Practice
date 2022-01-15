package com.demo;

public class Pass {
	
	public void add(int x, int y) {
	int z=x+y;
	System.out.println(z);
}
	public static void main(String[] args) {
		Pass obj=new Pass();
		obj.add(10, 20);
	}
	}