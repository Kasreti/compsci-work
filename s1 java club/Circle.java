public class Circle{
	// attributes. what does the square have?
	String name;
	double side;
	
	// constructor. builds the square
	public Circle(String n, double s){
		name = n;
		side = s;
	}
	
	// perimetre calculation
	public double getPerimeter(){
		double perimeter = Math.PI * 2 * side;
		return perimeter;
	}
	
	// perimetre area
	public double getArea(){
		double area = side * side * Math.PI;
		return area;
	}
}
