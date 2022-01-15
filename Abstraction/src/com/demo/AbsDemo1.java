package com.demo;

public class AbsDemo1 extends AbsDemo{
	public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String args[]){
	       AbsDemo1 obj = new AbsDemo1();
	       obj.disp2();
	   }
	   }
