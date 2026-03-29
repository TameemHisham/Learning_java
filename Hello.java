import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        int guess = -1;
        while (guess != randomNumber) {
            System.out.println("Enter your guess!");
            guess = myObj.nextInt();
            if (guess > randomNumber) {
                System.out.println("Smaller!");
            } else if (guess < randomNumber) {
                System.out.println("Bigger!");
            }
        }
        System.out.println("YAY! the number was indeed: " + randomNumber);
    }
}
