package variables;

public class MethodTestb3 {
	
	public int id() {
		System.out.println("Welcome to Bhavya page");
		System.out.println("this page is currently unavailable");
		System.out.println("user busy");
		return 123;
	}
	public String itemName() {
		return "Iphone 13";
		
	}
	public static void main(String[] args) {
		MethodTestb3 m1=new MethodTestb3();//STATIC METHOD
		System.out.println(m1.id());
		System.out.println(m1.itemName());
		
	}
}
