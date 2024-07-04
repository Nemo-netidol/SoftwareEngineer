package models;

public class MGame {
    private int MAX_ROUND = 10;
    private int roundCnt;
    private Player[] players;
    private Die[] dice;
    private Board board;
    private int roundCount;


    public MGame(Board board, Player[] player, Die[] dice) {
        this.board = board;
        this.players = player;
        this.dice = dice;
        this.roundCnt = 1;
    }


    public void playGame() {
        for (int i =0; i < MAX_ROUND; i++) {
            playRound();
        }
    }

    private void playRound() {
        for(Player player : players) {
            player.takeTurn(dice, board);
        }
    }



    public int getRoundCount() {
        return this.roundCnt;
    }
}  
