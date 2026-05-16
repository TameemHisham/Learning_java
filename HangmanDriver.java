
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
		my_hangman.tryChar('e');
		my_hangman.tryChar('l');
		my_hangman.tryChar('s');
		my_hangman.tryChar('a');
		
		
		System.out.println(my_hangman.getCurrentState());
		
	}
}