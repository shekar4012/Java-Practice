package com.demo;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		System.out.println(hs.add("Nandana"));
		System.out.println(hs.add("Raja"));
		System.out.println(hs.add("Shravya"));
		System.out.println(hs.add("Raja"));
		System.out.println(hs.add("Raja"));
		System.out.println(hs.add("Shravya"));
		System.out.println(hs.add("Chandra"));

		System.out.println(hs);
		System.out.println("list contains Nandana or not:"+hs.contains("Nandana"));
		System.out.println("removed duplicate of Shravya or not:"+hs.remove("Shravya"));
		System.out.println("Is the list empty:"+hs.isEmpty());
		System.out.println(hs.size());

	}

}
