package boardgame;

public class Piece {
 protected Position position; //protected porque n�o pode ser visivel na camada de xadrez.
 private Board board;
  public Piece(Board board) {
	 this.board = board;
	 position = null;
}
   protected Board getBoard() {//apaga o set porque n�o pode mexer no tabuleiro.
	return board;
}


 
}
