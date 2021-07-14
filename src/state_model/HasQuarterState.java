package state_model;

import java.util.Random;

/**
 * Package:state_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class HasQuarterState implements State{

    GumballMachine gumballMachine;
    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = random.nextInt(10);
        if ((winner == 10) && (gumballMachine.getCount() > 0)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
