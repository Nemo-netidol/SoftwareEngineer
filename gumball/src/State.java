enum StateMachine {
    NO_QUARTER,
    HAS_QUARTER,
    GUMBALL_SOLD,
    OUT_OF_GUMBALL
}

public class State {
    /*
    6510405458
    Nakorn Boonprasong
    */

    private int gumball;
    private StateMachine state;

    public State(int gumball) {
        this.gumball = gumball;
        this.state = gumball > 0 ? StateMachine.NO_QUARTER : StateMachine.OUT_OF_GUMBALL;
    }


    public void insertQuarter() {
        if (gumball < 1) {
            state = StateMachine.OUT_OF_GUMBALL;
            System.out.println("Out of gumballs!");
            System.out.println("You can't insert a quarter, the machine is sold out");
        }
        else if (state == StateMachine.HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        }
        else {
            System.out.println("You inserted a quarter");
            setState(StateMachine.HAS_QUARTER);
        }

    }

    public void ejectQuarter() {
        if (state ==  StateMachine.NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        }
        setState(StateMachine.NO_QUARTER);
        System.out.println("Quarter returned");

    }

    public void turnCrank() {
        if (state ==  StateMachine.OUT_OF_GUMBALL) {
            System.out.println("You turned, but there are no gumballs");
        }
        else if (state == StateMachine.NO_QUARTER) {
            System.out.println("You turned, but there's no quarter");
        } else if (state == StateMachine.HAS_QUARTER) {

            System.out.println("You turned...");
            setState(StateMachine.GUMBALL_SOLD);
            dispenseGumball();

        }
    }

    public void dispenseGumball() {
        if ( state == StateMachine.NO_QUARTER ) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == StateMachine.GUMBALL_SOLD) {
            if (gumball > 0) {
                setGumball(gumball -= 1);
                System.out.println("A gumball comes rolling out the slot");
                setState(StateMachine.NO_QUARTER);
            }
            else {
                outOfGumball();
                setState(StateMachine.OUT_OF_GUMBALL);
            }
        }

    }

    public void outOfGumball() {
        System.out.println("Oops, out of gumballs!");
    }


    public int getGumball() {
        return gumball;
    }

    public void setGumball(int gumball) {
        this.gumball = gumball;
    }

    public StateMachine getState() {
        return state;
    }

    public void setState(StateMachine state) {
        this.state = state;
    }
}
