package com.demo;

public class Demo1 {
	int x;
	int y;
	int getX() {
		return x;
	}
	void setX(int x) {
		this.x = x;
	}
	int getY() {
		return y;
	}
	void setY(int y) {
		this.y = y;
	}
		String raja;	
		String shekar;
	
	public void add() {
		System.out.println("abcd");
	}
	
	public String getRaja() {
			return raja;
		}
		public void setRaja(String raja) {
			this.raja = raja;
		}
		public String getShekar() {
			return shekar;
		}
		public void setShekar(String shekar) {
			this.shekar = shekar;
		}
	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		obj.setX(10); //set is here used to set the value for variable
		obj.setY(40);
		int x=obj.getX(); //get is used for retrieve the value of variable
		int y=obj.getY();
		System.out.println(x+y);
		obj.setRaja("hello");
		obj.setShekar("world");
		String raja=obj.getRaja();
		String shekar=obj.getShekar();
		System.out.println(raja+" "+shekar);
		obj.add();
	}
	}



