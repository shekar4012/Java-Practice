package rtrn.exmp;

public class MetdRtrn {
	
	public int add() {
		//to access value which is executed by this method in another method we use "int" as return type//
		int x=10;
		int y=30;
		int z=x+y;
		return z;
	//return is a argument with which we can use value of one method in another method, class or program// 
		
	}
	public static void main(String[] args) {
		MetdRtrn obj=new MetdRtrn();
		int z=obj.add();
		int a=20;
		System.out.println(z+a);
	}
}
