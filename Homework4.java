//Cole Morrison

import java.util.Scanner;

public class Homework4 {
	
	public static final double PI = 3.14;		//declaring a constant value for pi

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);		//creating a Scanner object
		
		System.out.println("How many circles would you like to store?");
		int circleCount = key.nextInt();				//user enters the number of circles they want to store
		boolean validSize = false;
		while(!validSize) {
			 if(circleCount > 0) {		//input validation for number of circles entered
				 validSize = true;		//if 0 or a negative number is entered, the user is prompted for a new number
			 } else {
				 System.out.println("Invalid dataset size entered. Please enter a new number:");
				 circleCount = key.nextInt();
			 }
		 }
		double[] circles = new double[circleCount];		//an array of the given length is created
		
		for(int i = 1; i <= circleCount; i++) {
			System.out.println("Enter the radius of circle " + i + ":");		//user enters radius of each circle
			circles[i-1] = key.nextDouble();						
			if(circles[i-1] >= 0) {
				circles[i-1] = area(circles[i-1]);			//radius of each circle is converted to area
			} else {												//if an invalid (negative) radius is entered,
				System.out.println("Invalid value entered.");		//user is prompted to reenter radius
				i--;
			}
		}
		
		boolean exit = false;
		
		while(!exit) {
			
			System.out.println("Which of the following would you like to do? Enter the number corresponding with your choice.");
			System.out.println("1: Display the circles\' areas from smallest to largest");
			System.out.println("2: Display the circles\' areas from largest to smallest");
			System.out.println("3: Display all unique circles\' areas in the collection");
			System.out.println("4: Quit the program");
			int choice = key.nextInt();
			
			switch(choice) {
			case 1:
				option1(circles, circleCount);		//calls method to sort array from smallest to largest
				break;
			case 2:
				option2(circles, circleCount);		//calls method to sort array from largest to smallest
				break;
			case 3:
				option3(circles, circleCount);		//calls method to display only unique areas
				break;
			case 4:
				exit = true;						//exits the loop and the program ends
				break;
			default:
				System.out.println("You did not choose an option. Make sure to enter just the number of your choice.");
			}
		}
		key.close();
	}
	
	public static double area(double radius) {
		return radius * radius * PI;			//method that returns the area of a circle of a given radius
	}	
	
	public static void option1(double[] circles, int circleCount) {
	//method that sorts areas from smallest to largest
		for(int i = 0; i < circleCount; i++) {
			int minIndex = i;
			double smallest = circles[i];
			
			for(int j = i+1; j < circleCount; j++) {
				if(circles[j] < smallest) {
					smallest = circles[j];
					minIndex = j;
				}
				if(smallest < circles[i]) {
					double temp = circles[i];
					circles[i] = circles[minIndex];
					circles[minIndex] = temp;
				}
			}
		}
		for(int i = 0; i < circleCount; i++) {
			System.out.print(circles[i] + " ");
		}
		System.out.println();		//prints newly ordered array
	}
	
	public static void option2(double[] circles, int circleCount) {
		//method that sorts areas from largest to smallest
		 for(int i = 0; i < circleCount; i++) {
				int maxIndex = i;
				double largest = circles[i];
				
				for(int j = i+1; j < circleCount; j++) {
					if(circles[j] > largest) {
						largest = circles[j];
						maxIndex = j;
					}
					if(largest > circles[i]) {
						double temp = circles[i];
						circles[i] = circles[maxIndex];
						circles[maxIndex] = temp;
					}
				}
			}
		for(int i = 0; i < circleCount; i++) {
			System.out.print(circles[i] + " ");
		}
		System.out.println();			//prints newly ordered list
	}
	
	public static void option3(double[] circles, int circleCount) {
	//method to display only unique area values
		for(int i = 0; i < circleCount; i++) {
			boolean unique = true;
			for(int j = i-1; j >= 0; j--) {
				if(circles[j] == circles[i]) {
					unique = false;
				}
			}
			if(unique) {
				System.out.print(circles[i] + " ");
			}
		}	
		System.out.println();
	}
}