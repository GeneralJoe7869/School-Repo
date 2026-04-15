/**Joseph Elias 2/26/2026
*/

import java.util.Scanner; //need for scanner class
public class Mileage{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);//create scanner
		double milesDriven;
		double gasUsed;
		double milesPerGallon;
		System.out.println("This program wll calcualte mileage.");
		System.out.println("How many miles have you driven?: ");
		milesDriven = sc.nextDouble();
		System.out.println("How many gallons of gas did you use?: ");
		gasUsed = sc.nextDouble();
		milesPerGallon = gasUsed/milesDriven;
		System.out.println("Your miles per gallon is: "+ milesPerGallon);	
	}
}
