package oops;

public class BlocksTesting {

	public BlocksTesting() {
		System.out.println("constructor");
	}
	
	{ //INSTANCE BLOCK
		System.out.println("INSTANCE BLOCK");
	}
	static { // STATIC BLOCK
		System.out.println("STATIC BLOCK"); 
	}

public static void main(String []args) {
	BlocksTesting bt=new BlocksTesting();
	
}
}

// IN A CLASS IF THERE'S A STATIC BLOCK FIRST WE WILL GET STATIC BLOCK OUTPUT EVEN THOUGH WE DIDN'T WRITE IT ON FIRST PLACE
// CONSTRUCTOR OUTPUT WILL BE EXCECUTED AFTER BLOCK OUTPUT