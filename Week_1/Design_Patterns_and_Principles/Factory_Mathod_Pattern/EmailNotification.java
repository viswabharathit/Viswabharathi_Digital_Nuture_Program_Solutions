package Design_Patterns_and_Principles.Factory_Mathod_Pattern;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}