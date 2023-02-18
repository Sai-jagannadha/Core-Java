package collect;

import java.util.Comparator;

public class BasedOnCost implements Comparator<TataProducts> {

	@Override
	public int compare(TataProducts o1, TataProducts o2) {
		
		return (int) (o1.cost-o2.cost);
	}

}
