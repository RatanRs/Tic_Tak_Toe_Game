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
	static int playerLocation;

	/*
	 * Created method Called Result
	 */
	public static void result() {
		for (int index = 1; index < 10; index++) {
			board[index] = ' ';
		}
	}
	/*
	 * Method to make a choice between Computer and player
	 */

	public static void getPlayerChoice() {
		Scanner input = new Scanner(System.in);
		System.out.print("select X or O : ");
		player = input.next().toUpperCase().charAt(0);
		/**
		 * Used if else conditon to check the result
		 */
		if (player == 'X')
			computer = 'O';
		else
			computer = 'X';
		System.out.println("You have selected : " + player);
		System.out.println("Computer's choice is : " + computer);
	}

	/*
	 * Logic for Printing the showBoard the TicTacToe Game Board.
	 */
	public static void showBoard() {
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
	}

	public static void userMove() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Location 1-9 to Make Move");
		playerLocation = input.nextInt();
		if (playerLocation < 10 && playerLocation > 0) {
			board[playerLocation] = player;
			showBoard();
		} else {
			System.out.println("Invalid Choice");
		}
	}

	/*
	 * Logic for checking Player selected letter
	 */
	public static void check() {
		Scanner input = new Scanner(System.in);
		System.out.println("please select your choice letter: 'X' or 'Y' ");
		char choice = input.next().toUpperCase().charAt(0);
		if (choice == 'X') {
			System.out.println("Player selected letter is:" + 'X');
			System.out.println("Computer selected letter is:" + 'O');

		} else if (choice == 'Y') {
			System.out.println("Player selected letter is:" + 'O');
			System.out.println("Computer selected letter is:" + 'X');
		}
	}

	/**
	 * program execution starts from main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcom to the Tic Tac Toe Game program");
		result();
		getPlayerChoice();
		showBoard();
		userMove();
	}

}