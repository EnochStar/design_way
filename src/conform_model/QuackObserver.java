package conform_model;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public interface QuackObserver {
    void notifyObserver();
    void registryObserver(Observer observer);
}
