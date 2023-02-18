package collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		
	Map<Integer, String> map=new HashMap<Integer, String>();	
		
			map.put(155, "sam");
	
	        map.put(222, "sin");
	        
	        map.put(666, "Bhav");
	        
	        map.put(980, "reh");
	        
	        map.put(null, "Bhav");
	        
	        map.put(420, null);
	        
	        map.put(null, "sin");
	        
	        for(Entry<Integer, String> data:map.entrySet()) {
	        	
	        	System.out.println(data.getKey()+" "+data.getValue());
	        	
	        }
			
	}
	
	
	
}
