package state_model;

/**
 * Package:state_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("there are no more gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("there are no quarteer");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("the gumball is sold out");
    }
}
