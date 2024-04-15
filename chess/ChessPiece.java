package chess;

import boardgame.Board;
import boardgame.Piece;

//Herança
public class ChessPiece extends Piece {
    private Color color;

    //need a builder
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
