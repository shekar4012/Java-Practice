package rtrn.exmp;

public class PassValue {
	public String getele() {
	String first="nagesh";
	String last="nihan";
	String full=first+last;
	return full;

}

	public static void main(String[] args) {
	PassValue obj=new PassValue();
	String full=obj.getele();
	System.out.println(full);
}
}
