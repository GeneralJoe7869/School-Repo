import java.util.Scanner;
public class looper{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);//create scanner
		int number;
		System.out.print("Enter in a number: ");
		number = sc.nextInt();//gets number input from user
		if(number > 3 && number < 30){
			while (number > 3){
				System.out.println(number + " Is a Good number");
				number--;
			}
		}else{
			System.out.println("Invalid like your existence");	
		}
	}

}	
