package boardgame;

public class Position {

    //Encapsulation
    private int row;
    private int column;

    //Constructors
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    //Encapsulation
    public int getRow() {
        return row;
    }

    //Encapsulation
    public void setRow(int row) {
        this.row = row;
    }

    //Encapsulation
    public int getColumn() {
        return column;
    }

    //Encapsulation
    public void setColumn(int column) {
        this.column = column;
    }

    //ToString(Object / Overriding)
    @Override
    public String toString(){
        return row +"," + column;
    }
}
