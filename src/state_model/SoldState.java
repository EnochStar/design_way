package state_model;

/**
 * Package:state_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait,we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Oops out of gumball");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
