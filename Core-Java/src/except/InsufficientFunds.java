package except;

public class InsufficientFunds extends RuntimeException {

	public InsufficientFunds(String msg) {
		System.out.println(msg);
	}
}
