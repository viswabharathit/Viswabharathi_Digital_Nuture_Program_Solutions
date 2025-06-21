package Design_Patterns_and_Principles.Factory_Mathod_Pattern;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}