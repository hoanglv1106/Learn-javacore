package week1.OOP_Polymorphism_Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Đọc file text chứa danh sách tên, in ra từng tên một.
public class ReadFile {
    public static void main(String[] args) {
        readAndPrintNames("src/week1/OOP_Polymorphism_Exception/name.txt");

    }

    private static void readAndPrintNames(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
