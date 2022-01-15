package sheka.doc;

public class InherExmpl1 {
		
	public void add() {
		
		int x=20;
		
		int y=30;
		
		int z=x+y;
		
		String first="hello";
		String last="world";
		String full=first+last;
		
		System.out.println(z);
		System.out.println(full);

	}
	public static void main(String[] args) {	
	InherExmpl1 obj=new InherExmpl1();
	obj.add();
}
}