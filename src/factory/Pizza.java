package factory;

import java.util.ArrayList;

/**
 * Package:factory
 * Description:
 *
 * @author:鲍嘉鑫
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList topping = new ArrayList();

    void prepare() {
        System.out.println("preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce");
        for (int i = 0;i < topping.size();i++) {
            System.out.println(" " + topping.get(i));
        }
    }

    void bake() {
        System.out.println("bake for 25minutes at 350");
    }

    void cute() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
