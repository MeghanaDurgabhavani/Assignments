package com.acc.creatio.crm.language.basics;

public class Assignement_Operators {

	public static void main(String[] args) {
	
		
		String[] StudenetNames = {"Suresh","Mahesh","Naresh"};
		int[] Marks = {75, 80, 82};
		
		Marks[0]+=10;
		Marks[1]+=10;
		Marks[2]+=10;
		
		int[] Result = { Marks[0] + Marks[1] + Marks[2]} ;
		int Avg = Result[0]/2 ;
		System.out.println( Avg);
		
	 
	}

}
