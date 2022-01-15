package com.demo;

public class Constr {
	//In constructor:  Constructor name and Class name will be same 
	Constr(){ //constructor will not allow return type
		int x=100;
		int y=50;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Constr obj=new Constr();
		//no need to call the constructor just create object for class
	}
}
