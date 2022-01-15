package com.demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Selenium");
		al.add("TestNG");
		al.add("Jenkins");
		al.add(2, "Maven");
		al.add("Github");
		System.out.println(al);
		System.out.println(al.contains("Jenkins"));
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Github"));
		System.out.println(al.isEmpty());
		al.add("Jira");
		System.out.println(al.lastIndexOf("Jira"));
		System.out.println(al.get(6));
		System.out.println("------------------");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("size of arraylist before removing: " +al.size());
		al.remove(2);
		System.out.println("------------------");
		itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("size of arraylist after removing: " +al.size());
		System.out.println("jenkins".concat("Jira"));
		System.out.println("-----------------------");
		al.clear();
		System.out.println("after clearing the arraylist: " +al.size());
	}
}
