package com.acc.creatio.crm.language.basics;

public class Ass10_SortingNums {

	public static void main(String[] args) {
		int[] num = {12 ,34,11,36,87,98,93 };
		int temp = 0;
		for(int s = 0 ; s < num.length ; s++)
{
	for(int l = s + 1 ; l<num.length ; l++ )
	{
		if(num[s] < num[l])
		{
			temp = num[s];
			num[s] = num[l];
			num[l] =temp;
		}
	}
}
System.out.println("Second Largest Number = " +num[1]);
System.out.println("third Largest Number = " +num[2]);
	}

}
