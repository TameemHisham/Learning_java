
import java.io.Console;


class HangmanDriver {
	public static void main(String[] args) {
		Console my_console = System.console();
		Hangman my_hangman = new Hangman("");
		String in;
		in = my_console.readLine("Enter your name: ");
		my_hangman.setPlayerName(in);
		System.out.println("Welcome " + my_hangman.getPlayerName()+"!");
	}
}