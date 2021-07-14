package police_duck_design.behaviorImpl;

import police_duck_design.behavior.FlyBehavior;

/**
 * Package:duce_design.behaviorImpl
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
