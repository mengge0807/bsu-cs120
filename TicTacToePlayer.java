import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * This program plays a game of TicTacToe.
 */
// Your name:Ying Liu	
// Date:6/12
public class TicTacToePlayer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String player = "x";
		TicTacToe game = new TicTacToe();
		boolean done = false;
		while (!done) {// start while loop
			System.out.println(game.toString());
			System.out.println("Row for " + player + " (Q to exit): ");
			String input = in.next();
			// Add you code to detect the invalid input (20 points).You code
			// might be needed to add to some other places!

			if (input.equalsIgnoreCase("Q")) {
				done = true;
			} else // start else
			{
				try {
					int row = Integer.parseInt(input);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"Please enter only numeric for row");
					System.exit(0);
				}

				int row = Integer.parseInt(input);
				System.out.println("Column for " + player + ": ");

				try {
					int column = Integer.parseInt(input);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,
							"Please enter only numeric for column");
					System.exit(0);
				}

				int column = in.nextInt();
				game.set(row, column, player);

				if (player.equals("x")) {
					player = "o";
				} else {
					player = "x";
				}
				// Add your code here to print the game board and who is winer
				// (x or o)
				// 20 points (It might be changed!)

				if (game.getWinner().equals("no winner"))
					;
				else {
					System.out.println(game.toString());
					System.out.println("the winner is " + game.getWinner());

					System.out.println("You have just existed form the game!");

					break;
				}
			}// close else block
		}// close while loop

		if (done == true) {
			System.out.println("You have just existed form the game!");
		}
	}// close main method
}// close TicTacToePlayer class

