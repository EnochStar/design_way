package state_model;

/**
 * Package:state_model
 * Description:
 * 状态
 * @author:鲍嘉鑫
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
