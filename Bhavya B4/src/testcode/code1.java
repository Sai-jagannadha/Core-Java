package testcode;

public class code1 extends code2 {

int bal=56; // instance
static String val="prasanna"; // static


public void fam() {
	int bal=78; // local variable
	System.out.println(this.bal); // to call instance
	System.out.println(super.bal); // to call another class variable
	System.out.println(bal); 
	
}

public static void main(String[] args) {
	code1 c=new code1();
	c.fam();
	System.out.println(val);
	
	
}
	
	
}
