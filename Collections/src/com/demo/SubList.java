package com.demo;

import java.util.ArrayList;

public class SubList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("hello");
		al.add("Mumbai");
		al.add(1988);
		al.add("welcome");
		System.out.println(al); 			  //Given List
		System.out.println(al.subList(1,3));  //int
											  //which help us to return the sublist from the given list
	}
}
