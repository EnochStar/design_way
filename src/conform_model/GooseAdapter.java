package conform_model;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class GooseAdapter implements Quackable {
    private Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public void registryObserver(Observer observer) {

    }
}
