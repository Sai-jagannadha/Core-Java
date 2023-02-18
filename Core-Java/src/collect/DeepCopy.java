package collect;

public class DeepCopy {

	int id;
	String name;
	
public static void main(String[] args) {
	DeepCopy d=new DeepCopy();
	d.id=678;
	d.name="Bhavya Harika";
	System.out.println(d.id+" "+d.name);
	
	DeepCopy d1=new DeepCopy();
	d1.id=d.id;
	d1.name=d.name;
	System.out.println(d1.id+" "+d1.name);
	
	
	
	
}
	
	
	
	
	
}
