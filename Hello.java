import java.util.Scanner;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Hello {
    public static void main(String[] args) {
        Human me = new Human();
//        me.name = "tameem"
        System.out.println(me.getAge());
        System.out.println(me.getName());
        me.setAge(18);
        me.setName("Tameem");
        System.out.println(me.getAge());
        System.out.println(me.getName());
    }

}
