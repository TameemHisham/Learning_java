
import java.io.Console;


class HangmanDriver {
	public static void main(String[] args) {
		Console my_console = System.console();
		Hangman my_hangman = new Hangman("");
		HangmanDictionary my_dictionary = new HangmanDictionary();
		String in;
		in = my_console.readLine("Enter your name: ");
		my_hangman.setPlayerName(in);
		System.out.println("Welcome " + my_hangman.getPlayerName()+"!");
		String guess_word = my_dictionary.getWord();
		my_hangman.setWord(guess_word);
		boolean gussed = false;
		do {
			char my_guess = my_console.readLine("Enter your guess!\n>>> ").charAt(0);
			my_hangman.tryChar(my_guess);
			System.out.println(my_hangman.getCurrentState());
			System.out.printf("you have %d guesses left\n ", my_hangman.getRemainingGuesses());
			if (my_hangman.getCurrentState().equals(my_hangman.getWord())) {
				gussed = true;
				break;
			}
		}
		while (my_hangman.getRemainingGuesses() != 0);
		if (gussed) {
			System.out.println("Well done you gussed right!");
		} else {
			System.out.printf("the word was: %s Good luck next time!\n", my_hangman.getWord());
		}
		
		
	}
}