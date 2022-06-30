package testcode;

public class Inheritence extends Inheritence2 {

	@Override
	
	public void amazonPrime() {
		System.out.println("primeSubscription");
	}
	public void amazonKindle() {
		System.out.println("Read ForFree..."); 
	}
	
	public static void main(String[] args) {
		Inheritence in=new Inheritence(); // functionality has to be done in sub class
		in.amazonKindle();
		in.amazonPrime();
		in.amazonPay();
		
		Inheritence2 aa= new Inheritence2();
		aa.amazonPay();
		aa.amazonPrime();
	
		Inheritence2 pp= new Inheritence();
		pp.amazonPay();
		pp.amazonPrime();
		// pp.amazonKindle(); // we cannot access specific methods in child class
		
		
		
		
		
	}

	
	
}
