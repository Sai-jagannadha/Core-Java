package lists;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import com.itextpdf.text.pdf.hyphenation.TernaryTree.Iterator;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer, String> biba=new ConcurrentHashMap<Integer, String>();
		biba.put(30, "W");
		biba.put(22, "US POLO");
		biba.put(45, "Libas");
		biba.put(20, "vishudh");
		biba.put(null, "Mango");
		
		
for(Entry<Integer, String> ramya:biba.entrySet()) {
		System.out.println(ramya.getKey()+" "+ramya.getValue());
		
	}
	}
}
