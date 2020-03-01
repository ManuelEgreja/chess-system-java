package boardgame;

public class Piece {
 protected Position position; //protected porque não pode ser visivel na camada de xadrez.
 private Board board;
  public Piece(Board board) {
	 this.board = board;
	 position = null;
}
   protected Board getBoard() {//apaga o set porque não pode mexer no tabuleiro.
	return board;
}


 
}
