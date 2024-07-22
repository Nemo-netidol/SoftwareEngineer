import Singleton.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager manager = GameManager.getManager();
        System.out.println("Hello world!");
    }
}