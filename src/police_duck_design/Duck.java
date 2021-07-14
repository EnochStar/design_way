package police_duck_design;

import police_duck_design.behavior.FlyBehavior;
import police_duck_design.behavior.QuarkBehavior;

/**
 * Package:duce_design
 * Description:
 *
 * @author:鲍嘉鑫
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuarkBehavior quarkBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performDuck() {
        quarkBehavior.quark();
    }

    public abstract void show();


}
