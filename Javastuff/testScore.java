import java.util.Scanner;
public class testScore{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);//create scanner
		String yourName;
		double average = 0;
		double score1;
		double score2;
		System.out.println("What is your name?: ");
		yourName = sc.nextLine();
		System.out.println("Your first test score?: ");
		score1 = sc.nextDouble();
		System.out.println("Your second test score?: ");
		score2 = sc.nextDouble();
		while (score1 <= -1){
			break;
		}
		while (score1 < 10){
			continue;
		}
		while (score1 >= 10){	
			average = average + score1;
		}
		while (score2 <= -1){
			break;
		}
		while (score2 < 10){
			continue;
		}
		while (score2 >= 10){	
			average = average + score2;
		}
		if (average <= 0){
			System.out.println(yourName + " ,try to get a higher score next time, or put in a valid input");
		}else{
			average = average/2;
			System.out.println(yourName + " ,your tests average is: " + average);
		}
	}	
}		
