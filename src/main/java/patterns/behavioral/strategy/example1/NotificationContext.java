package patterns.behavioral.strategy.example1;

public class NotificationContext {
    private NotificationStrategy notificationStrategy;

    public NotificationContext(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void sendNotify(){
        notificationStrategy.notifyMethod();
    }
}
