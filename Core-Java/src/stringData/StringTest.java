package stringData;

public class StringTest {
	
	public static void main(String[] args) {
		String s1=new String("Cognizant"); // created an object -> heap area
	
		String s2="Accenture";// literal -> SCP
		
		String s3=new String("Accenture");
		String s4="Cognizant";
		String s5=new String(" Cognizant");
		String s6="Accenture";
		
		System.out.println(s1==s5); //false cuz address name is different 
		System.out.println(s2==s6);// true cuz same address
		System.out.println(s3==s6); // false
		System.out.println(s4==s6);//false
		System.out.println(s5==s4);// false
		System.out.println(s6==s2); // true
		System.out.println("==========================");
		System.out.println(s1.equals(s4)); // true cuz same content
		System.out.println(s2.equals(s6)); // true
		System.out.println(s3.equals(s2)); // true
		System.out.println(s4.equals(s6)); // false diferent content
		
	}

}
