package loops;

public class Whileloop {
	public static void main(String[] args) {
		//when we don't know how many iterations we have we use for loop
		
		//while loop
		
		
		int i=1; //initialization
		
		while(i<10) {  //condition
			System.out.println(i); 
			
		i++; //increment
		}
		
		//FOR EACH
		
	String[] mobiles= { "redmi","poco","oneplus"};
	
	for (String val:mobiles) {
	
	System.out.println(val);
	
	}
	//for loop
	for(int id=0; id<=10; id++  ) {
		System.out.println(id);
	}
	
	// DO WHILE 
	// EITHER CONDITION IS TRUE OR FALSE WE NEED ATLEAST 1 STATEMENT TO EXECUTE
	
	
	int j=1;
	do {
		System.out.println(j);
		j++;
	} while (j>10);

}
}