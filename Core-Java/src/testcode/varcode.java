package testcode;

public class varcode extends Varcode2 {

	int id=80; //INSTANCE VARIABLE
	static String product="rings"; //STATIC VARIABLE
	
	
	 public void shopping() {
		int id=150;
		System.out.println(this.id); // CALLING INSTANCE
		System.out.println(super.id);
		System.out.println(id);
		
		
	}
public static void main(String[] args) {
	
varcode vc=new varcode();

vc.shopping();
System.out.println(vc.id);
System.out.println(product);// CALLING STATIC VARIABLE

	
	
	
}
	
	
	
	
}
