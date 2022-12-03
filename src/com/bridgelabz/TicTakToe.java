package com.bridgelabz;

/***
 * 
 * @author Admin
 *
 */
public class TicTakToe {
	static char board[] = new char[10];
	static char player;
	static char computer;

	/***
	 * Created method
	 */
	public void result() {
		/***
		 * used for loop to checking the condition.
		 */
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcom to the Tic Tac Toe Game program");
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);

	}

}
