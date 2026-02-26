package week1.TongquanJava;

import java.util.Scanner;

//Viết chương trình tính chu vi và diện tích hình tròn.
public class example2 {
    public double circumference(double r){
        return 2*Math.PI*r;
    }

    public double area(double r){
        return Math.PI*r*r;
    }

    public static void main(String[] args) {
        example2 ex = new example2();
        Scanner s = new Scanner(System.in);
        double r;
        System.out.print("Nhập bán kính hình tròn: ");
        r = s.nextDouble();
        System.out.println("Chu vi hình tròn là: " + ex.circumference(r));
        System.out.println("Diện tích hình tròn là: " + ex.area(r));

    }
}
