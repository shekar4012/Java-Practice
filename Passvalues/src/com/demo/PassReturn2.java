package com.demo;

public class PassReturn2 {
	
	public String name(String first, String last) {
		String full=first+last;
		return full;
	}
	
	public static void main(String[] args) {
		
		PassReturn2 obj=new PassReturn2();
		
		String first="raja";
		String last=" shekar";
		String full=obj.name(first, last);
		System.out.println(full);
	}
	
}
