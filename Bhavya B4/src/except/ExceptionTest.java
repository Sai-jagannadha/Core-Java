package except;

public class ExceptionTest {

	public void test() {
		System.out.println("starts");
		try{int i=100;
		int j=i/0;
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		
		
		System.out.println("ends..");
		//System.exit(0);
	}finally {
		System.out.println("finally....");
	}
	}
	public static void main(String[] args) {
		ExceptionTest et=new ExceptionTest();
		et.test();
	}
}