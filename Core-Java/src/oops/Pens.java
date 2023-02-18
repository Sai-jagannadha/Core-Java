package oops;
// multiple inheritance

public class Pens implements Novels,Books {
int id=20;
	@Override
	public void champak() {
		
		
	}

	@Override
	public void scarletletter() {
		
		
	}
public static void main(String[] args) {
	Pens p=new Pens();
	System.out.println(p.id);
	
}
}
//class implements interface A,B
//class extends class A only.