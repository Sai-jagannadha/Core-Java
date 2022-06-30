package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		
		list.add(7);
		list.add(9);
		list.add(5);
		
		Collections.sort(list); //this is a  Static method, used to sort the data to maintain order. 
		
		for(Integer val:list) {
		System.out.println(val);	
		}
		
		
		
		
	}
}
