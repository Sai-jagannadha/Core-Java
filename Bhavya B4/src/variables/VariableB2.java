package variables;

public class VariableB2 {

String name="Harika"; //Instance variable
double amount=120.33;
int id=20;
String s;

static String categeory="Mobiles"; //static variable
	public static void main(String[] args) {
		int id=24; //local variable
		System.out.println(id);
		VariableB2 v3=new VariableB2();//object
		System.out.println(v3.name);
		System.out.println(VariableB2.categeory);
		
		System.out.println(v3.s);
		String s1;// before calling local variable we must initialize first
		String b1= "ramya";
		System.out.println(b1);
		
		
		
	}

}
