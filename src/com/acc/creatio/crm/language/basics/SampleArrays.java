package com.acc.creatio.crm.language.basics;

public class SampleArrays {

	public static void main(String[] args) {
		/** Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th value**/
		int[] numbers = new int[11];
		numbers[00] = 1;
		numbers[01] = 5;
		numbers[02] = 6;
		numbers[03] = 8;
		numbers[04] = 2;
		numbers[05] = 4;
		numbers[06] = 7;
		numbers[07] = 9;
		numbers[8] = 3;//Hi @Bharath shall i know why this below 2lines are coming as error.
		numbers[9] = 10;
		// average of two numbers index[03] and index[05] = 
		System.out.println(numbers[07]+ " " +numbers[10]);
	}

}
