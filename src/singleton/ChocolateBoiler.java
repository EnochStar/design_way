package singleton;

/**
 * Package:singleton
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler instance;

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

}
