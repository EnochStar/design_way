package police_duck_design.behaviorImpl;

import police_duck_design.behavior.QuarkBehavior;

/**
 * Package:duce_design.behaviorImpl
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Quark implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("quark quark quark");
    }
}
