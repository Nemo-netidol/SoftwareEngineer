package Duck;
//Nakorn Boonprasong 6510405458

public class PoliteCounter implements Quackable{
    Quackable duck;

    public PoliteCounter(Quackable duck) {
        this.duck = duck;
    }
    @Override
    public void quack() {

    }
}
