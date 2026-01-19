package english;

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {

	static final int SIZE = 20;
	static final int MINES = 6;

	public static void main(String[] args) {

		char[] board = new char[SIZE];
		char[] visible = new char[SIZE];

		initBoard(board, visible);
		placeMines(board);
		calculateClues(board);

		Scanner sc = new Scanner(System.in);
		boolean gameOver = false;

		while (!gameOver) {
			showVisibleBoard(visible);

			System.out.print("Choose a position (0-19): ");
			int pos = sc.nextInt();

			if (pos < 0 || pos >= SIZE) {
				System.out.println("Invalid position!");
				continue;
			}

			if (board[pos] == '*') {
				System.out.println("💥 BOOM! You hit a mine.");
				showBoard(board);
				gameOver = true;
			} else {
				visible[pos] = board[pos];
			}
		}

		sc.close();
	}

	// Initialize arrays
	static void initBoard(char[] board, char[] visible) {
		for (int i = 0; i < SIZE; i++) {
			board[i] = '0';
			visible[i] = '-';
		}
	}

	// Place mines randomly
	static void placeMines(char[] board) {
		Random rand = new Random();
		int placed = 0;

		while (placed < MINES) {
			int pos = rand.nextInt(SIZE);
			if (board[pos] != '*') {
				board[pos] = '*';
				placed++;
			}
		}
	}

	// Calculate clues
	static void calculateClues(char[] board) {
		for (int i = 0; i < SIZE; i++) {
			if (board[i] != '*') {
				int count = 0;

				if (i > 0 && board[i - 1] == '*')
					count++;
				if (i < SIZE - 1 && board[i + 1] == '*')
					count++;

				board[i] = (char) (count + '0');
			}

		}
	}

	// Show player board
	static void showVisibleBoard(char[] visible) {
		for (char c : visible) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	// Show full board (game over)
	static void showBoard(char[] board) {
		for (char c : board) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
}
