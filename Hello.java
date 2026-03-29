import java.util.Scanner;
import java.util.Arrays;
class Hello {
    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                System.out.print(j*i);
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
