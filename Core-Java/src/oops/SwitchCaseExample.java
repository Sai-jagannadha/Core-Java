package oops;

public class SwitchCaseExample {
public static void main(String[] args) {
	int i=10;
	switch (i) {
	case 1: 
		System.out.println("print 1 "+i);
		break;
	case 5: 
		System.out.println("print 2"+i);
		break;
	case 10: 
		System.out.println("print 3"+i);
		break;
	
	default:
		System.out.println("default...");
		break;
	}

	}
}
