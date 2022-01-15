package com.demo;

import java.util.ListIterator;
import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
	Vector<String> v=new Vector<String>();
	v.add("hello");
	v.add("world");
	v.add("this is India");
	System.out.println(v);
	ListIterator<String> obj= v.listIterator();
	while (obj.hasNext()) {
		System.out.println(obj.next());
	}
	while (obj.hasPrevious()) {
		System.out.println(obj.previous());
	}
	}

}
