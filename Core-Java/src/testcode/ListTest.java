package testcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class ListTest {
	
	public void arrayListTest() {
		List<Integer> bhavi=new ArrayList<Integer>();
		
		bhavi.add(13);
		bhavi.add(20);
		bhavi.add(22);
		bhavi.add(29);
		
		for(Integer val:bhavi) {
			System.out.println(val);
		}
		Iterator<Integer> listltr=bhavi.iterator();
		//hasNext will check either value is present or not
		while(listltr.hasNext()) {
			
			Integer val=listltr.next();
			System.out.println(val);
		}
		
		
		ListIterator<Integer> listltr1=bhavi.listIterator();
while(listltr1.hasNext()) {
			
			Integer val=listltr1.next();
			System.out.println(val);
		}
		
		
	}
public static void main(String[] args) {
	
	
	
	
	
}
}
