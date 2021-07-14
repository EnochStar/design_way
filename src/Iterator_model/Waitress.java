package Iterator_model;

import java.util.Iterator;

/**
 * Package:Iterator_model
 * Description:
 * 服务员
 * @author:鲍嘉鑫
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator iterator1 = pancakeHouseMenu.createIterator();
        Iterator iterator2 = dinerMenu.createIterator();

        System.out.println("--------pancakeHouse----------");
        printMenu(iterator1);

        System.out.println("--------diner----------");
        printMenu(iterator2);
    }

    private void printMenu(Iterator iterator) {
        if (iterator.hasNext()) {
            MenuItem next = (MenuItem) iterator.next();
            System.out.println(next.getDescription());
            System.out.println(next.getName());
            System.out.println(next.getPrice());
        }
    }
}
