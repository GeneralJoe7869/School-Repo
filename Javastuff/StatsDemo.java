/**
Joseph Elias 
 Lab 4 3/5/2026
*/ 
import java.util.Scanner;
import java.io.*; // Task 3
public class StatsDemo{
	public static void main(String[] args) throws IOException //throw stuff
	{
		// add the throws clause for task 3
		// throw stuff at people
		double sum = 0;
		int count = 0;
		double mean = 0;
		double stdDev = 0; //wear a condom
		double number;
		double fine = 0.0;
		String line = "";
		double difference;
		//create scanner object
		Scanner keyboard = new Scanner (System.in);
		String filename; // user input file name
		System.out.println("This program calculates statistics on a file containing a series of numbers.");
		System.out.println("Enter the file name: ");
		filename = keyboard.nextLine();
		File Johnkaisen = new File(filename);//strongest character in jijutsu kasien besides joe jijutsu
		// Task 4
		Scanner freader = new Scanner(Johnkaisen);
	
		System.out.println("How many lines (2003)");
		int input = keyboard.nextInt();//need num for lines
		for (number = input; number > 0; number--){
			line = freader.nextLine().trim();
			try{// have to let fine do its job
			fine = Double.parseDouble(line);
		}
		catch (Exception e){//e
			System.out.println(e);
		}
			sum += fine;
		}
		number = 0;
		freader.close();
		mean = sum/input;//calc the mean
		System.out.println(mean);
		// Task 5
		sum = 0.0;
		Scanner feader = new Scanner(Johnkaisen);
	
		for (number = input; number > 0; number--){
			line = feader.nextLine().trim();
			try{
			fine = Double.parseDouble(line);
		}
		catch (Exception e){
			System.out.println(e);
		}
			double fire = fine - mean;
			
			sum += fire * fire;
			
		}
		stdDev = sum/input;
		stdDev = Math.pow(stdDev, .5);
		
		feader.close();
		System.out.println(stdDev);
		// Task 3
		PrintWriter pwriter = new PrintWriter("Results.txt");
		pwriter.printf("The mean is %.3f\n", mean);
		pwriter.printf("The standard deviation is %.3f\n", stdDev);
		pwriter.close();
	}
}
