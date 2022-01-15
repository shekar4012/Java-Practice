package com.demo;

import java.util.ArrayList;

public class Remove {
public static void main(String[] args) {
	ArrayList<String> abc= new ArrayList<String>();
	abc.add("India");
	abc.add("USA");
	abc.add("China");
	System.out.println(abc.remove("China"));
	System.out.println(abc);
	}
}
