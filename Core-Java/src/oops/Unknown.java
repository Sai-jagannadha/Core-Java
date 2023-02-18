package oops;

public class Unknown {
	
public static void main(String[] args) {
	AccHolderDetails amd=new AccHolderDetails(6878,"HARIKA","SBI789",98787);
	System.out.println(amd.accholder);
	System.out.println(amd.accno);
amd.setAccholder("SASIDHAR");
amd.setAccholder("KOUSTHUBHA G");
System.out.println(amd.accholder);
System.out.println(amd.getAccno());
System.out.println(amd.getAccholder());
}
	
}
