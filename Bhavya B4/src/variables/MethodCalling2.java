	package variables;

public class MethodCalling2 {
	double gstAmount=120.22;//instance variable
	static String cat="Mobiles";
	public void totalPrice() {
		//MethodCalling2 mc1=new MethodCalling2();// created object
		//System.out.println(mc1.itemsAndCosts());
		System.out.println(gstAmount);
		double cost=itemsAndCosts();
		System.out.println(cost);
		System.out.println(MethodCalling2.cat);
		System.out.println(vendor());
		
		
	}
	public double itemsAndCosts() {
		double bottlePrice=45.60;//local variable
		double pensAndBooks=34.64;
		double totalPrice=bottlePrice+pensAndBooks;
		//System.out.pringstAmounttln(totalPrice);
		//System.out.println(gstAmount);
		//System.out.println(MethodCalling2.cat);
		System.out.println(vendor());
		return totalPrice;
	}
	public String vendor() {
		System.out.println();
		return"flipkart";
	}
	public static void main(String[] args) {
		MethodCalling2 mc0=new MethodCalling2();
		mc0.totalPrice();
		
	}

}
