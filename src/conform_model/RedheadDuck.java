package conform_model;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class RedheadDuck implements Quackable{
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("red head duck!");
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }

    @Override
    public void registryObserver(Observer observer) {
        observable.registryObserver(observer);
    }
}
