package com.hibernate.office;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author aakash.gupta
 *
 */
public class StoreDetails {

	public void storeDetails(Session session) {
		Transaction transaction=session.beginTransaction();
		
		Printers printer1=new Printers();
		printer1.setPrinter_id(1001);
		printer1.setType("Inkjet");
		printer1.setCartridgeType("Color");
		
		Printers printer2=new Printers();
		printer2.setPrinter_id(1002);
		printer2.setType("DotMatrix");
		printer2.setCartridgeType("Black and White");
		
		Map<Integer,Printers> printers=new HashMap<Integer,Printers>(); 
		printers.put(1, printer1);
		printers.put(2, printer2);
		
		Computers computer1=new Computers();
		computer1.setProcessor("i3");
		computer1.setOperatingSystem("Unix");
		computer1.setPrinters(printers);
		
		Computers computer2=new Computers();
		computer2.setProcessor("i5");
		computer2.setOperatingSystem("Windows");
		computer2.setPrinters(printers);
		
		session.persist(computer1);
		session.persist(computer2);
		
		transaction.commit();
		System.out.println("Data has been saved");
	}	
}