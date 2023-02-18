package multi;

public class Idea implements Runnable {

	@Override
	public   void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Idea...."+Thread.currentThread().getName());
			data();
		}
	}
		
		
		
		public static synchronized void  data() {
			for(int i=0; i<10; i++) {
				System.out.println("Data...."+Thread.currentThread().getName());
				
				
				// WE USE SYNCHRONIZED BLOCKS TO EXCUTE THAT PARTICULAR BLOCK IN A SYNCHRONIZED WAY.
				
				
		//	synchronized (this) {
				//	for(int j=0; i<10; i++) {
				//	System.out.println("Idea...."+Thread.currentThread().getName());
				}
				
			}	
				
		//	}
	//	}
		
	
	public static void main(String[] args) {
		Idea id=new Idea();
		Thread t= new Thread(id);
		t.start();
		
		Idea id1=new Idea();
		
		Thread t1= new Thread(id1);
		t1.start();
		
	}

}
