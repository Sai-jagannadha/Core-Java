package collect;

public class DataClone implements Cloneable {

	int id;
	String name;
	
public static void main(String[] args) throws CloneNotSupportedException {
		DataClone dc=new DataClone();
		dc.id=10;
		dc.name="Harika";
		System.out.println(dc.id+"  "+dc.name);

DataClone dc1=new DataClone();
	dc1=(DataClone)dc.clone();
	System.out.println(dc1.id+" "+dc1.name);
	
}	
}
