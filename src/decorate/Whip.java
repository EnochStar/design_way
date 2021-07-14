package decorate;

/**
 * Package:decorate
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return  beverage.description + ",Whip";
    }

    @Override
    public double cost() {
        return 0.29 + beverage.cost();
    }
}
