package police_duck_design;

import police_duck_design.behavior.FlyBehavior;
import police_duck_design.behaviorImpl.FlyWithWings;
import police_duck_design.behaviorImpl.Quark;

/**
 * Package:duce_design
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class GreenDuck extends Duck {
    public GreenDuck() {
        flyBehavior = new FlyWithWings();
        quarkBehavior = new Quark();
    }

    @Override
    public void show() {
        System.out.println("I am green duck");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
