package com.demo;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listit {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		//List Iterator
		ListIterator<Integer> it=al.listIterator();
		while(it.hasNext()){
		System.out.println(it.next());
			}
		while (it.hasPrevious()) {
		System.out.println(it.previous());
			
		}
 
}
}