package fileHandling;

import java.sql.Date;
import java.time.LocalDate;

public class Invoice {

	String itemName;
	Integer itemId;
	Integer itemQty;
	double totalPrice;
	Date itemSoldDate;
	public Invoice(String itemName, Integer itemId, Integer itemQty, double totalPrice, Date itemSoldDate) {
		super();
		this.itemName = itemName;
		this.itemId = itemId;
		this.itemQty = itemQty;
		this.totalPrice = totalPrice;
		this.itemSoldDate = itemSoldDate;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getItemQty() {
		return itemQty;
	}
	public void setItemQty(Integer itemQty) {
		this.itemQty = itemQty;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getItemSoldDate() {
		return itemSoldDate;
	}
	public void setItemSoldDate(Date itemSoldDate) {
		this.itemSoldDate = itemSoldDate;
	}
	
	
}