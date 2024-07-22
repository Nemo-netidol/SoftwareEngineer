package GumballVersion2;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Gumball sold out, cannot insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Gumball sold out, cannot eject quarter");

    }

    @Override
    public void turnCrank() {
        System.out.println("Gumball sold out, cannot turn crank");

    }

    @Override
    public void dispense() {

    }

    @Override
    public void chooseFlavor() {
        System.out.println("Gumball sold out, cannot choose flavour");


    }
}
