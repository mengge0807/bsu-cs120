//Ying Liu
//Date:6/10/2013

public class TicTacToe {
	private static final int ROWS = 3;
	private static final int COLUMNS = 3;

	private String[][] board;

	/**
	 * Constructs an empty board.
	 */
	public TicTacToe() {
		board = new String[ROWS][COLUMNS];
		// fill with spaces
		for (int i = 0; i < ROWS; i++)
			for (int j = 0; j < COLUMNS; j++)
				board[i][j] = " ";
	}

	/**
	 * Sets a field in the board. The field must be unoccupied.
	 * 
	 * @param i
	 *            the row index
	 * @param j
	 *            the column index
	 * @param player
	 *            the player ("x" or "o")
	 */
	public void set(int i, int j, String player) {
		if (board[i][j].equals(" "))
			board[i][j] = player;
	}

	/**
	 * Creates a string representation of the board such as |x o| | x | | o |
	 * 
	 * @return the string representation
	 */
	public String toString() {
		String r = "";
		for (int i = 0; i < ROWS; i++) {
			r = r + "|";
			for (int j = 0; j < COLUMNS; j++)
				r = r + board[i][j];
			r = r + "|\n";
		}
		return r;
	}// close toString method

	// method getWinner()
	public String getWinner() {
		String winner = "";
		String colSum = "";

		String rowSum = "";
		String backSum = "";
		String forwardSum = "";

		for (int j = 0; j < COLUMNS; j++) {
			for (int i = 0; i < ROWS; i++) {
				colSum += board[i][j];
			}

			if (colSum.equals("ooo"))
				winner = "o";
			else if (colSum.equals("xxx"))

				winner = "x";
		
		}

		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				rowSum += board[i][j];
			}

			if (rowSum.equals("ooo"))
				winner = "o";
			else if (rowSum.equals("xxx"))
				winner = "x";
		
		}

		backSum = board[0][0] + board[1][1] + board[2][2];
		if (backSum.equals("ooo"))
			winner = "o";
		else if (backSum.equals("xxx"))
			winner = "x";

		forwardSum = board[0][2] + board[1][1] + board[2][0];
		if (forwardSum.equals("ooo"))
			winner = "o";
		else if (forwardSum.equals("xxx"))
			winner = "x";

		if (winner == "x" || winner == "o")
			;
		else
			winner = "no winner";

		return winner;

	}

}
