package except;

public class practice {
	
public void arithmaticexception() {
	try {
	int i=1000;
	int j=i/0;
	System.out.println(" value is "+j);
	}catch(ArithmeticException e) {
		e.printStackTrace();
	}
	System.out.println("value ends===============");
}
public void arrayException() {
	System.out.println(" starts");
	try {
	String[] jioProducts= {"clothes"," reliance mart "," ajio "};
	
	System.out.println(jioProducts[3]);
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println("ends========================");
	}
}
public void nullPointer() {
	System.out.println(" starts...............................");
	
	try {
	
	Integer i=null;
	Integer j=20;
	Integer k=i+j;
	
	System.out.println("value  "+k);
	}catch(NullPointerException e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("================ ends====================");
	}
	
	
	}
	
public void nuumberFormat() {
	System.out.println(".............starts..............");
	
	try {
	String id="bhavya123";
	Integer empid=Integer.valueOf(id);
	
	System.out.println("value "+empid);
	}catch(NumberFormatException e) {
		e.printStackTrace();
	}
	
	finally {
		System.out.println("======ENDS======");
	}
	
	
}





	public static void main(String[] args) {
practice p= new practice();
// p.arithmaticexception();
// p.arrayException();
// p.nullPointer();
p.nuumberFormat();
	}

}
