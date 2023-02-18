package oops;

public class Overloading2 {
	public void movieData(String name,double price) {
		System.out.println("String..double");
	}
	public void movieData(double price,String name) {
		System.out.println("double...String");
}
	public static void main(String[] args) {
		Overloading2 Ol1=new Overloading2();
		Ol1.movieData(150.55, "KGF");
		Ol1.movieData("kgf", 130.44);
	}
}