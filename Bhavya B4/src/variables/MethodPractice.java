 package variables;



//// METHODS
public class MethodPractice {
	public short ram() {// ZERO PARAMETER OR ARGUMENT
		return 1234;
		
	}
		public String dog() {
			return"Sai";
		}
	
			
		public String order(String brandname) {
			System.out.println("puma.."+brandname);
			return"biba";
		}
		public char grade(char marksgrade,String noob) { // we can pass multiple dataTypes in a same method
			System.out.println("eng " +marksgrade+"Ace is "+noob);
			return'a';
		}
		public int subject(int math ) {
			System.out.println("47 marks"+ math);
			return 65;
			
		}
		public long customerid(long mobileno,int productno,long clientid) {
			System.out.println("nethra phone no is  "+mobileno+" id no is "+productno+" her clientid is "+clientid);
			return 689809l;
		}
		
		public double amount(double price) {
			System.out.println("sai amount"+ price);
			return 65.78;
		}
		
		
	public static void main(String[] args) {
		MethodPractice bot=new MethodPractice(); 
		System.out.println(bot.ram());
		System.out.println(bot.dog());
		
		bot.amount(123.44); //No need to write println again and again
		bot.grade('b',"Assasin");
		bot.subject(46);
		bot.customerid(9666534201l,8977,54543l);
	}


}
