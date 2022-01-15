package cons.demo;

public class ConsExamp {
	//class name and constructor name will be same i.e.ConsExamp
	ConsExamp() {
		//returntype is not allowed
		int x=45;
		int y=25;
		System.out.println(x+y);
	}
	
	public void example(){
		long a=999999999;
		long b=999999999;
		long c=a+b;
		System.out.println(c);
	}
		

	public static void main(String[] args) {
		
		ConsExamp Obj=new ConsExamp();
		//no need to call constructor
		Obj.example();
			
	}
}
	
