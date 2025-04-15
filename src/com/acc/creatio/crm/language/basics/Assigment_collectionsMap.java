package com.acc.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assigment_collectionsMap {

	public static void main(String[] args) {
		
		Map<String , String> PDRow1 = new HashMap<String , String>();
		PDRow1.put("PD", "P001");
		PDRow1.put("Name", "Laptop");
		PDRow1.put("Category", "Electronics");
		PDRow1.put("Price", "$1,200");
		PDRow1.put("SQ", "50");
		PDRow1.put("Supplier", "TechSupplies");
		PDRow1.put("Waranty", "2years");
		PDRow1.put("Rating", "4.5");
		PDRow1.put("MFD", "1/15/2023");
		PDRow1.put("Exp", "1/15/2025");
		
		Map<String , String> PDRow2 = new HashMap<String , String>();
		PDRow2.put("PD", "P002");
		PDRow2.put("Name", "DeskChair");
		PDRow2.put("Category", "Furniture");
		PDRow2.put("Price", "$150");
		PDRow2.put("SQ", "100");
		PDRow2.put("Supplier", "Office Depot");
		PDRow2.put("Waranty", "1year");
		PDRow2.put("Rating", "4");
		PDRow2.put("MFD", "2/10/2023");
		PDRow2.put("Exp", "N/A");
		
		Map<String , String> PDRow3 = new HashMap<String , String>();
		PDRow3.put("PD", "P003");
		PDRow3.put("Name", "Koffee Maker");
		PDRow3.put("Category", "Kitchen");
		PDRow3.put("Price", "$75");
		PDRow3.put("SQ", "200");
		PDRow3.put("Supplier", "Kitchen World");
		PDRow3.put("Waranty", "6months");
		PDRow3.put("Rating", "4.2");
		PDRow3.put("MFD", "3/20/2023");
		PDRow3.put("Exp", "3/20/2025");
		
		System.out.println(PDRow2.get("Supplier"));
		
	}

}
