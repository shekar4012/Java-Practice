package com.demo;

public class ElseIf {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=25;
		if(x<y) {   // "if" condition is not satisfied
		int a=x+y+z;
		System.out.println(a);
		}
	
		else if(y<=z){  //"else if" condition is satisfied
		int a=x+y-z;
		System.out.println(a);
		}
		
		else {
			System.out.println("conditions not satisfied");  //when "if" and "else if" condition is not// 
		}													 //satisfied "else" condition implements//
		}
}
