 package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Raja");
		al.add("Nitin");
		al.add("Sri");
		al.add("Madhu");
		System.out.println(al);
		Iterator<String> obj=al.iterator();
									//Doubt????
		while(obj.hasNext()){
		System.out.println(obj.next());
			} 
}
}
