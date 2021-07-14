package decorate;

/**
 * Package:decorate
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class HouseBlend extends Beverage {

    public HouseBlend(String size) {
        description = "house blend coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        double cost = 0;
        if (getSize() .equals(Beverage.TALL)){
            cost += 0.1;
        }else if (getSize() .equals(Beverage.GRANDE)){
            cost += 0.15;
        }else if (getSize() .equals(Beverage.VENTI)){
            cost += 0.2;
        }
        cost += 0.89;
        System.out.println("HouseBlend:" + getSize() + " cost:"+cost);
        return cost;
    }
}
