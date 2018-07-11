package dp.singleton;

/**
 * 懒汉式单例模式创建
 */
public class Singleton2 {
    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
