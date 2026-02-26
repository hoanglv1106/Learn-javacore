package week1.day2;

import java.util.Scanner;

//Viết chương trình kiểm tra số chẵn/lẻ, chia hết cho 3 hay không.
public class Example1 {
    public boolean isEven(int n){
        return n%2==0;
    }
    public boolean divisibleby3(int n){
        return n%3==0;
    }

    public static void main(String[] args) {
        Example1 ex = new Example1();
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập một số nguyên: ");
        int n = s.nextInt();
        if(ex.isEven(n)){
            System.out.println(n + " là số chẵn");
        }else{
            System.out.println(n + " là số lẻ");
        }

        if(ex.divisibleby3(n)){
            System.out.println(n + " chia hết cho 3");
        }else{
            System.out.println(n + " không chia hết cho 3");
        }
    }
}
