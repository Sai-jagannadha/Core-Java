package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TataProducts implements Comparable<TataProducts> {

	int pid;
	String pName;
	double amount;
	public TataProducts(int pid, String pName, double amount) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.amount = amount;
	}

	public static void main(String[] args) {
	TataProducts tp=new TataProducts(6748, "titan", 9789);
	TataProducts tp1 =new TataProducts(897, "Fastrack", 9868);
	TataProducts tp2=new TataProducts(8349, "Fossil", 9773);
	
	List<TataProducts> tetly=new ArrayList<TataProducts>();
	tetly.add(tp);
	tetly.add(tp1);
	tetly.add(tp2);
	
	Collections.sort(tetly);
	
	for(TataProducts tata: tetly) {
		System.out.println(tetly);
	}
		
		
		
		
		
	}

	@Override
	public int compareTo(TataProducts o) {
				return this.pName.compareTo(o.pName);
	}

	@Override
	public String toString() {
		return "TataProducts [pid=" + pid + ", pName=" + pName + ", amount=" + amount + "]";
	}
	
	
	
}
