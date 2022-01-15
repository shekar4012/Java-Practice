package com.demo;

import java.util.ArrayList;

public class ArraDup2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(40);
		System.out.println(al);
		System.out.println(al.contains(40));
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) == al.get(j)) {
					System.out.println("duplicate " + al.get(i));
				}
			}
		}
	}
}