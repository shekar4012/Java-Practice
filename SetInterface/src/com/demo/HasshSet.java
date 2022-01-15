package com.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HasshSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		hs.add(30);
		System.out.println(hs); //removes all duplicate values but insertion order is not followed in HashSet
		System.out.println(hs.remove(20)); //removes value 20 from HashSet
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		System.out.println(lhs.add(10));
		System.out.println(lhs.add(30));
		System.out.println(lhs.add(20));
		System.out.println(lhs.add(30));  //return type is boolean if unique value is found it returns true if not false
		System.out.println(lhs.add(30));
		System.out.println(lhs.add(40));
		System.out.println(lhs);			//LinkedHashSet follows both insertion order & removes duplicates value		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(40);
		System.out.println(ts); //TreeSet follows insertion order in ascending order and removes duplicates
	
	}

}
