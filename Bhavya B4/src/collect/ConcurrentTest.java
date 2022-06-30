package collect;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentTest {
	
	public static void main(String[] args) {
		Set<Integer> set=new CopyOnWriteArraySet<Integer>();
		set.add(13);
		set.add(14);
		set.add(15);
	for(Integer val:set) {
		System.out.println(val);
		set.add(17);
		
	}
		System.out.println(set);
	
		
	}
	
	public static void main1(String[] args) {
		List<Integer> list=new CopyOnWriteArrayList<Integer>();
		list.add(12);
		list.add(15);
		list.add(17);
		
		for(Integer val:list) {
			System.out.println(val);
			list.add(19);
			
		}
		
		System.out.println(list);
	}

	public static void main2(String[] args) {
		Map<String,String> map=new ConcurrentHashMap<String, String>();
		map.put("B", "123");
		map.put("A", "456");
		map.put("c", "567");
		map.put("H", "543");
		
		// Collections.synchronizedMap(map);
		
		for(Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			map.put("E", "898");
			
		}
		System.out.println("after adding we get..."+map);
	}
	
	// it is synchronized and thread safe.
	
}
