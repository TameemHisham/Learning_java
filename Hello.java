import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        char[] sceretWord = {'t', 'a', 'm', 'e', 'e', 'm'};
        int lengthOfWord = sceretWord.length;
        int found = 0;
        char[] guessedWord = new char[lengthOfWord];
        Scanner myObj = new Scanner(System.in);
        while (found != lengthOfWord) {
            System.out.println("Enter your GUESS!!!!");
            System.out.print("Guess: ");
            char guessedLetter = Character.toLowerCase(myObj.next().charAt(0));
            for (int i = 0; i < lengthOfWord; i++) {
                if (guessedLetter == sceretWord[i]) {
                    guessedWord[i] = guessedLetter;
                    found += 1;
                }
            }
            for (char c : guessedWord) {
                if (c == '\0') {
                    System.out.print("_");
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
            System.out.println("You found: " + found);
        }
        System.out.println("You won! the word was: " + new String(guessedWord));
    }

}
