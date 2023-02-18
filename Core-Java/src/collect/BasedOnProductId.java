package collect;

import java.util.Comparator;

public class BasedOnProductId implements Comparator<TataProducts> {

	@Override
	public int compare(TataProducts o1, TataProducts o2) {
		
		return o1.pid-o2.pid;
	}	
	
	
}
