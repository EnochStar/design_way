package Iterator_compose;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Package:Iterator_compose
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Menu extends MenuComponent {
    String name;
    String description;
    ArrayList<MenuComponent> menuComponents;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }

    @Override
    public void print() {
        System.out.println("name:" + getName());

        System.out.println("-----");

        System.out.println("description:" + getDescription());
        Iterator iterator = menuComponents.iterator();
        if (iterator.hasNext()) {
            MenuComponent m = (MenuComponent) iterator.next();
            m.print();
        }
    }
}
