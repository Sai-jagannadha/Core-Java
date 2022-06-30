package except;

public class CustomerException {
	
	int bill=1000;
	int balance=2000;
	
	public void balancecheck() {
		if(bill<balance) {
			System.out.println("transaction successful...");
		}else {
		throw new InsufficientFunds("please add more funds");
	}
	}
public static void main(String[]args) {
	CustomerException ce= new CustomerException();
	ce.balancecheck();
}
	
	
	
}
