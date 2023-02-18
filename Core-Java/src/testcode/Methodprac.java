package testcode;

public class Methodprac {
	
	public int products() { //INSTANCE METHOD
		return 570;
	}
	public String books() {
		return "Janeausten";
		
	}
	
	public  void grocery() {
		System.out.println("grocery ...");
	}
	
	public static long customerid() { // STATIC METHOD
		return 798977;
	}
	public String stationary( String novel) {
		System.out.println("stationary and..."+novel);
		return"pens";
		
	}
	

	public static void main(String[] args) {

	Methodprac mc=new Methodprac();
	System.out.println(mc.products());
	System.out.println(mc.books());
	mc.grocery();
	System.out.println(Methodprac.customerid());
mc.stationary("Bookmark");
		
		
		
	}
	
	
	
	
	

}
