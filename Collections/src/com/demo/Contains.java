 package com.demo;

import java.util.ArrayList;

public class Contains {
public static void main(String[] args) {
	ArrayList<String>  xyz=new ArrayList<String>();
	xyz.add("Delhi");    /* contains is the predefined method which will help us to know 
							whether the given element is contained in the ArrayList or not*/
	xyz.add("Mumbai");   
	xyz.add("Chennai");  // boolean
	xyz.add("Hyderabad");
	System.out.println(xyz.contains("Chennai")); // input parameter is applicable

}
}
