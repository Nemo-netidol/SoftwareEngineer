package Duck;

//Nakorn Boonprasong 6510405458

public class DuckSimulator {
    int cooCount = 0;
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        DuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck =  duckFactory.createMallardDuck() ;
        Quackable redHeadDuck =  duckFactory.createRedHeadDuck() ;
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        Flock flock1 = new Flock();

        flock1.add(mallardDuck);
        flock1.add(redHeadDuck);
        flock1.add(duckCall);
        flock1.add(rubberDuck);
        flock1.add(goose);
        flock1.add(pigeon);

        Quackable goose1 = new GooseAdapter(new Goose());
        Quackable goose2 = new GooseAdapter(new Goose());
        Quackable goose3 = new GooseAdapter(new Goose());

        Flock flockOfGoose =  new Flock();
        flockOfGoose.add(goose1);
        flockOfGoose.add(goose2);
        flockOfGoose.add(goose3);

        Flock flock2 = new Flock();
        flock2.add(duckFactory.createRubberDuck());
        flock2.add(duckFactory.createMallardDuck());
        flock2.add(duckFactory.createDuckCall());

        System.out.println("\nDuck Simulator");



        System.out.println(QuackCounter.getQuackCount() + " quack were counted");
        System.out.println(PoliteDuck.getPoliteCount() + " politely quack were counted");

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flock2);

    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
