package week2.Collection_Framework;

import java.util.HashMap;
import java.util.Map;

//Dùng Map<String, Integer> đếm số lần xuất hiện của từ trong 1 đoạn văn bản.
public class NumberOfAppearances {
    public static void main(String[] args) {
        String text = " Trong Java, Set là một interface trong Collection framework được sử dụng để lưu trữ tập hợp các phần tử không trùng lặp. Nó kế thừa interface Collection và bổ sung các tính năng bổ sung để quản lý các tập hợp các phần tử không trùng lặp. ";
        String [] words = text.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word : words){
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word)+1);

            }else{
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry<String , Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
