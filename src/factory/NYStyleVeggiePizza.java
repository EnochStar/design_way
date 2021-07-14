package factory;

/**
 * Package:factory
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        topping.add("Grated Reggiano Veggie");
    }
}
