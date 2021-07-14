package Iterator_compose;

import java.util.Iterator;

/**
 * Package:Iterator_compose
 * Description:
 *
 * @author:鲍嘉鑫
 */
public abstract class MenuComponent {

    /**
     * 菜单
     *
     * @param menuComponent
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator createIterator();


    /**
     * 菜单项
     * @return
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }

}
