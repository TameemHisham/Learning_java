import java.util.Scanner;
class Hello {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i >= 10) {
                System.out.print(" ".repeat(20-i));
            } else {
            System.out.print(" ".repeat(i));
            }
            System.out.println("!!HELLO!!");
        }

    }
}
