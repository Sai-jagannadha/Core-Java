package oops;

public class Class {

	int id=10; // instance
	public void example() {
		int id=20;
		System.out.println(this.id);
		System.out.println(id);
	}
	public static void main(String[] args) {
		Class a=new Class() ;
		a.example();
		
	}

}


