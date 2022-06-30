package testcode;

public class Encapsulation {

	String accHolderName="BHAVYA";
	String Ifsccode="CNBK89869";
	private int balance=45000;
	
	
	
	
	public String getAccHolderName() {
		return accHolderName;
	}




	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}




	public String getIfsccode() {
		return Ifsccode;
	}




	public void setIfsccode(String ifsccode) {
		Ifsccode = ifsccode;
	}




	public int getBalance() {
		return balance;
	}
	
	
	




	public void setBalance(int balance) {
		this.balance = balance;
	}




	public static void main(String[] args) {
		Encapsulation en=new Encapsulation();
		System.out.println(en.Ifsccode);
		System.out.println(en.accHolderName);
		System.out.println(en.balance);
			}
	
	}
	

