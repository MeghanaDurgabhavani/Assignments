package com.acc.creatio.crm.language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
System.out.println("Hello");
System.out.println("World");
System.out.append("Meghana").append(" karnam");
System.out.println();
System.out.write(98);
System.out.println();
PrintWriter writer = new PrintWriter("E:\\Automation Training\\AutomationProject\\src\\com\\acc\\creatio\\crm\\language\\basics\\log.txt");
writer.println("Line 14 is executing");
writer.close();
	}

}
