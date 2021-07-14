package police_duck_design;

/**
 * Package:duce_design
 * Description:
 * 使用到了策略模式
 * @author:鲍嘉鑫
 */
public class Main {
    public static void main(String[] args) {
        Duck greenDuck = new GreenDuck();
        greenDuck.performFly();
        greenDuck.performDuck();
        greenDuck.show();
    }
}
