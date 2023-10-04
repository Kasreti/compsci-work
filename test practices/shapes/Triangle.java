import java.lang.Math.*;
public class Triangle extends Shape{
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = Math.abs(base);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = Math.abs(height);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = Math.abs(side1);
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = Math.abs(side2);
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = Math.abs(side3);
    }

    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double base, double height, double side1, double side2, double side3) {
        super(name);
        this.base = Math.abs(base);
        this.height = Math.abs(height);
        this.side1 = Math.abs(side1);
        this.side2 = Math.abs(side2);
        this.side3 = Math.abs(side3);
    }
    public double getArea(){
        return (this.height*this.base)/2;
    }

    public double getPerimeter() {
        return this.side1+this.side2+this.side3;
    }

    public boolean equals(Triangle two){
        return two==this;
    }

    public double compareTo(Triangle two){
        return this.getArea()-two.getArea();
    }

    public String toString(){
        String x = "Shape: " + this.getName();
        x = x + " Base: " + this.base;
        x = x + " Height: " + this.height;
        x = x + " Side 1: " + this.side1;
        x = x + " Side 2: " + this.side2;
        x = x + " Side 3: " + this.side3;
        x = x + " Area: " + String.format("%,.3f", this.getArea());
        x = x + " Perimeter: " + String.format("%,.3f", this.getPerimeter());
        return x;
    }

}