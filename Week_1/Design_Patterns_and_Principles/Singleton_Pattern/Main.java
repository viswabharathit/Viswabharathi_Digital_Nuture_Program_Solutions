package Design_Patterns_and_Principles.Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.log("This is the first message.");

        Singleton singleton2 = Singleton.getInstance();
        singleton2.log("This is the second message.");

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton works!");
        } else {
            System.out.println("Instances are different. Singleton failed.");
        }
    }
}
