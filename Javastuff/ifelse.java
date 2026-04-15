import java.util.Scanner; //need for scanner class
public class ifelse{
	public static void main(String [] args){
		Scanner keyboard = new Scanner (System.in);//object for user input
		System.out.print("Enter a number of your choice. ");
		double num1 = keyboard.nextDouble();//takes in number inputed by user
		double num2 = 420;
		
		if (num1 == 67){
			System.out.println("You are a lost cause. And I am very disapointed in you.");//disapointing
		}else if (num1 < 10){
			System.out.println("Then you are only worth one digit or less.");//cringe
		}else if (num1 == 10){
			System.out.println("You now have 10 men. Do what you wish ig.");//gae or whore
		}else{
			System.out.println("Cool number brother/sister.");//normal ending
		}
		
		if (num1.equals(num2)){
			System.out.println("MORE LEAN");
		}
		else{
			System.out.println("Gug");
		}
		
		
	}
}
