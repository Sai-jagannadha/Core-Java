package testcode;

public class Interface1 implements Phonepe,Gpay { // multiple inheritance is possible in interface

	@Override
	public void busBooking() {
		System.out.println("Welcome to redBus");
		System.out.println(Phonepe.name);
	}
	
	public static void main(String[] args) {
		Interface1 op=new Interface1();
		op.busBooking();
	}

	
	
	
	
	
}
