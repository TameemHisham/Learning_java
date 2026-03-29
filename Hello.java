import java.util.Scanner;
import java.util.Arrays;
class Hello {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            continue;
        }
        System.out.println(i); // error since the scope of i in the loop
    }
}
