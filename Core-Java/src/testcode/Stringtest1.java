package testcode;

public class Stringtest1 {
public static void main(String[] args) {
	
	String s1=new String(" Bhavya");
	String s2="Ramya";
	String s3=new String("Ramya");
	String s4=" Bhavya";
	String s5=new String(" Bhavya");
	String s6="Ramya";
	
	System.out.println(s1==s5); // false
	System.out.println(s2==s6); //true
	System.out.println(s1==s4);// false
	System.out.println(s3==s6);// false
	System.out.println("=============");
	System.out.println(s1.equals(s5)); // true
	System.out.println(s2.equals(s6)); // true
	System.out.println(s3.equals(s4)); // false)
	System.out.println(s1.equals(s4)); // true
	
}
}
