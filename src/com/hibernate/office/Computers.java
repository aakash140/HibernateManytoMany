package com.hibernate.office;

import java.util.Map;

public class Computers {

	private int pc_id;
	private String processor;
	private String operatingSystem;
	private Map<Integer,Printers> printers;
	public int getPc_id() {
		return pc_id;
	}
	public void setPc_id(int pc_id) {
		this.pc_id = pc_id;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public Map<Integer, Printers> getPrinters() {
		return printers;
	}
	public void setPrinters(Map<Integer, Printers> printers) {
		this.printers = printers;
	}
}