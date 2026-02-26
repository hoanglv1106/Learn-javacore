package week1.OOPClassObject;
//Tạo class Student (name, age, score), tạo 3 object và in ra thông tin.
public class maintest {
    public double average(Student [] students) {
        double sum = 0;
        for (Student student : students) {
            sum = sum + student.getScore();

        }
        return sum/students.length;
    }
    public static void main(String[] args) {
        maintest mt = new maintest();
        Student s1 = new Student("Nguyen Van A", 20, 8.5);
        Student s2 = new Student("Le Thi B", 22, 7.0);
        Student s3 = new Student("Tran Van C", 19, 9.0);

        Student [] students = {s1, s2, s3};

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println("Điểm trung bình của lớp là: " + mt.average(students));





    }
}
