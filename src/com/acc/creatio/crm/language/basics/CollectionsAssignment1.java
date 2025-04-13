package com.acc.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class CollectionsAssignment1 {

	public static void main(String[] args) {
		
		/********** Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined***/
		
		/**Top1 = Vijayawada with area 1400km
		 * Top2 = Vizag with area 1300km
		 * Top3 = Hyderabad with are 1200km
		 * Top4 = Banglore with area 1100km
		 * Top5 = Chennai with area 1000km
		 * Total area of 3rd and 4th cities are 1150km
		 */
		
		
		List<String> LargeCities = new ArrayList<String>();
		 LargeCities.add("1400Km"); //Vijayawada
		 LargeCities.add("1300Km"); //Vizag
		 LargeCities.add("1200Km"); //Hyderabad
		 LargeCities.add("1100Km"); //Banglore
		 LargeCities.add("1000Km"); //Chennai
		 System.out.println("/********** Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined***/");
		 System.out.println(" Total Area of 3rd and 4th Large Cities are 2300");
		 
		/** Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.**/
		 List<String> LargeCities1 = new ArrayList<String>();
		 LargeCities1.add("Vijayawada"); 
		 LargeCities1.add("Vizag"); 
		 LargeCities1.add("Hyderabad"); 
		 LargeCities1.add("Banglore"); 
		 LargeCities1.add("Chennai"); 
		 System.out.println("/** Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.**/");
		 System.out.println(LargeCities1);
		 System.out.println("Num of top10 most visited tourist attractions in the world are = " +LargeCities1.size());
		 
		 
		 /**Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.**/
		 
		 List<String> Movies = new ArrayList<String>();
		 Movies.add("Bahubali Part1");//top2
		 Movies.add("RRR");//top3
		 Movies.add("Bahubali Part2");//top1
		 Movies.add("Eega"); // top4
		 Movies.add("Pushpa");//top5
		 System.out.println("/**Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.**/");
		 System.out.println("The Top3 Movie in the List is " +Movies.get(01));

	}

}
