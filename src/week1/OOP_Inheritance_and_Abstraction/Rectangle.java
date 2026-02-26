package week1.OOP_Inheritance_and_Abstraction;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){}

    @Override
    public double getArea() {
        return width * height;
    }
}
