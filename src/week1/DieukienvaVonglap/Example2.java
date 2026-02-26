package week1.DieukienvaVonglap;
// In bảng cửu chương từ 2 đến 9 bằng vòng lặp for.
public class Example2 {
    public static void main(String[] args) {
        for (int i =2 ; i<=9 ; i++){
            System.out.println("Bảng Cửu Trương " + i);
            for(int j = 1; j <=10; j++){
                System.out.println( i+"x"+j+"="+(i*j));
            }
        }
    }
}
