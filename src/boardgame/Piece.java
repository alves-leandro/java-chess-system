package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Se não colocar nada o defatul já é null;
	}

	protected Board getBoard() {
		return board;
	}
}
