package com.demo;

class OverRiding2 extends OverRiding {
	void add() {
		System.out.println("my daughter name is Nandana");
	}
public static void main(String[] args) {
	OverRiding2 obj=new OverRiding2();
	obj.add();
	//obj.mul();
}
}
