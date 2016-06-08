/**
 * Created by Administrator on 2016/3/30.
 */
public class Singleton {
    private static Singleton singleton;

    public static Singleton getInstance() {
        // write your code here
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
