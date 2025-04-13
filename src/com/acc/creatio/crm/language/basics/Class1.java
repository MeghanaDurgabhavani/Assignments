package com.acc.creatio.crm.language.basics;

public class Class1 extends ClassAssignment {

	public static void main(String[] args) {
		
      ClassAssignment obj = new ClassAssignment();
      String[] empnames = new String[3];
      empnames[0] = obj.empname1;
      empnames[1] = obj.empname2;
      empnames[2] = obj.empname3;
      
      int[] empids = new int[3];
      empids[0] = obj.empid1;
      empids[1] = obj.empid2;
      empids[2] = obj.empid3;
      
      System.out.println(obj.empname1+ " " +obj.empid1);
      System.out.println(empnames[1]+ "-" +empids[1]);
      System.out.println(empnames[2]+ ":" +empids[2]);
      
      
	}

}
