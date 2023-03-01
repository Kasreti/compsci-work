import java.util.Scanner;

public class Quad
{
	public static void quad(double a, double b, double c){
		char pm = 177;
		double disc = (b*b) - (4 * a * c);
		if(disc<0){
			double val = (b * -1)/(2*a);
			disc = (Math.sqrt(disc * -1))/2;
			System.out.println("\n=================================\nYour answer is:");
			System.out.println(val + " " + pm + " " + disc + "i");
			System.out.println("=================================");
			return; 
			
		} else {
			double posval = (b * -1) + Math.sqrt(disc);
			posval = posval/(2*a);
			double negval = (b * -1) - Math.sqrt(disc);
			negval = negval/(2*a);
			System.out.println("\n=================================\nYour answer is:");
			System.out.println(posval + ", " + negval);
			System.out.println("=================================");
			return;
		}
	}
	
	public static void main (String[] args)
	{ 
		Scanner quadvars = new Scanner(System.in);
		System.out.println("\nEnter your a variable.");
		int aq = quadvars.nextInt();
		System.out.println("\nEnter your b variable.");
		int bq = quadvars.nextInt();
		System.out.println("\nEnter your c variable.");
		int cq = quadvars.nextInt();
		quad(aq, bq, cq);
	}
}
