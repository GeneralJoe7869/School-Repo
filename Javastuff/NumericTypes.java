import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args){
		
		final int NUMBER = 2;	 //Number of scores
		final int SCORE1 = 100;	//First  test Score
		final int SCORE2 = 95;	//Second test score
		final int BOILING_IN_F = 212;	//Boiling temperature
		double fToC;                     // Temperature Celsius
		double average;               // Arithmetic average
		String output;                // Line of output

      // TASK #2 declare variables used here
		Scanner keyboard = new Scanner (System.in);
		String firstName;
		String lastName;
		String fullName;
      // TASK #3 declare variables used here
		char firstInitial;
		char lastInitial;
      // TASK #4 declare variables used here
		double diameter;
		double radius;
		double volume;

      // Find an arithmetic average.
		average = (SCORE1 + SCORE2) / NUMBER;
		output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
		System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
		
		fToC = 5.0/9.0 * (BOILING_IN_F - 32) ;
		System.out.println(fToC);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      	System.out.println("What is your first name? "); // Prompt the user for first name     
      	firstName = keyboard.nextLine(); // Read the user's first name
      	System.out.println("What is your last name? "); // Prompt the user for last name
      	lastName = keyboard.nextLine(); // Read the user's last name
      	fullName = firstName + " " + lastName; // Concatenate the user's first and last names
      	System.out.println(fullName); // Print out the user's full name


    

		System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
		firstInitial = firstName.charAt(0);	// Get the first character from the user's first name
		System.out.println(firstInitial);// Print out the user's first initial
		lastInitial = lastName.charAt(0);
		System.out.println(lastInitial);
		fullName = fullName.toUpperCase();// Convert the user's full name to uppercase
		System.out.println(fullName);// Print out the user's full name in uppercase

		System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
		System.out.println("Enter a diameter of a sphere: ");// Prompt the user for a diameter of a sphere
		diameter = keyboard.nextInt();// Read the diameter
		radius = diameter/2;// Calculate the radius
		volume = (4/3)*Math.PI*Math.pow(radius, 3.0);// Calculate the volume
		System.out.println("The volume is: " + volume);// Print out the volume
   }
}
