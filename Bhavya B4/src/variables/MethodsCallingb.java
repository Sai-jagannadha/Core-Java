package variables;
// METHODS CALLING
public class MethodsCallingb {
	
public void totalPrice() {

MethodsCallingb mc1=new MethodsCallingb();//CREATED OBJECT
	//System.out.println(mc1.itemsAndCost()); // 110.06
	double cost=mc1.itemsAndCost();
	System.out.println(cost);
	
}
public double itemsAndCost() {
	double mugPrice=70.50;// 
	double clothPrice=39.56;
	double totalPrice= mugPrice+clothPrice;
	return totalPrice;
	
}
public String vendor() {
	return"flipkart";
}
	public static void main(String[] args) {
		MethodsCallingb mc=new MethodsCallingb();
		mc.totalPrice();
		
	}

}
