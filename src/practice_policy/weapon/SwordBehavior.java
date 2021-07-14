package practice_policy.weapon;

import practice_policy.WeaponBehavior;

/**
 * Package:practice_policy
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("use sword kill");
    }
}
