import java.util.Scanner;

class Human {
    private int age;
    private String name;
    static String school = "Gems";
    public Human(int age, String name) {
        this.age = age;
        this.name = name ;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Main {
    public static void main(String[] args) {
        Human tameem = new Human(12, "tameem");
        System.out.println(Human.school);
    }
}
