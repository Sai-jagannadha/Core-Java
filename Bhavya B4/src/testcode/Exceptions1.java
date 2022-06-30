package testcode;

public class Exceptions1 {
	
	public void arithmaticexception() {
		System.out.println(" starts..........");
		
		try{
			int i=100;
		int j=i/0;
		
		}catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("ends..............");	
		}
	}
public void arrayIndex() {
	
	System.out.println(" starts.........");
	try {
	String[] nestleProducts= {"Maggie ", "kikat ","Munch ","chocos "};
	
	System.out.println(nestleProducts[4]);
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	
	}
	finally{
		System.out.println("ends==================");
		}
}
public void numberFormat() {
	System.out.println("......STARTS.......");
	
     try{
    	 String id="Bhavya";
     
     Integer val=Integer.valueOf(id);
     
     System.out.println("value "+val);
     }catch(NumberFormatException e) {
    	 e.printStackTrace();
     }
     
     finally {
    	 System.out.println("=====ends=======");
     }
	
}

	
	
	
	
public static void main(String[] args) {
	Exceptions1 ee=new Exceptions1();
	//ee.arithmaticexception();
	//ee.arrayIndex();
	//ee.nullPointer();
}
}
