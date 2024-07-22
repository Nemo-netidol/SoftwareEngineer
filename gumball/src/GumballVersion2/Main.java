package GumballVersion2;

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3);

//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();
    }

}
