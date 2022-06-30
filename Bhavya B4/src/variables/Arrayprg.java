package variables;

public class Arrayprg {
 
int []cost= {455,898,473,908};

public void arraymethod() {
	try {String[] grocery={"uradDal,greenGram,toorDaal"};
	
	System.out.println("array starts..");
	System.out.println(grocery[3]);
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	System.out.println("array ends...");
}

  



public static void main(String[] args) {
	
	Arrayprg ar=new Arrayprg();
	ar.arraymethod();
	
}

}
