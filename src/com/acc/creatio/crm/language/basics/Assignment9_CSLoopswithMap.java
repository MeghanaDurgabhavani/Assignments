package com.acc.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_CSLoopswithMap {

	public static void main(String[] args) {
	String[] EmpName = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
	Double[] EmpTab1= {75000.0, 5.1, 4.2};
	Double[] EmpTab2 ={68000.0, 3.2, 3.8};
	Double[] EmpTab3 = {82000.0, 7.1, 4.5};
	Double[] EmpTab4 =  {90000.0, 10.2, 2.0};
	Double[] EmpTab5 =  {60000.0, 2.4, 3.5};
	
	Map<String , Double[]> EmpDetails = new HashMap<String , Double[]>();
	EmpDetails.put(EmpName[0] , EmpTab1);
	EmpDetails.put(EmpName[1] , EmpTab2);
	EmpDetails.put(EmpName[2] , EmpTab3);
	EmpDetails.put(EmpName[3] , EmpTab4);
	EmpDetails.put(EmpName[4] , EmpTab5);
	
	 Map<String, Double> hikeMap = new HashMap<>();
	 for (String empHike : EmpName) {
     	
     	
         Double[] Hike = EmpDetails.get(empHike); 
         
         double basicSalary = Hike[0];
         double exp = Hike[1];
         double rating = Hike[2];
         double reward = 0;
         double variablePay;
         double bonus;
         
	
         if (rating >= 4) {
             variablePay= 15;
             bonus = 1500;
         } else if (rating >= 3) {
             variablePay = 10;
             bonus = 1200;
         } else {
             variablePay = 3;
             bonus = 300;
         }

       if (exp >= 5) {
             reward = 5000;
         }

         double hike = (basicSalary * variablePay / 100) + bonus + reward;
         double hikePercentage = (hike / basicSalary) * 100;

         
         hikeMap.put(empHike, hikePercentage);
     }
	 System.out.println("Employee Hike Details:");
     System.out.println(hikeMap);
    
    
 }

}
