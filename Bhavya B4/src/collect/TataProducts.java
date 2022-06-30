package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class TataProducts {

      int pid;
      String pName;
      double cost;
	public TataProducts(int pid, String pName, double cost) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.cost = cost;
	}
      
    public static void main(String[] args) {
		TataProducts tp=new TataProducts(103, "tetly", 157.50);
		TataProducts tp1=new TataProducts(101, "titan", 670.55);
		TataProducts tp2=new TataProducts(104, "fastrack", 500.55);
		TataProducts tp3=new TataProducts(102, "voltas", 880.50);
		
		List<TataProducts> list =new ArrayList<TataProducts>();
	
		list.add(tp);
		list.add(tp1);
		list.add(tp2);
		list.add(tp3);
	
		Collections.sort(list, new BasedOnProductId());
		
		for(TataProducts tataProducts:list) {
			System.out.println(tataProducts.pid);
		}
		
	System.out.println("==============================");
		
	Collections.sort(list, new BasedOnpName());
	for(TataProducts tataProducts:list) {
	
		System.out.println(tataProducts.pName);
		
	}
	System.out.println("==========================");
	
	Collections.sort(list, new BasedOnCost());
	for(TataProducts tataProducts:list) {
		System.out.println(tataProducts.cost);
	}
	
	
	}

	
}
