package collect;

public class ShallowCopy {

	int id;
	String name;
	
	public static void main(String[] args) {
ShallowCopy sc=new ShallowCopy();
sc.id=78;
sc.name="Goma";
System.out.println(sc.id+"  "+sc.name);
		
ShallowCopy sc1=new ShallowCopy();
sc1=sc;
System.out.println(sc1.id+"  "+sc1.name);


		
	}
	
	
	
}
