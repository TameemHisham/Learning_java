import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public record Student(String name, int age, int yearGroup, String school) {
    public Student() {
        this("", 0, 1, "");}
}

class Main {
    public static  void  main(String[] args) {
        Student student1 = new Student("Tameem", 18, 13, "Gems");
        System.out.println(student1.toString());
    }
}
