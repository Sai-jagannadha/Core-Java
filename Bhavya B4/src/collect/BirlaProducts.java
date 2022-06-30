package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirlaProducts implements Comparable<BirlaProducts> {

	int pid;
	String pName;
	double cost;
	
	
	
	
	
	public BirlaProducts(int pid, String pName, double cost) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.cost = cost;
	}





	public static void main(String[] args) {
		BirlaProducts bp= new BirlaProducts(102, "ultratech", 890);
		BirlaProducts bp1=new BirlaProducts(23, " BirlaProducts", 230);
		BirlaProducts bp2=new BirlaProducts(78, " pantaloons", 780);
		
		List<BirlaProducts> list =new ArrayList<BirlaProducts>();
		list.add(bp);
		list.add(bp1);
		list.add(bp2);
		
		Collections.sort(list); //implement collections class
		
		for(BirlaProducts birla: list) {
			System.out.println(birla);
		}
	}
//	@Override
//	public int compareTo(BirlaProducts o) {
		
//		return this.pName.compareTo(o.pName);	
//	}




	@Override
	public int compareTo(BirlaProducts o) {
		
		return this.pName.compareTo(o.pName);	
	}





	@Override
	public String toString() {
		return "BirlaProducts [pid=" + pid + ", pName=" + pName + ", cost=" + cost + "]";
	}
	

	
	
	
	

}
