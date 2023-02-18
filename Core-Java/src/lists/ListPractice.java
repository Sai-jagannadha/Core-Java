package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListPractice {
	
	public void arrayList() {
		List<Integer> bhavi=new ArrayList<Integer>();
		bhavi.add(10);
		bhavi.add(15);
		bhavi.add(20);
		bhavi.add(30);
		
		for(Integer data1:bhavi) {
			System.out.println(data1);
		}
	}
	public void linkedList() {
		List<String> leo=new LinkedList<String>();
		leo.add("Kousthubha");
		leo.add("Bhavya");
		leo.add("samee");
		leo.add("sindhu");
		
		for(String data2:leo) {
			System.out.println(data2);
		}
	}

	public void vector() {
		Vector<Integer> sin=new Vector<Integer>();
		sin.add(03);
		sin.add(23);
		sin.add(20);
		sin.add(29);
		sin.add(22);
		
		for(Integer data3:sin) {
			System.out.println(data3);
		}
	}
	public void stack() {
		Stack<Integer> sam=new Stack<Integer>();
		sam.push(13);
		sam.push(20);
		sam.pop();
		sam.peek();
		
		for(Integer data3:sam) {
			System.out.println(sam);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		ListPractice lp=new ListPractice();
		lp.arrayList();
		lp.linkedList();
		lp.vector();
		lp.stack();
	}

}
