package conform_model;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class RubberDuck implements Quackable{
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("rubber duck!");
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
