package com.acc.creatio.crm.language.basics;

public class Assignment_ConditionalStatements {

	public static void main(String[] args) {
		
		String CustName = "John Doe";
		int CredScore = 720;
		float income = 55000.0f;
		String JohnDoe = "isEmployed"; 
		int debtToIncomeRatio = 35;
		
		if(CredScore > 750)
		{
			System.out.println("Approve the loan directly");
		}
			else if(CredScore == 750 || CredScore >= 650)
			{
				System.out.println("Yes " +CredScore+ " is CredScore Now ,Check the additional requirement");
				if(income >= 50000.0)
				{
					System.out.println("Yes Incone is " +income+ " Now Check JohnDoe is employed or not");
				}
				else if (income < 50000.0)
				{
					System.out.println("Your loan is denied");
				}
				 if(JohnDoe == "isEmployed" )
				 {
					 System.out.println("Yes John Doe " +JohnDoe+ " Now Check the debtToIncomeRatio");
				 }
				 else if(JohnDoe != "isEmployed")
				 {
				  System.out.println("Your not eligible for loan");
				 }
				 if(debtToIncomeRatio < 40)
				 {
					System.out.println("Yes debtToIncomeRatio is " +debtToIncomeRatio+ ". Congrulations , Your loan is approved");
	
				}
				else
				{
					System.out.println("Sorry Your loan is not approved");
				}
		}
		

	}
}

