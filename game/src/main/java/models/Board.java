package models;

public class Board {

    Square[] squares;
    final int MAX_SQUARE = 40;

    public Board() {
        this.squares = new Square[MAX_SQUARE];
        for(int i = 0; i < MAX_SQUARE; i++) {
            squares[i] = new Square("Sqaure" + i);
        }
    }

    public Square getStartSquare() {
        return squares[0];
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        int oldIndex = -1;
        for (int i = 0; i < MAX_SQUARE; i++) {
            if (squares[i] == oldLoc) {
                oldIndex = i;
                break;
            }
        }
        int newIndex = (oldIndex + fvTot) % MAX_SQUARE;
        return squares[newIndex];
    }
}
