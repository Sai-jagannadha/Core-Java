package except;

//EXCEPTION HANDLING
//EXCEPTION WILL DISTURB THE NORMAL PROGRAM EXCECUTION


public class ExceptionEx {
public void arithmaticException() {
	System.out.println("arithmatic start");
	
	try{
	int i=100;
	int j=i/0;
	System.out.println("value is..."+j);
	}catch(Exception e){
}
	
	System.out.println("arithmatic end..");
}
public void arrayIndex() {
	System.out.println("array index start");
	
	try {
	String[] birlaproducts= {"ultratech","Birla soft","Pantaloons"};
	System.out.println(birlaproducts[3]);
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	System.out.println("array index ends");
}
public void nullPointer() {
	System.out.println("null pointer starts..");
	try {Integer i=null;
	Integer j=20;
	Integer k=i+j;
	System.out.println("value is..."+k);
	}catch(NullPointerException e) {
		e.printStackTrace();
	}
	System.out.println("null pointer ends");
}

public void numberFormat() {
	System.out.println("number format starts");
	try{String id="teja123";
	Integer empId=Integer.valueOf(id);
	System.out.println("value..."+empId);
}catch (NumberFormatException e) {
	e.printStackTrace();
}
	System.out.println("number format ends");
}



public static void main(String[] args) {							
	ExceptionEx ee=new ExceptionEx();
	//ee.arithmaticException();
	//ee.arrayIndex();
	//ee.nullPointer();
	ee.numberFormat();
}
}
 																												