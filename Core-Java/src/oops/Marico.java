package oops;
// overloading 
public class Marico {

 public void parachute() {
	 System.out.println("ZERO PARAMETER");
 }
	public void parachute(String name) {
		System.out.println("ONE PARAMETER");
		
	}
	public void parachute(String varient,double amount) {
		System.out.println("TWO PARAMETERS");
	}
	public static void main(String[] args) {
		Marico m= new Marico();
		m.parachute();
		m.parachute("parachute");
		m.parachute("aloevera", 56.66);
	}
	
	
}
