public class Square
{
	// attributes
	char name;
	double side;
	
	// constructor-makes squares with name n and side s
	public Square(char n, double s)
	{	name = n;
		side = s;
	}
	
	// methods - what the Square can do
	// calculate the area and perimeter of a square
	
	public double getArea()
	{
		double area = side * side;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter = side * 4;
		return perimeter;
	}
	
}
