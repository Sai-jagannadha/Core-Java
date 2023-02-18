package stringData;

public class StringRevers {

	public static void main(String[] args) {
		String str="Garimella";
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println(reverse);
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		StringBuilder sbu=new StringBuilder(str);
	System.out.println(sbu.reverse());
	}
}
