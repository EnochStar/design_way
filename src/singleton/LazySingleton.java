package singleton;

/**
 * Package:singleton
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class LazySingleton {
    private volatile static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class){
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
