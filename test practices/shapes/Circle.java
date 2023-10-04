import java.lang.Math.*;
public class Circle extends Shape{
    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    private double radius;
    private final double PI = Math.PI;

    public Circle(String name, double radius){
        super(name);
        this.radius = Math.abs(radius);
    }
    public double getArea(){
        return PI*this.radius*this.radius;
    }

    public double getPerimeter(){
        return 2*this.radius*PI;
    }

    public boolean equals(Circle two){
        return two==this;
    }

    public double compareTo(Circle two){
        return this.getArea()-two.getArea();
    }
    public String toString(){
        String x = "Shape: " + this.getName();
        x = x + " Radius: " + this.radius;
        x = x + " Area: " + String.format("%,.3f", this.getArea());
        x = x + " Circumference: " + String.format("%,.3f", this.getPerimeter());
        return x;
    }
}