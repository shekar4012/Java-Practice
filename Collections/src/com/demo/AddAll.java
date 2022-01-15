package com.demo;

import java.util.ArrayList;

public class AddAll {
	public static void main(String[] args) {
		ArrayList<String> abc=new ArrayList<String>();
		abc.add("hello");
		abc.add("world");
		System.out.println(abc);
		ArrayList<String> xyz=new ArrayList<String>();
		xyz.add("big");
		xyz.add("boss");
		abc.addAll(xyz);  //addAll is the predefined method which is used to add the 
						  //elements in one ArrayList to another ArrayList
		System.out.println(abc);
	}
}
