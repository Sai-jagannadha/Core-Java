package variables;

public class methodTestb2 {
	public int id() {
		return 88;
		
	}
	public String productName(String name) {
		System.out.println("10th line..."+name);
		return "Novel";
	}
		public void product(String productName,double cost, String categoery) {
			System.out.println("This is product method..");
			System.out.println("product"+productName+"price.."+cost+"categoery.."+categoery);
		}
	
	public static void main(String[] args) {
		methodTestb2 mt2=new methodTestb2();
		System.out.println(mt2.id());
		System.out.println("18th line.."+mt2.productName("mobile"));
		mt2.product("Iphone",155.25,"Mobiles");// here we don't need to call println cause we didn't take return value
	
	}

}
