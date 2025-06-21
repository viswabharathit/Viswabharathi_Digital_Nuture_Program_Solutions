package Design_Patterns_and_Principles.Factory_Mathod_Pattern;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}