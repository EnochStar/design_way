package practice_policy;

import practice_policy.person.King;
import practice_policy.weapon.AxeBehavior;

/**
 * Package:practice_policy
 * Description:
 * 所有人 默认使用到武器是宝剑
 * 可在运行时修改武器使用
 * @author:鲍嘉鑫
 */
public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new AxeBehavior());
        king.fight();
    }
}
