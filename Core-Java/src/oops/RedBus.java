package oops;

public class RedBus implements Phonepe {

	@Override
	public void Busbooking() {
		int ticketPrice=550;
		System.out.println("RedBus ticket price is..."+ticketPrice);
		
	}
	public static void main(String[] args) {
		RedBus rb=new RedBus();
		rb.Busbooking();
	}
	

}
