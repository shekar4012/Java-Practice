package com.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();  //Key Value Pair
		hm.put(10, "raja");
		hm.put(20, "shekar");
		hm.put(10, "nandana");
		hm.put(30, "shravya");
		hm.put(40, "padmaja");
		hm.put(40, "mb padmaja");
		System.out.println(hm);
	
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
		lhm.put(1, "abc");
		lhm.put(1, "bcd");
		lhm.put(2, "gtr");
		lhm.put(3, "abs");
		lhm.put(5, "amg");
		lhm.put(3, "stp");
		lhm.put(4, "php");
		lhm.put(9, "xml");
		System.out.println(lhm);
				
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "abc");
		tm.put(1, "bcd");
		tm.put(2, "gtr");
		tm.put(3, "abs");
		tm.put(5, "amg");
		tm.put(3, "stp");
		tm.put(4, "php");
		tm.put(9, "xml");
		System.out.println(tm);
	}
}
