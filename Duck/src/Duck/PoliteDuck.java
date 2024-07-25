package Duck;

public class PoliteDuck implements Quackable{
    Quackable duck;
    static int count;
    public PoliteDuck(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
        System.out.println("kub");
    }

    public static int getPoliteCount() {
        return count;
    }
}
