package Duck;
//Nakorn Boonprasong 6510405458

public class QuackCounter implements Quackable{
    Quackable duck;
    static int quackCount;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        quackCount++;
        duck.quack();
    }

    public static int getQuackCount() {
        return quackCount;
    }
}
