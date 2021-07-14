package factory;

/**
 * Package:factory
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        topping.add("Grated Reggiano Cheese");
    }
}
