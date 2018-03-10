package patterns.behavioral.strategy.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmsNotification implements NotificationStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(SmsNotification.class);

    @Override
    public void notifyMethod() {
        LOGGER.info("Send SMS notification...");
    }
}
