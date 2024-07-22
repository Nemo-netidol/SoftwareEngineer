package GumballVersion2;

public class GumballMachine {

    State soldState;
    State soldOutState;
    State hasQuarterState;
    State noQuarterState;
    State winnerState;
    State chooseFlavourState;

    State state = soldState;
    int count = 0;
    String flavour;

    public GumballMachine(int numberOfGumballs) {
        this.count = numberOfGumballs;
        this.flavour = null;
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuaterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        chooseFlavourState = new ChooseFlavour(this);

        if (numberOfGumballs > 0) {
            this.state = noQuarterState;
        }

    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A " + flavour + " gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void choose(String flavour) {
        this.flavour = flavour;
        System.out.println("You have chosen the flavor " + flavour);
        state.chooseFlavor();

    }


    public void setState(State state)
    {
        this.state = state;
    }

    public State getSoldState() {
        return soldState;
    }


    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getChooseFlavourState() {
        return chooseFlavourState;
    }

    public String getFlavour() {
        return flavour;
    }

    public State getState() {
        return state;
    }
}
