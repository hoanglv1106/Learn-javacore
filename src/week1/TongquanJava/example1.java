package week1.day1;
//Viết chương trình nhập 2 số nguyên, in ra tổng, hiệu, tích, thương.

import java.util.Scanner;

public class example1 {

    public int sum(int a , int b){
        return a+b;
    }

    public int sub(int a , int b){
        return a-b;
    }

    public int mul(int a, int b){
        return a*b;}

    public int div(int a, int b){
        if(b==0){
            System.out.println("Không thể chia cho 0");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        example1 ex = new example1();
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sn.nextInt();
        int b;
        int option;
        do {
            System.out.print("Nhập số nguyên thứ hai (khac 0): ");
             b = sn.nextInt();
        }while (b==0);
        do{
            System.out.println("_______________Menu_______________");
            System.out.println("1. Tính tổng");
            System.out.println("2. Tính hiệu");
            System.out.println("3. Tính tích");
            System.out.println("4. Tính thương");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            option = sn.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Tổng = " + ex.sum(a, b));
                    break;
                case 2:
                    System.out.println("Hiệu = " + ex.sub(a, b));
                    break;
                case 3:
                    System.out.println("Tích = " + ex.mul(a, b));
                    break;
                case 4:
                    System.out.println("Thương = " + ex.div(a, b));
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }while (option != 5);

    }

}
