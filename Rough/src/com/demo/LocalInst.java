package com.demo;

public class LocalInst {
	String x="raja";  //variable within the class
	public void add() {  //1st method
		String x="mb";
		String y="rajashekar";
		System.out.println(x+y); //within the method
		
	}
	public void add2() { //2nd method
		String z="shravya";
		System.out.println(z+x); //as there is no x within the method it searches within the class or instance
	}
	public static void main(String[] args) {  //main method
		LocalInst obj=new LocalInst ();  //creating object
		obj.add(); //calling 1st method
		obj.add2(); //calling 2nd method
	}
}
