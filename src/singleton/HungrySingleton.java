package singleton;

/**
 * Package:singleton
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
