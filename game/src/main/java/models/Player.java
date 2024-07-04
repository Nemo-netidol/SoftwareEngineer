package models;

public class Player {
    String name;
    Piece piece;

    public Player(String name) {
        this.name = name;
    }

    void takeTurn(Die[] dice, Board board) {
        int fvTot = 0;
        for(Die die: dice) {
            die.roll();
            fvTot += die.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);

        piece.setLocation(newLoc);
    }
    
    public String getName() {
        return this.name;
    }
}
