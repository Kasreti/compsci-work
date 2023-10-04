import java.lang.Math.*;
public class Square extends Shape{
    private double side;

    public Square(String name, double side){
        super(name);
        this.side = Math.abs(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = Math.abs(side);
    }

    public double getArea(){
        return this.side*this.side;
    }

    public double getPerimeter(){
        return this.side*4;
    }

    public boolean equals(Square two){
        return two==this;
    }

    public double compareTo(Square two){
        return this.getArea()-two.getArea();
    }
    public String toString(){
        String x = "Shape: " + this.getName();
        x = x + " Side: " + this.side;
        x = x + " Area: " + String.format("%,.3f", this.getArea());
        x = x + " Perimeter: " + String.format("%,.3f", this.getPerimeter());
        return x;
    }
}