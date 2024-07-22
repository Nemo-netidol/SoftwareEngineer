package GumballVersion2;

public class NoQuaterState implements State{
    GumballMachine gumballMachine;

    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine =  gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven’t inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there’s no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void chooseFlavor() {
        System.out.println("Cannot choose flavor right now");
    }
}
