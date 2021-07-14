package Iterator_compose;

import java.util.Iterator;

/**
 * Package:Iterator_compose
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent menuComponent) {
        allMenus = menuComponent;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarian() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("--------Vegetarian Menu------");
        while (iterator.hasNext()) {
            MenuComponent mc = (MenuComponent) iterator.next();
            try{
                if (mc.isVegetarian()) {
                    mc.print();
                }
            }catch (UnsupportedOperationException u) {}
        }
    }
}
