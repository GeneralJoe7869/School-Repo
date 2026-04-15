/**
 Joseph Elias 3/5/2026
 Lab 4
 */
import java.util.Random; //Need for gambling
public class DiceSimulation {
	public static void main(String[] args){
		final int NUMBER = 1000; // the number of dice rolls
		//a random number generator used in Simulating the rooling of dice
		Random generator = new Random();
		//variables for dice values and counts the numbers it lands on 
		int die1Value;
		int die2Value;
		int count = 0;
		int snakeEyes = 0;
		int twos = 0;
		int threes = 0; // bro think he on the team
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		// TASK 1 (and 2 is here ig)
		die1Value = generator.nextInt(1,7);
		die2Value = generator.nextInt(1,7);
		while (count < 1000){
			die1Value = generator.nextInt(1,7);
			die2Value = generator.nextInt(1,7);
			if (die1Value == 1){
				if (die2Value == 1){
					snakeEyes++;
				}
			}else if (die1Value == 2){
				die1Value = generator.nextInt(1,7);
				die2Value = generator.nextInt(1,7);
				if (die2Value == 2){
					twos++;
				}
			}else if (die1Value == 3){
				die1Value = generator.nextInt(1,7);
				die2Value = generator.nextInt(1,7);
				if (die2Value == 3){
					threes++;
				}
			}else if (die1Value == 4){
				die1Value = generator.nextInt(1,7);
				die2Value = generator.nextInt(1,7);
				if (die2Value == 4){
					fours++;
				}
			}else if (die1Value == 5){
				die1Value = generator.nextInt(1,7);
				die2Value = generator.nextInt(1,7);
				if (die2Value == 5){
					fives++;
				}
			}else if (die1Value == 6){
				die1Value = generator.nextInt(1,7);
				die2Value = generator.nextInt(1,7);
				if (die2Value == 6){
					sixes++;
				}
			}
			count++;//it turns out (1,6) doesn't include 6
		}
		//Results
		System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
		System.out.println("You rolled double twos " + twos + " out of " + count + " rolls.");
		System.out.println("You rolled double threes " + threes + " out of " + count + " rolls.");
		System.out.println("You rolled double fours " + fours + " out of " + count + " rolls.");
		System.out.println("You rolled double fives " + fives + " out of " + count + " rolls.");
		System.out.println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
	}
}
