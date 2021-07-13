package chess;

public class GameMain {
	Board gameBoard;
	
	public GameMain() {
		gameBoard = Board.getBoard();
		gameBoard.printBoard();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMain game = new GameMain();
	}
	
	public void moveInput() {
		
	}
	
	public boolean isFinished() {
		return false;
	}
	
	public void endGame() {
		
	}

}
