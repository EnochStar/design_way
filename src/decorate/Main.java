package decorate;

/**
 * Package:decorate
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso("tall");
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage1 = new HouseBlend("tall");
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());
    }
}
