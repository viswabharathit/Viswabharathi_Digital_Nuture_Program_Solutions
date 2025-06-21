package Design_Patterns_and_Principles.Factory_Mathod_Pattern;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory;

        // You can change the factory type at runtime
        factory = new EmailNotificationFactory();
        factory.notifyUser();

        factory = new SMSNotificationFactory();
        factory.notifyUser();

        factory = new PushNotificationFactory();
        factory.notifyUser();
    }
}
