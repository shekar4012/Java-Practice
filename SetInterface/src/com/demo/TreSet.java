package com.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreSet {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Rama");
		ts.add("Krishna");
		ts.add("Hanuman");
		ts.add("Srinivas");
		
		System.out.println(ts);
		
		Iterator<String> obj = ts.iterator();  //ts is collection object
		while (obj.hasNext()) {   //hasNext is the predefined method, It will check whether the next 
								  //element is present in collection r not
								  //return type is boolean
			System.out.println(obj.next()); //next is the predefined method, which will help us to get next element
											//return type object
		}
		
		System.out.println(ts.last()); //

	}

}
