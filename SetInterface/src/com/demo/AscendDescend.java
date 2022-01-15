package com.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class AscendDescend {

	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();  
        al.add("Raja");  
        al.add("Madhu");  
        al.add("Sri");  
        al.add("Nitin");
        al.add("Shalu");
        al.add("Goutham");
        al.add("Nitish");
        
        System.out.println(al);
        
        System.out.println("Traversing element through Iterator in descending order");  
        Iterator Obj=al.descendingIterator();  
        while(Obj.hasNext()){  
            System.out.println(Obj.next());  
        }  
          
}  
}  