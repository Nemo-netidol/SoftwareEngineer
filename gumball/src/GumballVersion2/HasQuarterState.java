package GumballVersion2;

import java.util.Random;

public class HasQuarterState implements State{
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can’t insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
//        System.out.println("You turned...");
//        int winner = randomWinner.nextInt(10);
//
//        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
//            gumballMachine.setState(gumballMachine.getWinnerState());
//        } else {
//            gumballMachine.setState(gumballMachine.getSoldState());
//        }
            System.out.println("You have to choose the flavor first");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void chooseFlavor() {
        if (gumballMachine.getFlavour() != null) {
            gumballMachine.setState(gumballMachine.getChooseFlavourState());
        }
    }
}
