package collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest1 {

	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<Integer, String>();
	
	map.put(78, "amma");
	map.put(67, "nanna");
	map.put(890," balu");
	map.put(45, "pavan");
	map.put(null, "balu ");
	map.put(67, null);
	map.put(896, null);
	
	for(Entry<Integer, String> data:map.entrySet()) {
		
		System.out.println(data.getKey()+"   "+data.getValue());
		
	}
		
	//IT SELECTS HASHBUCKET ADDRESS BY HASHCODE/ LOAD FACTOR -default load factor is 0.75f;
		
		
		
	}
	
	
	
}
