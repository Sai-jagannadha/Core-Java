package testcode;

public class Overloading {

	public void westernWear(int val,String name) {
		System.out.println("hellooo");
	}
	public void westernWear() {
		System.out.println("zero aurgument");
	}
	public void westernwear(String name,int val) {
		System.out.println("aurgument");
	}
	
	
	public static void main(String[] args) {
		Overloading ol=new Overloading();
		ol.westernWear();
		ol.westernwear("Tshirts", 450);
		ol.westernWear(350, "TOPS");
		
		
		
		
	}
	
	
	
	
	
}
