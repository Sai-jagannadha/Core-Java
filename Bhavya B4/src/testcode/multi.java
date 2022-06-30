package testcode;


public class multi extends Thread {
	
	@Override
	
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println("swiggy "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		multi m= new multi();

		Thread t1=new Thread(m);
		t1.start();
		
		Thread t2= new Thread(m);
		t2.start();
	}
	
	
}
