public class Rectangle{
	// attributes. what does the square have?
	String name;
	double sideFirst;
	double sideSecond;
	
	// constructor. builds the square
	public Rectangle(String n, double sf, double ss){
		name = n;
		sideFirst = sf;
		sideSecond = ss;
	}
	
	// perimetre calculation
	public double getPerimeter(){
		double perimeter = sideFirst * 2 + sideSecond * 2;
		return perimeter;
	}
	
	// perimetre area
	public double getArea(){
		double area = sideFirst * sideSecond;
		return area;
	}
}
