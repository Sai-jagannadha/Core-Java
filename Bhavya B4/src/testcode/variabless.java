package testcode;



public class variabless extends variabletest2 {
	
	


	public int bal=78; // instance variable
	
	static int price=1000; //static variable
	
	
	public void balance() {
		
		
		int bal=60; // local variable
		
		
		System.out.println(this.bal);
		
		System.out.println(super.bal);
	
		
		System.out.println(bal);
		
System.out.println(price);
		
		
	}

	public static void main(String[] args) {
		
		variabless v1= new variabless();
		v1.balance();
	}
}
