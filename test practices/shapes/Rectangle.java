import java.lang.Math.*;
public class Rectangle extends Shape{
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.abs(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = Math.abs(width);
    }

    private double length;
    private double width;

    public Rectangle(String name, double length, double width){
        super(name);
        this.length = Math.abs(length);
        this.width = Math.abs(width);
    }
    public double getArea(){
        return this.length*this.width;
    }

    public double getPerimeter(){
        return 2*(this.length+this.width);
    }

    public boolean equals(Rectangle two){
        return two==this;
    }

    public double compareTo(Rectangle two){
        return this.getArea()-two.getArea();
    }
    public String toString(){
        String x = "Shape: " + this.getName();
        x = x + " Length: " + this.length;
        x = x + " Width: " + this.width;
        x = x + " Area: " + String.format("%,.3f", this.getArea());
        x = x + " Perimeter: " + String.format("%,.3f", this.getPerimeter());
        return x;
    }
}