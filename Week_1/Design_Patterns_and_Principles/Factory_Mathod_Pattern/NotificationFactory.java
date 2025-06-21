package Design_Patterns_and_Principles.Factory_Mathod_Pattern;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void notifyUser() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}