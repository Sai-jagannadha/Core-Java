package collect;

public class HashEquals {

	
	public static void main(String[] args) {
		String name="Chinnu";
		System.out.println(name.hashCode()); // IF THE VALUE IS SAME THEN HASHCODE WILL BE SAME, IF IT IS DIFFERENT VALUE WILL BE DIFFERENT.
		
		String name1="Chinnu";
		System.out.println(name1.hashCode());
		
		System.out.println(name.equals(name1));// IF THE VALUE VALUE OF STRING IS SAME THEN IT IS TRUE, OTHERWISE IT IS FALSE
		
		String name2="Goma";
		System.out.println(name2.hashCode());
		
		String name3="Goma";
		System.out.println(name3.hashCode());
		System.out.println(name2.equals(name3));
		
		
		
	}
	
	
}
