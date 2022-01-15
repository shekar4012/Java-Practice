package var.ins;

public class InstanceVariable {

	
	int a=80;
	int b=10;
	
	
	public void add() {
		
		int a=45;
		System.out.println(a*b); //"A variable declared inside the class but 
		                         //outside the body of the method, is called an instance variable".
	
	}
	
	public void mul() {
		int x=6;
		int y=50;
		System.out.println(x+y+a);
	}
	
	public void div() {
		int h=6;
		int g=8;
		int i=h+g;
		System.out.println(i+a*b);
	
		
	}	
	public static void main(String[] args) {
		
	InstanceVariable obj=new InstanceVariable();
	obj.add();
	obj.mul();
	obj.div();
	
	
	}


}
