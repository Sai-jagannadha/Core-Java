package oops;

public class Cred extends Billdesk {
	public void  houseloans() {
		System.out.println("houseloan has been processed");
	}
	public void shopping() {
		System.out.println("welcome to CRED shopping");
	}
public static void main(String[] args) {
	Cred cf=new Cred();
	cf.houseloans();
	cf.shopping();
	cf.Payment();
}
}
