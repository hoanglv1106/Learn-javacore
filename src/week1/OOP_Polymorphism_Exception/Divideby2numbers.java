package week1.OOP_Polymorphism_Exception;

import java.util.Scanner;

public class Divideby2numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập sô thứ nhất: ");
        int a = s.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = s.nextInt();
        try {
            int result = a/b;
            System.out.println("Kết quả: " + result);
        }catch (ArithmeticException e){
            System.out.println("Lỗi: k thể chia cho 0");
        }
    }
}
