import java.util.Scanner;


class Ex2 {
	static char[][] arr = {{'L', 'I', 'M', 'B'},
			{'A', 'R', 'E', 'A'},
			{'C', 'O', 'R', 'K'},
			{'K', 'N', 'E', 'E'}};

	static char[][] arr2 = {{'L','A', 'T', 'E', 'R', 'A', 'L', 'S'},
							{'A','X', 'O', 'N', 'E', 'M', 'A', 'L'},
							{'T','O', 'E', 'P', 'L', 'A', 'T', 'E'},
							{'E','N', 'P', 'L', 'A', 'N', 'E', 'D'},
							{'R','E', 'L', 'A', 'N', 'D', 'E', 'D'},
							{'A','M', 'A', 'N', 'D', 'I', 'N', 'E'},
							{'L','A', 'T', 'E', 'E', 'N', 'E', 'R'},
							{'S','L', 'E', 'D', 'D', 'E', 'R', 'S'}};

	
	
	public static void main(String args[]) {
		//printRow(arr, 3);
		//printColumn(arr, 3);
		printDiagonal(arr2, true);
		
	}
		
	public static void printRow(char[][] arr, int row) {
		for (int i = 0; i < arr[row].length; i++) {
			System.out.println(arr[row][i]);
		};
	}
	public static void printColumn(char[][] arr, int col) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][col]);
		};
	}
	public static void printDiagonal(char[][] arr, boolean direction) {
		if (direction) {
			for (int i = 0; i < arr.length ; i++){
				System.out.println(arr[i][i]);
			};
		} else {
			int acc = 0;
			for (int i = arr.length-1; i > -1  ; i--){
				System.out.println(arr[acc][i]);
				acc += 1;
			};
		}
	}
}
 