package decorate;

/**
 * Package:decorate
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Espresso extends Beverage {

    public Espresso(String size) {
        description="espresso";
        this.size = size;
    }


    @Override
    public double cost() {
        double cost = 0;
        if (getSize() .equals(Beverage.TALL) ) {
            cost += 0.1;
        }else if (getSize() .equals(Beverage.GRANDE)) {
            cost += 0.15;
        }else if (getSize() .equals(Beverage.VENTI)){
            cost += 0.2;
        }
        cost += 1.99;
        System.out.println("Espresso:" + getSize() + " cost:"+cost);
        return cost;
    }
}
