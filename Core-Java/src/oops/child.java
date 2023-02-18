package oops;
/// INHERITANCE WE CAN TAKE DATA FROM OTHER CLASS AND WE CAN CALL DIRECTLY
public class child extends Parent {
	//overriding is happening because we are taking data from another class.
	@Override
	
public void bike() {
	System.out.println("child bike...");
	
}
public static void main(String[]args) {
	child c=new child();
	
	c.bike();
	c.car();
	// BY INHERITANCE CHILD CAN ACCESS GRAND PARENT  DATA THROUGH PARENT CLASS
	// Child CLASS CANNOT ACCESS GRANDPARENT'S CLASS DIRECTLY
	c.house();
	c.gold(); 
}
}
