package Iterator_model;

import java.util.Iterator;

/**
 * Package:Iterator_model
 * Description:
 * 采用数组存储元素的餐厅
 * @author:鲍嘉鑫
 */
public class DinerMenu {
    private MenuItem[] menuItems;
    static final int MAX_ITEMS = 6;
    int index = 0;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(MenuItem menuItem) {
        if (index == MAX_ITEMS) {
            System.out.println("菜单项满了，无法添加菜单");
            return;
        }
        menuItems[index] = menuItem;
        index++;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
