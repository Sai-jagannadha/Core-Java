package testcode;

public class Sai {

	public Sai() {
		System.out.println("ZERO AURGUMENT CONSTRUCTOR");
	}
	public Sai(String name,int id) {
		System.out.println("AURGUMENTED CONSTRUCTOR  "+name +" "+id);
	}
	public static void main(String[] args) {
		Sai ss=new Sai();
		Sai ss1=new Sai("Bhavya", 500);
	}
}
