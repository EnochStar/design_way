package conform_model;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class QuackCounter implements Quackable {

    private Quackable quackable;
    private static int counter;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void notifyObserver() {
        quackable.notifyObserver();
    }

    @Override
    public void registryObserver(Observer observer) {
        quackable.registryObserver(observer);
    }
}
