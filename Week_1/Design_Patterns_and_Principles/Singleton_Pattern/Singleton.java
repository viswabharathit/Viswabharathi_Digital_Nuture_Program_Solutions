package Design_Patterns_and_Principles.Singleton_Pattern;

public class Singleton {
    private static volatile Singleton singleInstance = null;

    private Singleton() {
        System.out.println("Singleton initialized.");
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            synchronized (Singleton.class) {
                if (singleInstance == null) {
                    singleInstance = new Singleton();
                }
            }
        }
        return singleInstance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
