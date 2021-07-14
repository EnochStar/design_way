package factory;

import java.beans.AppletInitializer;

/**
 * Package:factory
 * Description:
 *
 * @author:鲍嘉鑫
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cute();
        return pizza;
    }
    public abstract Pizza createPizza(String type);
}
