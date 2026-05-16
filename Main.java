
enum Gender {
    MALE,
    FEMALE
}

interface Human {
    String bestHuman = "TAMEEM";
    String getName();
    int getAge();
    Gender getGender();
}

class Student implements Human {
    private  String name;
    private int age;
    private int year;
    private Gender gender;
    private  double grade;

    public Student(String tameem, int i, Gender gender, int i1, double v) {
        this.name =name;
        this.age =age;
        this.year =year;
        this.gender =gender;
        this.grade =grade;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }
}

class Main {
    public static void main(String[] args) {
        Student tameem = new Student("tameem", 18, Gender.MALE, 1, 83.0);
        System.out.println(Human.bestHuman);
    }
}