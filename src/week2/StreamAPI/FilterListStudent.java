package week2.StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


//Dùng Collectors.groupingBy() nhóm sinh viên theo tuổi.
public class FilterListStudent {
    //Dùng Stream lọc danh sách Student có điểm >= 7 và sắp xếp giảm dần theo điểm.
    public static void main(String[] args) {
        List<Student1> students = List.of(
                new Student1("Hoang", 22,8.5),
                new Student1("Giap", 21,4.5),
                new Student1("Nghia",22,5.5),
                new Student1("Bao", 22,6.5),
                new Student1("Tan", 22,7.5)
        );

        List<Student1> filteredStudents = students.stream()
            .filter(s -> s.getScore() >=7)
            .sorted((s1,s2)-> Double.compare(s2.getScore(),s1.getScore()))
            .toList();
        System.out.println("Danh sách sinh viên có điểm >= 7 và sắp xếp");
        filteredStudents.forEach(s-> System.out.println(s.getName() + " " + s.getScore()));

        //Dùng Collectors.groupingBy() nhóm sinh viên theo tuổi.
        Map<Integer, List<Student1>> studentsbyAge = students.stream()
                .collect(Collectors.groupingBy(s -> s.getAge()));
        System.out.println("Nhóm sinh viên theo tuổi:");
        studentsbyAge.forEach((age, list)->
                System.out.println("tuổi: " + age + " : " + list)
                );

    }
}
