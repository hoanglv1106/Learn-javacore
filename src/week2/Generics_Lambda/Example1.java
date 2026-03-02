package week2.Generics_Lambda;
//Viết generic method in ra tất cả phần tử của 1 mảng.
public class Example1 {
    public static <T> void printarray(T[] arrays){
        for(T e: arrays ){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5,6,7,8,9};
        String [] StringArray = {"Hello", "World", "Java", "Generics"};
        System.out.println("In mảng số nguyên: ");
        printarray(intArray);
        System.out.println("In mảng chuỗi: ");
        printarray(StringArray);
    }

}
