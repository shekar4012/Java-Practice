package com.demo;

import java.util.ArrayList;

public class Update {
public static void main(String[] args) {
	ArrayList<Integer> xyz=new ArrayList<Integer>();
	xyz.add(10);
	xyz.add(20);
	xyz.add(30);
	System.out.println(xyz);
	xyz.add(0, (5));
	System.out.println(xyz);
	}
}
