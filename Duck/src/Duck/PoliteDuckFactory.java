package Duck;
//Nakorn Boonprasong 6510405458

public class PoliteDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new PoliteDuck( new MallardDuck() ));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter( new PoliteDuck(new RedHeadDuck()) );
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter( new PoliteDuck(new DuckCall()) );
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter( new PoliteDuck(new RubberDuck()) );
    }
}
