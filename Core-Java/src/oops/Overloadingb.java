package oops;

public class Overloadingb {
	public void redmi(int cost) {
		System.out.println("INT METHOD");
	}
public void redmi(String model) {
	System.out.println("STRING METHOD");
}
public void redmi(boolean RamisGood) {
	System.out.println("boolean method");
}
public static void main(String[]args) {
	Overloadingb ol= new Overloadingb();
	ol.redmi(15000);
	ol.redmi("REDMI NOTE 10 PRO");
	ol.redmi(true);
}
}
