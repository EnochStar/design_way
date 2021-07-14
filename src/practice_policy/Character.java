package practice_policy;

import practice_policy.weapon.SwordBehavior;

/**
 * Package:practice_policy
 * Description:
 *
 * @author:鲍嘉鑫
 */
public abstract class Character {
    protected WeaponBehavior weapon;

    public Character() {
        this.weapon = new SwordBehavior();
    }

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
