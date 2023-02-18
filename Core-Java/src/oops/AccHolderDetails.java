package oops;
// ENCAPSULATION
public class AccHolderDetails {

	int accno= 168789;
	String accholder="Bhavya Harika";
	String IFSC="CNRA0002";
	private int balance=66534;
	
	public AccHolderDetails(int accno, String accholder, String iFSC, int balance) {
		super();
		this.accno = accno;
		this.accholder = accholder;
		IFSC = iFSC;
		this.balance = balance;

	}
   
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
		
	}

	public String getAccholder() {
		return accholder;
	}

	public void setAccholder(String accholder) {
		this.accholder = accholder;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		AccHolderDetails ahd=new AccHolderDetails(1245,"bhavya","HDFC123",789898);
		System.out.println(ahd.accholder);
		System.out.println(ahd.accno);
		System.out.println(ahd.balance);
	}
}