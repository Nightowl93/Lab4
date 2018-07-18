package co.grandcircus.Lab4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		//Declares variables
		Scanner scnr = new Scanner(System.in);
		int userInt;
		int intCubed;
		int intSquared;
		boolean keepGoing = true;
		String userResponse;
		
		//Welcomes user
		System.out.println("Let's learn our squares and cubes!");
		
		//Reiterates until user wishes to stop
		while (keepGoing == true) {
			
			//Prompts user for an integer until a valid number is entered
			do {
				System.out.println("Please enter an integer: ");
				userInt = scnr.nextInt();
				
				//Relays error message to user if invalid number is entered
				if (userInt < 1) {
					System.out.println("Invalid Entry. Number must be an integer 1 or greater.");
				}
			}
			while (userInt < 1);
					
				//Sets up heading/top of squares and cubes table, left aligned
			System.out.printf("%-10s %-10s %-10s","Number","Squared","Cubed");
			System.out.println();
			System.out.printf("%-10s %-10s %-10s", "=======", "=======", "=======");
			System.out.println();
					
			//Loops through and calculates squares and cubes of all values from 1 to user int
			for (int i = 1; i <= userInt; i++) {
				intSquared = i * i;
				intCubed = i * i * i;
				
				//Prints in a left-aligned table format the results of the above calculations
				System.out.printf("%-10s %-10s %-10s", i, intSquared, intCubed);
				System.out.println();
				}
	
			System.out.println("Would you like to continue learning? (y/n)");
			userResponse = scnr.next();
			
			if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
				System.out.println("Thank you for learning with me! Goodbye :)");
			}
		}
		
		//Closes scanner to prevent any memory leaks
		scnr.close();
		
		}
}
