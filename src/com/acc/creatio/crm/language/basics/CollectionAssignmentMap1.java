package com.acc.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CollectionAssignmentMap1 {

	public static void main(String[] args) {
		
		Map<String,String> StudentDetailsRow1 = new HashMap<String , String>();
		StudentDetailsRow1.put("Name", "John Doe");
		StudentDetailsRow1.put("Age", "20");
		StudentDetailsRow1.put("Gender", "Male");
		StudentDetailsRow1.put("RollNo.", "S12345");
		StudentDetailsRow1.put("Grade", "A");
		StudentDetailsRow1.put("Major", "Computer Science");
		StudentDetailsRow1.put("GPA", "3.8");
		StudentDetailsRow1.put("Email", "john@example.com");
		StudentDetailsRow1.put("Contact Number", "9876543210");
		StudentDetailsRow1.put("Address", "123 Elm St");
		
		Map<String,String> StudentDetailsRow2 = new HashMap<String , String>();
		StudentDetailsRow2.put("Name", "Jane Smith");
		StudentDetailsRow2.put("Age", "21");
		StudentDetailsRow2.put("Gender", "Female");
		StudentDetailsRow2.put("RollNo.", "S12346");
		StudentDetailsRow2.put("Grade", "B");
		StudentDetailsRow2.put("Major", "Mathematics");
		StudentDetailsRow2.put("GPA", "3.5");
		StudentDetailsRow2.put("Email", "jane@example.com");
		StudentDetailsRow2.put("Contact Number", "9876543211");
		StudentDetailsRow2.put("Address", "456 Oak St");
		
		Map<String,String> StudentDetailsRow3 = new HashMap<String , String>();
		StudentDetailsRow3.put("Name", "Mike Brown");
		StudentDetailsRow3.put("Age", "22");
		StudentDetailsRow3.put("Gender", "Male");
		StudentDetailsRow3.put("RollNo.", "S12347");
		StudentDetailsRow3.put("Grade", "A");
		StudentDetailsRow3.put("Major", "Physics");
		StudentDetailsRow3.put("GPA", "3.9");
		StudentDetailsRow3.put("Email", "mike@example.com");
		StudentDetailsRow3.put("Contact Number", "9876543212");
		StudentDetailsRow3.put("Address", "789 	Pine St");
		
		List<Map<String , String>> StudentDetails = new ArrayList<Map<String , String>>();
		StudentDetails.add(StudentDetailsRow3);
		StudentDetails.add(StudentDetailsRow2);
		StudentDetails.add(StudentDetailsRow1);
		System.out.println(StudentDetailsRow3);
		System.out.println(StudentDetails.get(1).get("Gender"));
		System.out.println(StudentDetailsRow1.size());
		
		Map<String,String> EmployeeDetailsRow1 = new HashMap<String , String>();
		EmployeeDetailsRow1.put("EMP ID", "E001");
		EmployeeDetailsRow1.put("Name", "Alice Green");
		EmployeeDetailsRow1.put("Age", "30");
		EmployeeDetailsRow1.put("Gender", "Female");
		EmployeeDetailsRow1.put("Department.", "Engineering");
		EmployeeDetailsRow1.put("Position", "Software Engineer");
		EmployeeDetailsRow1.put("Salary", "75,000");
		EmployeeDetailsRow1.put("Email", "alice@example.com");
		EmployeeDetailsRow1.put("Contact Number", "9876543213");
		
		Map<String,String> EmployeeDetailsRow2 = new HashMap<String , String>();
		EmployeeDetailsRow2.put("EMP ID", "E002");
		EmployeeDetailsRow2.put("Name", "Bob Johnson");
		EmployeeDetailsRow2.put("Age", "35");
		EmployeeDetailsRow2.put("Gender", "Male");
		EmployeeDetailsRow2.put("Department.", "Marketing");
		EmployeeDetailsRow2.put("Position", "Marketing Manager");
		EmployeeDetailsRow2.put("Salary", "85,000");
		EmployeeDetailsRow2.put("Email", "bob@example.com");
		EmployeeDetailsRow2.put("Contact Number", "9876543214");
		
		Map<String,String> EmployeeDetailsRow3 = new HashMap<String , String>();
		EmployeeDetailsRow3.put("EMP ID", "E003");
		EmployeeDetailsRow3.put("Name", "Carol White");
		EmployeeDetailsRow3.put("Age", "28");
		EmployeeDetailsRow3.put("Gender", "Female");
		EmployeeDetailsRow3.put("Department.", "Sales");
		EmployeeDetailsRow3.put("Position", "Sales Executive");
		EmployeeDetailsRow3.put("Salary", "65,000");
		EmployeeDetailsRow3.put("Email", "carol@example.com");
		EmployeeDetailsRow3.put("Contact Number", "9876543215");
		
		List<Map<String , String>> EmpDetails = new ArrayList<Map<String, String>>();
		EmpDetails.add(EmployeeDetailsRow3);
		EmpDetails.add(EmployeeDetailsRow2);
		EmpDetails.add(EmployeeDetailsRow2);
		System.out.println(EmployeeDetailsRow3);
		System.out.println(EmployeeDetailsRow1);
		System.out.println(EmployeeDetailsRow2);
		
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

		List<Map<String,String>>PrdDetails = new ArrayList<Map<String,String>>();
		PrdDetails.add(PDRow3);
		PrdDetails.add(PDRow2);
		PrdDetails.add(PDRow1);
		System.out.println(PDRow3);
		System.out.println(PDRow2);
		System.out.println(PDRow1);
		
		Map<String , List<Map<String,String>>> Result = new LinkedHashMap<String , List<Map<String,String>>>();
		Result.put("PrdDetails" , PrdDetails);
		System.out.println("/////**** Final Output ****////");
		System.out.println( Result.get("PrdDetails").get(1).get("Supplier"));
		
		
		
		

		

		
/*Employee ID	Name	Age	Gender	Department	Position	Salary	Email	Contact Number
E001	Alice Green	30	Female	Engineering	Software Engineer	75,000	alice@example.com	9876543213
E002	Bob Johnson	35	Male	Marketing	Marketing Manager	85,000	bob@example.com	9876543214
E003	Carol White	28	Female	Sales	Sales Executive	65,000	carol@example.com	9876543215		*/								
		
		

	}

}
