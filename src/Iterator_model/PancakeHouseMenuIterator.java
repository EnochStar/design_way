package Iterator_model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Package:Iterator_model
 * Description:
 * 迭代器模式
 * @author:鲍嘉鑫
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<MenuItem> pancakeHouseMenuArrayList;
    int index = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> pancakeHouseMenuArrayList) {
        this.pancakeHouseMenuArrayList = pancakeHouseMenuArrayList;
    }

    @Override
    public boolean hasNext() {
        return index != pancakeHouseMenuArrayList.size() && pancakeHouseMenuArrayList.get(index) != null;
    }

    @Override
    public Object next() {
        return pancakeHouseMenuArrayList.get(index++);
    }
}
