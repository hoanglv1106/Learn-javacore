package week2.StreamAPI;

public class Student1 {

    private String name;
    private int age;
    private double score;

    public Student1(){

    }

    public Student1 (String name,int age, double score){
        this.name = name;
        this.age = age;
        this.score = score;

    }

    public int getAge(){
        return age;
    }
    public double getScore(){
        return score;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
