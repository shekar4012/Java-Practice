package com.demo;

import java.util.ArrayList;

public class IsEmpty {

	public static void main(String[] args) {
		ArrayList<String> rt = new ArrayList<String>();
		rt.add("super");
		rt.add("hero");
		System.out.println(rt.isEmpty()); // Boolean
										  // false if rt contains values
		ArrayList<String> gt=new ArrayList<String>();
		System.out.println(gt.isEmpty()); // true if gt is really empty
		
	}
}
