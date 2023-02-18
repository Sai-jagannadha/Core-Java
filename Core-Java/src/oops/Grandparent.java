package oops;

public class Grandparent {
	public void house() {
System.out.println("grandpa house");
}
public void gold() {
	System.out.println("grandpa gold");
	}
public static void main(String[] args) {
	Grandparent gp=new Grandparent();
	gp.house();
	gp.gold();
}
}