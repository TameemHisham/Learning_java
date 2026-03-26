import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int age  = myObj.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age > 12) {
            System.out.println("You are a Teenager!");
        } else {
            System.out.println("You are a kid!");
    }

}
}
