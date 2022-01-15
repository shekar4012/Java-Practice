package com.demo;

import java.util.TreeSet;

public class HighLow {

	public static void main(String[] args) {
		TreeSet<Integer> Obj=new TreeSet<Integer>();  
        Obj.add(11);  
        Obj.add(66);  
        Obj.add(22);  
        Obj.add(55);  
        System.out.println(Obj);
        System.out.println("Lowest Value: "+Obj.pollFirst());  
        System.out.println("Highest Value: "+Obj.pollLast());  
        System.out.println(Obj.size());
}  
}  