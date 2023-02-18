package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Details {

	public static void main(String[] args) throws IOException {
		PersonalDetails pd=null;
		BankDetails bd=null;
		AddressDetails ad=null;
		
		pd=new PersonalDetails(); // IF WE DIDN'T REINTIALISE THE DATA HERE WE'LL GET NULL POINTER EXCEPTION.
		bd=new BankDetails();
		ad=new AddressDetails();
		
	// 	System.out.println("personal details..."+pd.pname+" "+pd.pmail+" "+pd.pmobile);
FileWriter fw=new FileWriter("C:\\Users\\saija_bewaxlr\\Documents\\Filehandling Java\\details.txt"); // file writer is used to provide the address to store the data 

		
		BufferedWriter bw=new BufferedWriter(fw);
		// buffered writer is used to provide buffering in writing so that it will be fast.
		
		bw.write("personal details..."+pd.pname+" "+pd.pmail+" "+pd.pmobile);
		bw.newLine();
		
		Integer balance =50000;
		String s=String.valueOf(balance);
		System.out.println(s);
		bw.write("Bank details..."+bd.accHolder+" "+bd.accno+" "+bd.IFSCcode+" "+bd.balance);
		bw.newLine();
		
		bw.write("address details.."+ad.area+" "+ad.city+" "+ad.district);
		System.out.println("file created");
		bw.close();
	}
}
