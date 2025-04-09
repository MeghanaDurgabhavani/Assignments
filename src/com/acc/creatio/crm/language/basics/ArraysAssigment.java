package com.acc.creatio.crm.language.basics;

public class ArraysAssigment {

	public static void main(String[] args) {
		String[][][] college = new String[5][2][6];
		
		college[1][0][3] ="BasicElectronics";
		college[1][0][4] ="  EngineeringPhysics";
		college[3][0][2] = "DatabaseSystems";
		college[3][1][2] = " Fail(19)";
		college[3][0][5] = "SoftwareEngineering";
		college[3][1][5] = " Pass(87)";
		System.out.println(college[1][0][3] +college[1][0][4]);
		System.out.println(college[3][0][2] +college[3][1][2]);
		System.out.println(college[3][0][5] +college[3][1][5]);
	}

}
