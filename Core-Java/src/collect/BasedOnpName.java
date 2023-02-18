package collect;

import java.util.Comparator;

public class BasedOnpName implements Comparator<TataProducts>{

	@Override
	public int compare(TataProducts o1, TataProducts o2) {
		
		return o1.pName.compareTo(o2.pName);
	}

	
}
