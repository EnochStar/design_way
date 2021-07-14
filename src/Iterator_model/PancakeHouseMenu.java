package Iterator_model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Package:Iterator_model
 * Description:
 * 采用ArrayList存储元素的餐厅
 * @author:鲍嘉鑫
 */
public class PancakeHouseMenu {
    ArrayList<MenuItem> menuList;

    public PancakeHouseMenu(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuList);
    }
}
