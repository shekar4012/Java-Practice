package com.demo;

public class OverRid2 extends OverRid{
	public void add() {
		int x=10;
		int y=30;
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		OverRid2 obj=new OverRid2();
		obj.add();
		obj.mul();
	}
}
