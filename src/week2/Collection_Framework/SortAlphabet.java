package week2.Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Tạo danh sách List<String> tên người, sắp xếp và in ra theo alphabet.
public class SortAlphabet {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Hoang");
        names.add("Giap");
        names.add("Nghia");
        names.add("Bao");
        names.add("Tan");
        Collections.sort(names);
        System.out.println("Danh sách tên người trước khi sắp xếp: " + names);
        for (String name : names){
            System.out.println(name);

        }

    }
}
