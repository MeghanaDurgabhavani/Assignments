package com.acc.creatio.crm.language.basics;

public class Assignment_ConditionalStatements_Loops {

	public static void main(String[] args) {
		int[] TransAmount = { 50000, -2000, 3000, -15000, -200, -300, 4000, -3000 };
		
		int TCredits = 0;
		int TDebits = 0;
		int TCreditAmount = 0;
		int TDebitAmount = 0;
		int SusTrans = 0;
		for(int amount : TransAmount )
		{
			if(amount > 0)
			{
				TCredits++;
				TCreditAmount+= amount;
				if (amount > 10000) {
					System.out.println("Suspicious credit transaction Amount: " + amount);
					SusTrans++;
				}
			} else {
				TDebits++; 
				TDebitAmount-= amount; 

				
				if (amount < -10000) {
					System.out.println("Suspicious debit transaction Amount: " + amount);
					SusTrans++;
				}
			}
		}
		
		
		int finalBalance = TCreditAmount - TDebitAmount;

		
		System.out.println("----- Transaction Summary -----");
		System.out.println("Total number of credit transactions: " + TCredits);
		System.out.println("Total number of debit transactions: " + TDebits);
		System.out.println("Total amount credited: " + TCreditAmount);
		System.out.println("Total amount debited: " + TDebitAmount);
		System.out.println("Final remaining amount in the account: " + finalBalance);
		System.out.println("Total number of suspicious transactions: " + SusTrans);
				
			}
			
		
		
	}



