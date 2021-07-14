package conform_model;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class QuackLogist implements Observer {

    @Override
    public void update(QuackObserver duck) {
        System.out.println("QuackLogist : " + duck + "just quack");
    }
}
