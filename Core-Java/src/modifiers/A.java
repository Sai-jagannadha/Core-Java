package modifiers;
 public class A   {
	public int id=10;
 public void aTest() {
	
	System.out.println("A Test method...");
}
public static void main(String[]args) {
	A a =new A();
	System.out.println(a.id);
	a.aTest();
}
}
