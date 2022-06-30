package collect;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	
	public void arrayListTest() {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		 for(Integer val:list) {
			 System.out.println(val);
		 }
	
		 Iterator<Integer> listltr=list.iterator();
			//hasNext will check either value is present or not
			while(listltr.hasNext()) {
				
				Integer val=listltr.next();
				System.out.println(val);
			}
			
	
//		System.out.println("=================");
//		while(listltr.hasPrevious()) {
//			Integer val=((list) listltr).previous();
//			System.out.println(val);
//		}
//		
//		
		
		
		
		}
		public void linkedListTest() {
			LinkedList<Integer> li=new LinkedList<Integer>();
			li.add(11);
			li.add(67);
			li.add(89);
			li.add(17);
			li.add(2,18);
			
			for(Integer val:li) {
				System.out.println(val);
			}
			
		}
		public void vectorTest() {
			Vector<Integer> li=new Vector<Integer>();
			li.add(13);
			li.add(56);
			li.add(89);
			li.add(90);
			//for (Integer val:li) {
				//System.out.println(val);
			//}
			Enumeration<Integer> enm=li.elements();
			while(enm.hasMoreElements()) {
				Integer val=enm.nextElement();
				System.out.println(val);
			}
			
			
			
			
		}
		
		public void stackTest() {
			Stack<Integer> s=new Stack<Integer>();
			s.push(12);
			s.push(67);
			s.push(90);
			s.push(78); // Last in first out
			s.pop(); // pop() is used to remove the value
			//System.out.println("==="+s.peek()); // peek is used to display the value that will be removed next.
			//for(Integer val:s) {
				//System.out.println(val);
			}
		//}
		
	//}
	
	
	public static void main(String[] args) {
		
		ListTest It=new ListTest();
		//It.arrayListTest();
		//It.linkedListTest();
		//It.stackTest();
		It.vectorTest();
		
	}

}
