package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionsData {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		Collections.sort(list);
		Collections.reverse(list);
		
		//System.out.println(Collections.min(list));
	//	System.out.println(Collections.max(list));
		
		Collections.synchronizedList(list);
			
		
	for(Integer val:list) {
		System.out.println(val);
		
		// Converting arraylist to array
		Object[] objArr=list.toArray();
		
		// Converting array to arraylist
		
		List<Object> listObj= Arrays.asList(objArr);
		
	}
	}
	
	
}
