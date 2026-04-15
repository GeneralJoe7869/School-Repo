//Joseph Elias Feb 2 2026
import java.util.Scanner;//calculates user's gross pay

public class Pay
{
	public static void main(String [] args)
	{
		//create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		double pay; //gross pay
		double hours;//hours worked
		double rate;//hourly pay rate
		//display prompts and get input
		System.out.print("How many hours did you work? ");
		hours = keyboard.nextDouble();//user inputs hours
		System.out.print("How much are you paid per hour? ");
		rate = keyboard.nextDouble();//user inpputs rate
		//calculations performed
		if(hours <= 40)
			pay = hours * rate;
		else
			pay = (hours - 40) * (1.5 * rate) + (40 * rate);
		System.out.println("You earned $" + pay);//result
	}

}
