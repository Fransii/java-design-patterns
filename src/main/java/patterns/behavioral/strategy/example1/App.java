package patterns.behavioral.strategy.example1;

public class App {

    public static void main(String[] args) {
        NotificationContext context = new NotificationContext(new EmailNotification());
        context.sendNotify();

        context.setNotificationStrategy(new SmsNotification());
        context.sendNotify();
    }
}
