package modifiers2;

public interface  D {
	public int id=10;
	public default void aTest() {
	System.out.println("A Test method...");
	}
	
}
