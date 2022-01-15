package com.demo;

import java.util.ArrayList;

public class Demo2 {
	
	public static void main(String[] args) {
	
		ArrayList<String> al=new ArrayList<String>();
	
		al.add(1, "raj");
		al.add("shekar");
		
		
		ArrayList<String> als=new ArrayList<String>();
		
		als.add("raja");
		als.add("nihan");
		
		al.addAll(als);
		System.out.println(al.get(0));	  //retrieve element from ArrayList
										  //pass index integer
										  //return object
		
		System.out.println(al.remove(2)); //remove delete elements from ArrayList
										  //pass index integer
										  //return object
		
		System.out.println(al.remove("shekar")); //remove delete elements from ArrayList
		  										  //input object
												  //return boolean
		
		al.add(0, "hello");		//add method to update ArrayList
								//index-integer & object
								//return boolean
		
		System.out.println(al);
		//System.out.println(als);
		
	}
}
