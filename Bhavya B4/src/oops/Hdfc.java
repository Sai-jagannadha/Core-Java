package oops;

public class Hdfc  extends Cred{
	public void  houseloans() {
		System.out.println("houseloan has been processed");
	}
	public void shopping() {
		System.out.println("welcome to hdfc shopping");
	}
public static void main(String[] args) {
	Hdfc hf=new Hdfc();
	hf.houseloans();
	hf.shopping();
	hf.Payment();
}
}
