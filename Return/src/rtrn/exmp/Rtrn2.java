package rtrn.exmp;

public class Rtrn2 {
	public String add() { //need to change the default return type "void" to what ever the data type is (here the data type is String)
		String x="Hari";
		return x;  //need to give return value
	}
public static void main(String[] args) {
	Rtrn2 obj=new Rtrn2();
	String x=obj.add(); //to access x value we need to call "add" object using ex:- obj.add()
	String y="om";
	System.out.println(x+y);
}
}
