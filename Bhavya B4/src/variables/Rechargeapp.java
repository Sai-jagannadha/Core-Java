package variables;

///IF CONDITION
public class Rechargeapp {
	String bill="idea app";
	public void recharge(int amount) {
		if(amount>249) {
			System.out.println("Recharge successful");
			if(bill.equals("phonepe")) {
				System.out.println("Recharge has been done through phonepe");
				
			}else if(bill.equals("Gpay")) {
				System.out.println("Recharge has been done through Gpay");
			}
			else if (bill.equals("idea app")) {
				System.out.println("Recharge has been done through idea app");
			}else {
				System.out.println("Recharge has been done");
			}
		}else {
			System.out.println("unable to reach the server try again");
		}
	
	}
	public static void main(String[] args) {
		Rechargeapp re=new Rechargeapp(); 
			re.recharge(300);
			
		
		}

}
