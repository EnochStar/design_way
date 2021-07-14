package Iterator_model;

import java.util.Iterator;

/**
 * Package:Iterator_model
 * Description:
 * 迭代器模式
 * @author:鲍嘉鑫
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int index = 0;


    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (index < items.length && items[index] != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[index];
        index++;
        return menuItem;
    }
}
