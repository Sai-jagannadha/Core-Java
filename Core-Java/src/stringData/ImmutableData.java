package stringData;

public final class ImmutableData {
	private final int id;
	private final String name;
	public ImmutableData(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Immutable [id=" + id + ", name=" + name + "]";
	}
public static void main(String[] args) {
	ImmutableData im=new ImmutableData(20, "Sai");
	
	System.out.println(im);
}
	
}


