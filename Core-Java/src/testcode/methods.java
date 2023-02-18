package testcode;

public class methods {

	public int id() {
		return 78;
	}
	public String name(String name) {
		System.out.println("Bhavya "+name);
		return "Harika";
	}

	public double cost() {
		return 87.55;
	}
	public boolean m1() {
		return false;
	}
	
	
	public static void main(String[] args) {
		methods m= new methods();
		System.out.println(m.id());
		System.out.println(m.name("Harika"));
		System.out.println(m.cost());
		System.out.println(m.m1());
	}
	
	
	
}
