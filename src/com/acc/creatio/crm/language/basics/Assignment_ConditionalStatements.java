package com.acc.creatio.crm.language.basics;

public class Assignment_ConditionalStatements {

	public static void main(String[] args) {
		
		//String CustName = "John Doe";
		int CredScore = 720;
		float income = 55000.0f;
		int debtToIncomeRatio = 35;
		boolean isEmployed = true;
		
		if(CredScore > 750)
		{
			System.out.println("Approve the loan directly");
		}
			else if( CredScore >= 650)
			{
				System.out.println("Yes " +CredScore+ " is CredScore Now ,Check the additional requirement");
				if(income >= 50000.0)
				{
					System.out.println("Yes Income is " +income+ " Now Check JohnDoe is employed or not");
				}
				else if (income < 50000.0)
				{
					System.out.println("Your loan is denied");
				}
				 if(isEmployed)
				 {
					 System.out.println("Now Check the debtToIncomeRatio");
				 }
				 else {
					 System.out.println("Loan denied");
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

