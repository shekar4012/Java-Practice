package com.demo;

import java.util.LinkedList;

public class AddFirst {
	public static void main(String[] args) {
		LinkedList<String> Raja=new LinkedList<String>();
		Raja.add("Student Name");
		Raja.add("Class");
		Raja.add("Section");
		Raja.add("Group");
		Raja.addFirst("Roll No");  //addFirst is used to print the element first in list
		System.out.println(Raja);
		
	}
	}


