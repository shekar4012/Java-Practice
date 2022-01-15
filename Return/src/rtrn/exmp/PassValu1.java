package rtrn.exmp;

public class PassValu1 {
	public int add() {
		int x=10;
		int y=20;
		int z=x+y;
		return z;

	}

		public static void main(String[] args) {
		PassValu1 obj=new PassValu1();
		int z=obj.add();
		int a=50;
		System.out.println(z+a);
	}
}
