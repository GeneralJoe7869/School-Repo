import java.util.Scanner;

	public class PizzaOrder
	{
		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner (System.in);//create object
			//variables
			String firstName;
			boolean discount = false;
			int inches;
			char crustType;
			String crust = "Hand-tossed";
			double cost = 12.99;
			final double TAX_RATE = .08;
			double tax;
			char choice;
			String input;
			String toppings = "Cheese ";
			int numberOfToppings = 0;
			//name input
			System.out.print("Welcome to mike and Diane's Pizza.");
			System.out.println(" Please enter your first name: ");
			firstName = keyboard.nextLine();
			//checks for discount
			if (firstName == "Jogoat"){
				discount = true;
			}
			//pizza size
			System.out.println("Pizza Size (inches)	 Cost");
			System.out.println("	10		$10.99");
			System.out.println("	12		$12.99");
			System.out.println("	14		$14.99");
			System.out.println("	16		$16.99");
			System.out.println("What size pizza would ypui like?");
			System.out.println("10,12,14, or 16 (enter the number only): ");
			inches = keyboard.nextInt();
			keyboard.nextLine();
			if (inches == 10){
				cost = 10.99;
			}else if (inches == 14){
				cost = 14.99;
			}else if (inches == 16){
				cost = 16.99;
			}else if (inches == 12){
				cost = 12.99;
			}else{
				System.out.println("Invalid number, a 12 inch pizza ($12.99) will be made.");
			}
			//pizza crust
			System.out.println("What type of crust do you want?");
			System.out.println("(H) Hand-Tossed, (T) Thin-Crust, or (D) Deep-Dish?");
			System.out.println("Enter H, T, or D.");
			input = keyboard.nextLine();
			crustType = input.charAt(0);
			switch (crustType){
				case 'H':
					crust = "Hand-Tossed";
					break;
				case 'D':
					crust = "Deep-Dish";
					break;
				case 'T':
					crust = "Thin-Crust";
					break;
				default:
					System.out.println("Invalid choice, Hand tossed it is.");
					break;
				}
			//toppings
			System.out.println("All Pizzas come with cheese.");
			System.out.println("Toppings are $1.25 each, choose from: Pepperoni, Sausage, Onion, Mushroom");
			//asks the user what individual toppings they would like
			System.out.println("Do you want Pepperoni? (Y/N)");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			if (choice == 'Y' || choice == 'y'){
				numberOfToppings++;
				toppings = toppings + "Pepperoni ";
			}
			System.out.println("Do you want Sausage? (Y/N): ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			if (choice == 'Y' || choice == 'y') {
				numberOfToppings += 1;
				toppings = toppings + "Sausage ";
			}
			System.out.println("Do you want Onion? (Y/N): ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			if (choice == 'Y' || choice == 'y') {
				numberOfToppings += 1;
				toppings = toppings + "Onion ";
			}
			System.out.println("Do you want Mushroom? (Y/N): ");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			if (choice == 'Y' || choice == 'y') {
				numberOfToppings += 1;
				toppings = toppings + "Mushroom ";
			}
			//adds to the cost of the pizza per topping
			cost = cost + (1.25 * numberOfToppings);
			//shows user what they have asked for
			System.out.println("");
			System.out.println("Your order is as follows: ");
			System.out.println(inches + " inch pizza");
			System.out.println(crust +" crust");
			System.out.println(toppings);
			if (discount == true){
				System.out.printf("The cost of your order is: $%.2f\n", cost);
				tax = cost * TAX_RATE;
				System.out.printf("The tax is: $%.2f\n",tax);
				System.out.printf("The total due is: $%.2f\n",(tax + cost));
				System.out.println("Your order will be ready for pickup in 30 minuets.");
			}else{
				System.out.println("Discount!");
				cost = cost-2;
				System.out.printf("The cost of your order is: $%.2f\n", cost);
				tax = cost * TAX_RATE;
				System.out.printf("The tax is: $%.2f\n",tax);
				System.out.printf("The total due is: $%.2f\n",(tax + cost));
				System.out.println("Your order will be ready for pickup in 30 minuets.");
			}
			//shows user the costs of what they ordered
			
			
	}
}
