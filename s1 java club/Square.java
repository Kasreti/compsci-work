public class Square{
	// attributes. what does the square have?
	String name;
	double side;
	
	// constructor. builds the square
	public Square(String n, double s){
		name = n;
		side = s;
	}
	
	// perimetre calculation
	public double getPerimeter(){
		double perimeter = side * 4;
		return perimeter;
	}
	
	// perimetre area
	public double getArea(){
		double area = side * side;
		return area;
	}
}
