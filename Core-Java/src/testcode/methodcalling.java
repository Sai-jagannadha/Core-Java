package testcode;

public class methodcalling {

double totalamt;
double totalcost;

public double fresh() {
	int tomatoes=78;
	int aaloo=89;
	int chillies=45;
	totalamt=tomatoes+aaloo+chillies;
	System.out.println(homedecor());
	return totalamt;
	
}
public double homedecor() {
	int wallpaper=900;
	int clock=300;
	int photos=780;
	totalcost=wallpaper+clock+photos;
	return totalcost;
}

public static void main(String[] args) {
	methodcalling mc=new methodcalling();
	mc.fresh();
	System.out.println(mc.fresh());
	//System.out.println(mc.homedecor());
}
	
	
}
