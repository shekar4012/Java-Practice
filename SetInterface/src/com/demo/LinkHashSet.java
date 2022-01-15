package com.demo;

import java.util.LinkedHashSet;

public class LinkHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		System.out.println(hs.add("Nandana"));
		System.out.println(hs.add("Raja"));
		System.out.println(hs.add("Shravya"));
		System.out.println(hs.add("Raja"));
		System.out.println(hs.add("Raja"));
		System.out.println(hs.add("Shravya"));
		System.out.println(hs.add("Padmaja"));

		System.out.println(hs);
		System.out.println(hs.contains("Raja"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());


	}

}
