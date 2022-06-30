package fileHandling;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfConverter {
	public static void main(String[] args) {
		PersonalDetails pd=null;
		
		
		
		
		
		
		
		
		
		
		
		
		BankDetails bd=null;
		AddressDetails ad=null;
		
		pd=new PersonalDetails(); // IF WE DIDN'T REINTIALISE THE DATA HERE WE'LL GET NULL POINTER EXCEPTION.
		bd=new BankDetails();
		ad=new AddressDetails();
	

	try {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("C:\\\\Users\\\\saija_bewaxlr\\\\Documents\\\\Filehandling Java\\\\coverters.pdf"));
        document.open();
        // Left
        Paragraph paragraph = new Paragraph("personal details..."+pd.pname+" "+pd.pmail+" "+pd.pmobile);
        paragraph.setAlignment(Element.ALIGN_RIGHT);
        document.add(paragraph);
        // Centered
        paragraph = new Paragraph("Bank details..."+bd.accHolder+" "+bd.accno+" "+bd.IFSCcode+" "+bd.balance);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);
        // Left
        paragraph = new Paragraph("address details.."+ad.area+" "+ad.city+" "+ad.district);
        paragraph.setAlignment(Element.ALIGN_LEFT);
        document.add(paragraph);
        // Left with indentation
        paragraph = new Paragraph(
                "This is left aligned text with indentation");
        paragraph.setAlignment(Element.ALIGN_LEFT);
        paragraph.setIndentationLeft(50);
        document.add(paragraph);

        document.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
