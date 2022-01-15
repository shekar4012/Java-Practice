package com.demo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetDemo {
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("Java");
		s.add("Selenium");
		s.add("Maven");
		s.add("Testing");
		System.out.println(s);
		System.out.println("Do set contains Maven: "+s.contains("Maven"));
		System.out.println("Is set Empty: "+ s.isEmpty());
		System.out.println("-----------------------");
		System.out.println("Adding Jenkins to set: "+s.add("Jenkins"));
		System.out.println(s);
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		System.out.println("Size of the set before clearing: "+s.size());
		System.out.println("-----------------------");
		System.out.println("Removed Selenium from set: "+s.remove("Selenium"));
		System.out.println(s);
		System.out.println("-----------------------");
		itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Again added Selenium to set: "+s.add("Selenium"));
		System.out.println(s.toString());
		s.clear();
		System.out.println("Size of the set after clearing: "+s.size());
	}
}
