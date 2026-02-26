package week1.OOP_Inheritance_and_Abstraction;
//  lớp con Circle , override phương thức getArea().
public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
