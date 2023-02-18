package modifiers;

class B extends A {
	
	 public void aTest() {
		
		System.out.println("A Test method...");
	}
	public static void main(String[] args) {
		B a =new B();
		System.out.println(a.id);
		a.aTest();
	}
}

