package practice_policy.person;

import practice_policy.Character;

/**
 * Package:practice_policy
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Queen extends Character {

    @Override
    public void fight() {
        weapon.useWeapon();
    }

}
