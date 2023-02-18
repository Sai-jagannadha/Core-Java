package modifiers2;

import modifiers.A;

 public class  C extends A {

	public int id=10;
	
	public static void main(String[]args) {
		
		C c =new C();
		System.out.println(c.id);
		c.aTest();
	}
}

