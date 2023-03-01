
public class Point
{
	char name;
	double x;
	double y;
	
	// constructor
	public Point(char pointName, double coordX, double coordY)
	{	
		name = pointName;
		x = coordX;
		y = coordY;
	}
	
	public boolean equals(Point p2)
	{
		return this.x == p2.x && this.y == p2.y;
	}
	
	public void printPoint()
	{
		System.out.println(name + "(" + x + "," + y + ")" );
	}
	
	public double distance(Point p2){
		double distance = Math.sqrt(Math.pow(p2.x - this.x,2) + Math.pow(p2.y - this.y,2));
		return(distance);
	}
	
	public double distancefz(){
		double distancefz = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
		return(distancefz);
	}
	
	public static void main (String[] args)
	{
		Point p = new Point('P', 5, 5);
		Point q = new Point('Q', 8, 9);
		
		p.printPoint();
		q.printPoint();
		System.out.println(p.distance(q));
		System.out.println(p.distancefz());
	}
}

