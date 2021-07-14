package conform_model;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class DuckCall implements Quackable{
    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("duck call!");
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
