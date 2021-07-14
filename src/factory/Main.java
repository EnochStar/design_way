package factory;

/**
 * Package:factory
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore ps = new NYPizzaStore();
        Pizza cheese = ps.orderPizza("cheese");
    }
}
