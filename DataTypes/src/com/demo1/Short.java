package com.demo1;

public class Short {
	public void add() {
		short x=12345;
		short y=32767;
		short z=(short) (x+y);
		System.out.println(z);
		}
	public static void main(String[] args) {
		Long obj=new Long();
		obj.add();	
	}
}
