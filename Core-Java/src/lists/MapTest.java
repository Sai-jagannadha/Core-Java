package lists;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(130, "Bhavya");
		map.put(460, "sai");
		map.put(300, "prasanna");
		map.put(430, "chandu");
		map.put(244, "jeevan");
		map.put(133, "sarath bro");
		
		for(Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry);
			
			
		}
	}
	
	
	
	
	
	
	
	
}
