import java.util.Scanner;
import java.util.Arrays;
class Hello {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            continue;
        }
        System.out.println(i); // scope is the main method so it works!
    }
}
