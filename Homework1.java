//Cole Morrison

import java.util.Scanner;

public class Homework1 {

	public static final int YEAR = 2024;		//creating a constant for the current year
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);	//creating a Scanner object
		
		System.out.println("Please provide the following information:");
		
		System.out.println("Enter your first name:");
		String firstName = key.nextLine();		//having user input their first name
		
		System.out.println("Enter your last name:");
		String lastName = key.nextLine();		//having user input their last name
		
		System.out.println("Enter your age (in years):");
		int age = key.nextInt();				//having user input their age
		key.nextLine();
		
		System.out.println("Enter your phone number (without dashes or parentheses):");
		String phoneNumber = key.nextLine();	//having user input their phone number			
		
		
		System.out.println("Enter your major:");
		String major = key.nextLine();			//having user input their major of study
		
		System.out.println("Enter your year of study (freshman, sophomore, etc.):");
		String academicYear = key.nextLine();	//having user input their year of study
		
		System.out.println("Enter today's date (use format mm/dd/yyyy):");
		String date = key.nextLine();			//having user input today's date
		
		System.out.println("Enter your favorite sport:");
		String favoriteSport = key.nextLine();	//having user input their favorite sport
		
		System.out.println("Enter your favorite season:");
		String favoriteSeason = key.nextLine();	//having user input their favorite season
		
		System.out.println("Enter your favorite music artist:");
		String favoriteArtist = key.nextLine();	//having user input their favorite artist
		
		int birthYear = YEAR - age;		//subtracting age from current year to determine user's birth year
		
		String day = date.substring(3,5);
		String month = date.substring(0,2);
		String year = date.substring(6,10);
		String newDate = day + "." + month + "." + year;
		//converting the date entered to European format
		
		String phoneNumberOne = phoneNumber.substring(0,3);
		String phoneNumberTwo = phoneNumber.substring(3,6);
		String phoneNumberThree = phoneNumber.substring(6,10);
		String newPhoneNumber = "(" + phoneNumberOne + ")" + phoneNumberTwo + "-" + phoneNumberThree;
		//reformatting the entered phone number
		
		System.out.println("Here's a quick intro for " + firstName + " " + lastName + ":");
		System.out.print("\t\"You were born in the year " + birthYear + ". ");
		System.out.print("Your favorite sport is " + favoriteSport);
		System.out.print(", your favorite season is " + favoriteSeason);
		System.out.print(", and your favorite music artist is " + favoriteArtist + ". ");
		System.out.print("You are a " + academicYear + " at USC studying " + major + ". ");
		System.out.print("You can be reached at " + newPhoneNumber + ". ");
		System.out.println("You are now officially a Gamecock!");
		System.out.print("Last Updated: " + newDate);
		//printing the intro for the user
		
		key.close();	}

}
