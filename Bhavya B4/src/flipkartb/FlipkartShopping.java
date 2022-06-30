package flipkartb;

//VARIABLES, METHODS, METHODCALLING, IF CONDITION, DEBUGGING


public class FlipkartShopping {
 double totalPrice;
 double totalCost; // DECLARATION
	public void invoice() {//Method calling
	System.out.println("welcome to flipkart");
	double fashionbill=fashion();
	System.out.println("your fashion bill.."+fashionbill);
	double mobilebill=mobiles();
	System.out.println("your mobilebill is.."+mobilebill);
	double grocerybill=grocery();
	System.out.println("your grocery bill is.."+grocerybill);
	double totalbill=fashionbill+mobilebill+grocerybill;
	System.out.println("your total bill is.."+totalbill);
	System.out.println("-----------------------");
	System.out.println("THANKYOU VISIT AGAIN");
	
	}
	public double fashion() {//instance method
		double kurtis=850.66; //LOCAL VARIABLE
		double palazzo=790.50;
		double dupatta=360.55;
		totalPrice=kurtis+palazzo+dupatta;

		totalCost=gst(totalPrice, Categories.fashion);
		return totalCost;
	}
	public double grocery() {
		double aashirvad=970.55;
		double salt=50.25;
		double chillipowder=650.77;
		totalPrice=aashirvad+salt+chillipowder;
		totalCost=gst(totalPrice, Categories.grocery); // STATIC METHOD CALLING
		return totalCost;
		
		
	}
	public double mobiles() {
		double redMiNote10Pro=19000.50;
		double realMe=15000.00;
		double onePlus=45000.55;
		totalPrice=redMiNote10Pro+realMe+onePlus;
		totalCost=gst(totalPrice, Categories.mobiles);
		return totalCost;

				
	}

	
	public double gst(double totalPrice,String catg) {
		double gstAmt;
		double totalAmtwithgst;
		if(catg.equals("Fashion")) { // IF CONDITION
			gstAmt=totalPrice*0.12; 
			totalAmtwithgst=totalPrice+gstAmt;
			return totalAmtwithgst;
			
		}else if(catg.equals("grocery")) {
			
			System.out.println("grocery bill gst is 12%");
			
			gstAmt=totalPrice*0.12;
			totalAmtwithgst=totalPrice+gstAmt;
			return totalAmtwithgst;
			
		}else if(catg.equals("Mobiles")) {
			System.out.println("mobile bill gst is 12%");
			
			gstAmt=totalPrice*0.12; 
			totalAmtwithgst=totalPrice+gstAmt;
			return totalAmtwithgst;
		
		}else {
			System.out.println("gst is 18%");
			gstAmt=totalPrice*0.18;
			totalAmtwithgst=totalPrice+gstAmt;
			return totalAmtwithgst;
		}
		}
public static void main(String[] args) {
	FlipkartShopping fs=new FlipkartShopping();
	fs.invoice();
}
}

