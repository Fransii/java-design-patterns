package patterns.behavioral.strategy.example1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class NotificationContextTest {

    @Mock
    private NotificationStrategy SMSStrategy;

    @Mock
    private NotificationStrategy EMAILStrategy;

    @BeforeEach
    void setUpBefore(){
        SMSStrategy = Mockito.mock(SmsNotification.class);
        EMAILStrategy = Mockito.mock(EmailNotification.class);
    }

    @Test
    void changeStrategyTest(){

        NotificationContext context = new NotificationContext(SMSStrategy);
        context.sendNotify();

        verify(SMSStrategy, times(1)).notifyMethod();

        context.setNotificationStrategy(EMAILStrategy);
        context.sendNotify();

        verify(EMAILStrategy, times(1)).notifyMethod();

    }
}