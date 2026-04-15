import java.util.Scanner; //need for scanner class

public class SalesTax
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		final double TAX_RATE = 0.055;
		double price;
		double tax;//was missing semicolon on packet
		double total;
		String item;
		
		System.out.print("Item description: ");
		item = keyboard.nextLine();
		System.out.print("Item price:  $");
		price = keyboard.nextDouble();
		tax = price * TAX_RATE;
		total = price + tax; //total was missing the a
		
		System.out.print(item + "         $");
		System.out.println(price);
		System.out.print("Tax      $");
		System.out.println(tax);
		System.out.print("Total      $");
		System.out.print(total);
	}
}
