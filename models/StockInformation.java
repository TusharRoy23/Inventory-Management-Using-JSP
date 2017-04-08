package models;

public class StockInformation {
	private String soldItem ="";
	private String date = "";
	private String employeerName = "";
	private String customerName = "";
	private String saleCost = "";
	private String saleQuantity = "";
	
	public String getSaleQuantity() {
		return saleQuantity;
	}
	public void setSaleQuantity(String saleQuantity) {
		this.saleQuantity = saleQuantity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getSaleCost() {
		return saleCost;
	}
	public void setSaleCost(String saleCost) {
		this.saleCost = saleCost;
	}
	public String getSoldItem() {
		return soldItem;
	}
	public void setSoldItem(String soldItem) {
		this.soldItem = soldItem;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmployeerName() {
		return employeerName;
	}
	public void setEmployeerName(String employeerName) {
		this.employeerName = employeerName;
	}
}
