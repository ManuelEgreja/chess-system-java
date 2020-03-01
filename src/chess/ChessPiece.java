package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}//Set foi apagado porqu n�o pode deixar mudar a cor das pe�as.

	
}
