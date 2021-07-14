package Iterator_compose;

import java.util.Iterator;

/**
 * Package:Iterator_compose
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
