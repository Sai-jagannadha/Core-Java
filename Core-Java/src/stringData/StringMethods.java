package stringData;

public class StringMethods {

	
	public static void main(String[] args) {
		String s="Bhavya";
		System.out.println(s.concat(" Harika")); // we use concat to add
		System.out.println(s.charAt(2)); // show the index of given data (starts from 0)
		System.out.println(s.contains("av")); // to check the characters present or not.
		System.out.println(s.endsWith("a")); // to check the ending letter
		System.out.println(s.equals("bhavya")); // false because the Upper case doesn't match
        System.out.println(s.equalsIgnoreCase("bhavya"));// to ignore upper and lower case
        System.out.println(s.hashCode());// check the hashcode
        System.out.println(s.indexOf("v")); // check the index no (starts from 0)
        System.out.println(s.isEmpty());// to check whether the string is empty /not.
        System.out.println(s.length()); // to check the length
       // System.out.println(s.replace("a", "b")); // replace the values
        System.out.println(s.startsWith("B")); // to check the first letter.
        System.out.println(s.toLowerCase()); // changes it into lowercase.
        System.out.println(s.toUpperCase());// changes all letters to upper case.
       // char[] ch=s.toCharArray(); // changes string to char array.
     int i=10;
       String intData=String.valueOf(i); // to change any data type to String. 
        System.out.println(intData);
        
       
        
	}

}
