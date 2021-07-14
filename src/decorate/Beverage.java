package decorate;

/**
 * Package:decorate
 * Description:
 *
 * @author:鲍嘉鑫
 */
public abstract class Beverage {

    String description="Unknown Beverage";

    String size;

    public final static String TALL = "tall";

    public final static String GRANDE = "grande";

    public final static String VENTI = "venti";

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
