package com.bridgelabz;

import java.util.Scanner;

/***
 * 
 * @author Admin
 *
 */
public class TicTakToe {
	static char board[] = new char[10];
	static char player;
	static char computer;
	Scanner scanner = new Scanner(System.in);

	/*
	 * Created method called Result
	 */
	public void result() {
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
	}

	/*
	 * Method to show Game Board.
	 */
	public void showBoard() {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}

	/*
	 * Logic for checking Player selected letter
	 */
	public void checkResult() {
		System.out.println("please select your choice letter: 'X' or 'Y' ");
		char choice = scanner.next().toUpperCase().charAt(0);
		if (choice == 'X') {
			System.out.println("Player selected letter is:" + 'X');
			System.out.println("Computer selected letter is:" + 'O');

		} else if (choice == 'Y') {
			System.out.println("Player selected letter is:" + 'O');
			System.out.println("Computer selected letter is:" + 'X');
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcom to the Tic Tac Toe Game program");

		/*
		 * Creating object of class
		 */
		TicTakToe tictactoe = new TicTakToe();
		tictactoe.result();
		tictactoe.showBoard();
		tictactoe.checkResult();
	}

}