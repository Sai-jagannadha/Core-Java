package oops;

public class Parent extends Grandparent {
public void bike() {
	System.out.println("parent bike");
}
public void car() {
	System.out.println("parent car");
	
}
public static void main(String[]args) {
	Parent p=new Parent();
		p.bike();
		p.car();
	// PARENT CAN ACCESS GRANDPARENT'S DATA
	p.house();
	p.gold();
}
}
