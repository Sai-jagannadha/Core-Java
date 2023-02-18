package testcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedTest {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(7);
		list.add(15);
		list.add(5);
		list.add(9);
		
		
		Collections.sort(list);
		
		for(Integer val: list) {
			System.out.println(val);
		}

	}

}
