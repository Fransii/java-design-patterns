package patterns.behavioral.strategy.example1;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotificationStrategyTest {

    private TestAppender testAppender;

    private NotificationStrategy SMSStrategy;

    private NotificationStrategy EMAILStrategy;

    @BeforeEach
    void setUpBefore(){
        SMSStrategy = new SmsNotification();
        EMAILStrategy = new EmailNotification();
        testAppender = new TestAppender();
    }

    @Test
    void smsStrategyTest(){
        NotificationContext context = new NotificationContext(SMSStrategy);
        context.sendNotify();

        assertEquals(1, testAppender.logs.size());
        assertEquals("Send SMS notification...", testAppender.logs.get(0).getFormattedMessage());
    }

    @Test
    void emailStaregyTest(){
        NotificationContext context = new NotificationContext(EMAILStrategy);
        context.sendNotify();

        assertEquals(1, testAppender.logs.size());
        assertEquals("Send email notofication....", testAppender.logs.get(0).getFormattedMessage());
    }

    // TODO parametrized test instead of two tests: smsStrategyTest and emailStaregyTest

    class TestAppender extends AppenderBase<ILoggingEvent> {

        private List<ILoggingEvent> logs = new ArrayList<>();

        TestAppender() {
            ((Logger) LoggerFactory.getLogger("root")).addAppender(this);
            start();
        }

        @Override
        protected void append(ILoggingEvent eventObject) {
            logs.add(eventObject);
        }
    }
}