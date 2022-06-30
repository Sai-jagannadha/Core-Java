package testcode;

public class Overload3 {

	public void  lipsticks() {
		System.out.println("sale on lipcare...");
	}
	public void  lipsticks(String name, double cost) {
		System.out.println("50% off on...");
	}
	public void lipsticks(double cost,String name) {
		System.out.println("60 0ff.....");
	}
	public static void main(String[] args) {
		Overload3 nm= new Overload3();
		nm.lipsticks();
		nm.lipsticks("sugar", 8990);
		nm.lipsticks(8980.50, "harika");
		
		
		
	}
	
	
	
	
}
