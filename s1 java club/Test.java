import java.util.Scanner; 
public class Test{
	public static void main (String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("What shape do you want to calculate? (square, rectangle, circle)");
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
				System.out.println("Enter the lengths of both your sides.");
				int sideFirst = myObj.nextInt();
				int sideSecond = myObj.nextInt();
				Rectangle r = new Rectangle(shapeName, sideFirst, sideSecond);
				System.out.println( "Triangle name: " + r.name );
				System.out.println( "Side lengths: " + r.sideFirst + "cm, " + r.sideSecond + "cm" );
				System.out.println( "Area: " + r.getArea() + "cm^2" );
				System.out.println( "Perimeter: " + r.getPerimeter() + "cm" );
				break;
			case "circle":
				System.out.println("Enter the radius of your circle.");
				int radiusLength = myObj.nextInt();
				Circle c = new Circle(shapeName, radiusLength);
				System.out.println( "Circle name: " + c.name );
				System.out.println( "Area: " + c.getArea() + "cm^2" );
				System.out.println( "Circumfrence: " + c.getPerimeter() + "cm" );
				break;
			default:
				System.out.println( "thats not a shape dumbass" );
		}
	}
}

