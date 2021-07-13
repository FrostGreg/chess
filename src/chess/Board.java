package chess;

public class Board {
	boolean isWhiteTurn;
	String Board[][] = new String[8][8];
	private static Board gameBoard = new Board();
	
	private Board() {
		int i, j;
		for (i=0; i < 8; i++) {
			for (j=0; j < 8; j++) {
				Board[i][j] = "  ";
			}
		}
		/*Replace Actual strings with object text value*/
		for (i = 0; i < 8; i++) {
			Board[1][i] = "BP";
			Board[6][i] = "WP";
		}
		
		Board[0][0] = Board[0][7] = "BR";
		Board[0][1] = Board[0][6] = "BN";
		Board[0][2] = Board[0][5] = "BB";
		Board[0][3] = "BQ";
		Board[0][4] = "BK";
		
		Board[7][0] = Board[7][7] = "WR";
		Board[7][1] = Board[7][6] = "WN";
		Board[7][2] = Board[7][5] = "WB";
		Board[7][4] = "WQ";
		Board[7][3] = "WK";
	}
	
	public void swapActivePlayer() {
		
	}
	
	public boolean isWhiteTurn() {
		return true;
	}
	
	public boolean isMoveValid() {
		return true;
	}
	
	protected void makeMove() {
		
	}
	
	public static Board getBoard() {
		return gameBoard;
	}
	
	public void printBoard() {
		for (int i=0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("[" + Board[i][j] + "]");
			}
			System.out.print("\n");
		}
	}

}
