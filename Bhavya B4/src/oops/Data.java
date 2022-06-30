package oops;
///CONSTRUCTOR

public class Data {
	public Data() {
		System.out.println("ZERO CONSTRUCTOR");
	}
	public Data(int cost) {
		System.out.println("Int cost "+cost);
	}
public Data(String name) {
	System.out.println("String name"+name);
}
	public static void main(String[] args) {
		Data d=new Data();
		Data c1= new Data(250);
		Data m2=new Data("BHAVYA");

	}

}
