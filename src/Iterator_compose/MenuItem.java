package Iterator_compose;

import java.util.Iterator;

/**
 * Package:Iterator_compose
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public Iterator createIterator(){
        return new NullIterator();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println("MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", vegetarian=" + vegetarian +
                '}');
    }

}
