public class Circle
{
	// attributes
	char name;
	double radius;
	
	// constructor-makes circles with name n and side s
	public Circle(char n, double r)
	{	name = n;
		radius = r;
	}
	
	// methods - what the Circle can do
	// calculate the area and perimeter of a square
	
	public double getArea()
	{
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter = radius * 2 * Math.PI;
		return perimeter;
	}
	
}
