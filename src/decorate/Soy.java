package decorate;

/**
 * Package:decorate
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + ",Soy";
    }

    @Override
    public double cost() {
        double cost = 0.29 + beverage.cost();

        return cost;
    }
}
