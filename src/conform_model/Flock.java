package conform_model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Flock implements Quackable{
    private ArrayList<Quackable> quackables = new ArrayList<>();
    Observable observable;

    void add(Quackable quackable) {
        quackables.add(quackable);

    }

    @Override
    public void quack() {
        Iterator iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable quackable  = (Quackable) iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void notifyObserver() {
    }

    @Override
    public void registryObserver(Observer observer) {
        Iterator iterator = quackables.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.registryObserver(observer);
        }
    }
}
