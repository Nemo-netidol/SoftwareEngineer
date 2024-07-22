package Singleton;

import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static GameManager manager;
    public static List<Character> characters;

    private GameManager() {
        this.characters = new ArrayList<Character>();
    }
    public final static GameManager getManager() {
        if (manager == null) {
            manager = new GameManager();
        }
        return manager;
    }
    public void addCharacter(Character c) {

    }
}