package cons.demo;

public class Pract2 {
	
	Pract2(){
		System.out.println("hi");
	}

	Pract2(int x,int y){
		System.out.println("my name is rajashekar");
		int z=x+y;
		System.out.println(z);
		}
	
	Pract2(int x,int y, int z){
		System.out.println("my age is 33");
		int a=x+y+z;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// Pract2 obj=new Pract2(); to execute 1st method
		 Pract2 obj =new Pract2(10,20); // to execute 2nd method
		// Pract2 obj=new Pract2(10,20,30); //  to execute 3rd method
	}
}
