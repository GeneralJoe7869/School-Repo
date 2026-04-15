import java.util.Scanner;//why do i have to import this all the time
public class ltm {
	public static void main(String[] args){
		double w = 0;
		double l = 0;
		double r = 0;
		double circle;
		double rectangle; 
		w = dietz();//gotta make sure its like this or it don't work
		l = nuts();
		r = boom();
		System.out.println("Rest in peace my granny she got hit by a bazooka");
		circle = 3.14*Math.pow(r,2); // I didn't do great in geometry
		rectangle = l*w;
		System.out.println("The area of the circle is "+ circle);
		System.out.println("The area of the rectangle is "+ rectangle);
	}
	public static double dietz(){//gets the widith of the user since they are widely challeneged
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter in a Widith");
		double widith = sc.nextDouble();
		System.out.println("Dietz nuts");
		return(widith);
	}
	public static double nuts(){//gets the length of the user as if i can even see whats behind them
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter in a length");
		double length = sc.nextDouble();
		System.out.println("Sea salt, i need you sea salt");
		return(length);
	}
	public static double boom(){//gets the radius of the user, yeah the user should lose weight btw
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter in a radius");
		double radius = sc.nextDouble();
		System.out.println("Ligma balls");
		return(radius);
	}
}
