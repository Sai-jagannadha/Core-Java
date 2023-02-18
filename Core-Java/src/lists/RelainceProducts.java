package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RelainceProducts implements Comparable<RelainceProducts> {

	
	int oid;
	String products;
	double cost;
	
	
	
	
	public RelainceProducts(int oid, String products, double cost) {
		super();
		this.oid = oid;
		this.products = products;
		this.cost = cost;
	}
public static void main(String[] args) {
	RelainceProducts rp=new RelainceProducts(6788, "Grocery", 780.55);
	RelainceProducts rp1=new RelainceProducts(7899, "Trends", 3650);
	RelainceProducts rp2=new RelainceProducts(2022, "Jio", 989);
	
	

       List<RelainceProducts> van= new ArrayList<RelainceProducts>();
       van.add(rp);
       van.add(rp1);
       van.add(rp2);
       
       Collections.sort(van);
       for(RelainceProducts jio: van) {
    	   System.out.println(jio);
       }
       
       
       
}     
       
       
       
       
       
	@Override
public String toString() { // we use to string to get the output otherwise we will get address.
	return "RelainceProducts [oid=" + oid + ", products=" + products + ", cost=" + cost + "]";
}
	@Override
	public int compareTo(RelainceProducts o) {
		
		return this.products.compareTo(o.products);
	}

}
