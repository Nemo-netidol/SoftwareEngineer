package apple;

import models.Board;
import models.Die;
import models.MGame;
import models.Player;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        // Die die = new Die();
        // System.out.println( die.roll() );
        Board board = new Board();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");

        Die dice1 = new Die();
        Die dice2 = new Die();

        Die[] dice = {dice1, dice2};
        Player[] players = {player1, player2, player3};


        MGame Game = new MGame(board, players, dice); //Board, player, dice

        

        Game.playGame();
    }
}
