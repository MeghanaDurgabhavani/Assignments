package com.acc.creatio.crm.language.basics;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Temperature of a city in degrees Celsius: 25.5
				float temp = 25.5f ;
				System.out.println("Temperature of a city is " +temp);
		
				/* Whether a customer has placed an order: true or false
				 * yes the customer placed order so declaring variable as true
				 */
				boolean order = true ;
				System.out.println("Order Placement is " +order);
				
				//Person's phone number: "123-456-7890" which it contains - symbol so we consider it as string
				String phno = "123-456-7890";
				System.out.println("Person's phone number: " +phno);
				
				/*Amount of money in a customer's bank account: 1000.50
				 * so here its decimal number with only two digits 
				 * so we can declare float
				 */
				float bal = 1000.50f ;
				System.out.println("Balance amount is " +bal);
				
				/*Person's email address: "john.doe@example.com"
				 * the email address contains lots of special characters so 
				 * here we need to declare data type as string
				 */
				String email = "john.doe@example.com";
				System.out.println("Email Address is " +email);
				
				/**Coordinates of a location (latitude, longitude): 37.7749, -122.4194
				 * here we can see the decimal points are higher than 2 digits 
				 * and also here we have both latitude and longitude 
				 * so here we need to declare two data types which are double
				 */
				double lat = 37.7749d;
				double lon = -122.4194d;
				System.out.println("latitude = " +lat);
				System.out.println("longitude = " +lon);
				
				/*Person's Martial status: true or false
				 * lets declare two boolean values and 
				 * print if it is female means true 
				 * or else if it is male means false
				 */
				boolean female = true;
				boolean male = false;
				System.out.println("Person's marital status is female so " +female);
				System.out.println("Person's marital status is male so " +male);
				
				/**Person's occupation: "Software Engineer" so here we can use string as data type
				 * 17.Name of a country: "United States"
				 * here I'm appending occupation and name of a country is like as working location
				 * 10.Current year: 2023 - this also naming as current year of working as software engineer
				 * 19.Person's birthplace: "New York City" this as persons birthplace
				 * so using append and also using string data type for all the names
				 * 
				 * later on 20.Distance between two cities: 200.5 
				 * making this sentence as distance between working location and birthplace
				 * by declaring this with float data type
				 * 
				 * final statement i want to concatenate is Person's occupation is Software Engineer, 
				 * Working Location is United States and Current working year is 2023 But his birth place is New York City

				 */
					String occ =  "Software Engineer";
					String loc =  "United States";
					String year = "2023";
					String birth = "New York City";
					float dis = 200.5f;
					System.out.append("Person's occupation is " +occ).append(", Working Location is " +loc).append
					(" and Current working year is " +year).append(" But his birth place is " +birth)
					.append(" as the distance between two cities is " +dis  );
					System.out.println();
					
					/*Person's favourite colour: "Blue"  
					 * 18.Person's eye color: "Brown"
					 * Like above im using append to concat the both sentences
					 */
					String favcol = "Blue";
					String eyecol = "Brown";
					System.out.append("Person's Fav colors is " +favcol).append(", But his eye color is " +eyecol);
					System.out.println();
					
					
					 /*11.Number of followers on a social media platform: 1,000,000 - used string as 
						 * datatype because it contains ,
						 */
					String followers = "1,000,000";
					System.out.println("Number of followers on a social media platform are " +followers);
					 
					//12.Rating of a movie: 7.5 used float as data type because of digit
					float rating = 7.5f;
					System.out.println("Movie Rating " +rating);
					
					/*13.Person's blood type: 'A'
					  * I was taken Ascii value of A and declared data type as char
					  * As 'A' ascill value is 65
					  */
					char bloodtype = 65;
					System.out.println("Person's blood type: " +bloodtype);
					
					//14.Title of a book: "To Kill a Mockingbird" declared string as data type
					String book = "To Kill a Mockingbird";
					System.out.println("Title of a book: " +book);
					
					//15.Number of employees in a company: 500	as it is a number declared int as data type
					int employees = 500;
					System.out.println("Number of employees in a company are "+employees);
					
					 /*16.Time of an event: 2:30 PM
					  * though it contains numbers and letters declared as string 
					  * because its containing special character 
					 */
					String time = "2:30 PM";
					System.out.println("Time of an event is " +time);
				
				
				
				
				
				
				
				
	}

}
