package conform_model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Observable implements QuackObserver {
    ArrayList<Observer> observers = new ArrayList();
    QuackObserver duck;

    public Observable(QuackObserver duck) {
        this.duck = duck;
    }

    @Override
    public void notifyObserver() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer o = (Observer) iterator.next();
            o.update(duck);
        }
    }

    @Override
    public void registryObserver(Observer observer) {
        observers.add(observer);
    }
}
