package fileHandling;

import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;



public class CreateInvoice {
	public static void main(String[] args) {
		try {
			Workbook workbook =new Workbook();
				
			Sheet sh=workbook.CreateInvoice("invoices");
			String[] columnHeadings= {"itemId", "ItemName","itemQty","totalPrice","itemSoldDate"};
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	

