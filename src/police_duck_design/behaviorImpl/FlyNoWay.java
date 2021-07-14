package police_duck_design.behaviorImpl;

import police_duck_design.behavior.FlyBehavior;

/**
 * Package:duce_design.behaviorImpl
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can not fly");
    }
}
