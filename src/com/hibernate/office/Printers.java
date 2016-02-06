package com.hibernate.office;

public class Printers {

	private int printer_id;
	private String type;
	private String cartridgeType;
	public int getPrinter_id() {
		return printer_id;
	}
	public void setPrinter_id(int printer_id) {
		this.printer_id = printer_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCartridgeType() {
		return cartridgeType;
	}
	public void setCartridgeType(String cartridgeType) {
		this.cartridgeType = cartridgeType;
	}
}