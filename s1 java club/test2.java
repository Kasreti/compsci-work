import java.util.Scanner; 
public class Test{
	public static void main (String[] args) {
	int done = 1;
	while (done <= 1) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("What shape do you want to calculate?");
		String shapeCalc = myObj.nextLine();
		System.out.println("Give your shape a name.");
		String shapeName = myObj.nextLine();
		switch (shapeCalc) {
			case "square":
				System.out.println("Enter the side length.");
				int sideLength = myObj.nextInt();
				Square s = new Square(shapeName, sideLength);
				System.out.println( "Square name: " + s.name );
				System.out.println( "Side length: " + s.side + "cm" );
				System.out.println( "Area: " + s.getArea() + "cm^2" );
				System.out.println( "Perimeter: " + s.getPerimeter() + "cm" );
				break;
			case "rectangle":
				int sideFirst = System.inputInt("enter the length of your first side.");
				int sideSecond = System.inputInt("enter the length of your second side.");
				Rectangle r = new Rectangle(shapeName, sideFirst, sideSecond);
				System.out.println( "Triangle name: " + r.name );
				System.out.println( "Side lengths: " + r.sideFirst + "cm, " + r.sideSecond + "cm" );
				System.out.println( "Area: " + r.getArea() + "cm^2" );
				System.out.println( "Perimeter: " + r.getPerimeter() + "cm" );
				break;
			default:
				System.out.println( "thats not a shape dumbass" );
		}
		Scanner yesorno = new Scanner(System.in);  
		System.out.println("Would you like to calculate again? Y/N");
		String doneYN = yesorno.nextLine();
		yesorno.nextLine();
		System.out.println( doneYN );
		if ("N".equals(doneYN)){
			done++;
			System.out.println( "mf typed no" );
		} else {
			System.out.println( "mf typed yes" );
		}
	}
	}
}

