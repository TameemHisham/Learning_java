


class Hangman {
	private String playerName;
	private String wordToGuess;
	private char[] guesses;
	public int MAX_GUESSES;
	public Hangman (String playerName) {
		this.playerName = playerName;
		this.MAX_GUESSES = 20;
		this.guesses = new char[this.MAX_GUESSES];
	}
	public String getPlayerName() {
		return this.playerName ;
	};
	public void setPlayerName(String playerName) {
		this.playerName  = playerName;
	};
	public String getWord() {
		return this.wordToGuess ;
	};
	public void setWord(String wordToGuess) {
		this.wordToGuess  = wordToGuess;
	};
	public int getRemainingGuesses() {
		int NumberOfguesses = 0;
		for (int i = 0 ; i < this.MAX_GUESSES ; i++ ) {
			if (this.guesses[i] == 0) {
				break;
			} else {
				NumberOfguesses++;
			}
		}
		return this.MAX_GUESSES-NumberOfguesses;
	}
	public boolean tryChar(char guess) {
		boolean found = true;
		for (int i = 0 ; i < this.MAX_GUESSES ; i++ ) {
			if (this.guesses[i] == guess) {
				System.out.println(guess + "has been guessed before");
				found = false;
				break;
			} 
		}
		if (found) {
			int indexOfNewChar = this.MAX_GUESSES-this.getRemainingGuesses();
			this.guesses[indexOfNewChar] = guess;
		}
		for (int i = 0 ; i < wordToGuess.length() ; i++ ) {
			if (wordToGuess.charAt(i) == guess) {
				return true;
			}
		}
		return false;
		
	}
	public String getCurrentState() {
		String state = "";
		for (int i = 0 ; i < wordToGuess.length() ; i++ ) {
			char addToState = '-';
			for (int j = 0 ; j < this.MAX_GUESSES-1 ; j++ ) {
				if (wordToGuess.charAt(i) == this.guesses[j]) {
					addToState = wordToGuess.charAt(i);
					break;
				}
			}
			state += addToState;
		}
		return state;
		
	}
	public char[] getGuesses() {
		return this.guesses;
	}
}