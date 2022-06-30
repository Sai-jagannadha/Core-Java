package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparableb implements Comparable<Comparableb> {
	
        int cid;
        String pname;
        double cost;

		
	public Comparableb(int cid, String pname, double cost) {
			super();
			this.cid = cid;
			this.pname = pname;
			this.cost = cost;
		}

public static void main(String[] args) {
	Comparableb cm=new Comparableb(150, "Sprite", 567);
	Comparableb cm1=new Comparableb(670, "Coffee", 900);
	Comparableb cm2=new Comparableb(300, "tea", 980);
	
	List<Comparableb> list=new ArrayList<Comparableb>();
	list.add(cm);
	list.add(cm1);
	list.add(cm2);
	
	Collections.sort(list);
	
	for(Comparableb comp:list) {
		System.out.println(comp);
	}
}

	@Override
	public int compareTo(Comparableb o) {
		
		return this.pname.compareTo(o.pname);
		
		
	}

	@Override
	public String toString() { // if we don't write to string we will get address instead of output.
		return "Comparableb [cid=" + cid + ", pname=" + pname + ", cost=" + cost + "]";
	}

}
