package patterns.behavioral.observer.example1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class YoutubeChannelTest {

    private Subject subject;

    @Mock
    private Observer mockObserver;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        subject = new YoutubeChannel();
    }

    @Test
    public void registerObserver() {
        final int observersCount = 1;

        subject.registerObserver(mockObserver);

        assertEquals(observersCount, subject.getObservers().size());
    }


    @Test
    public void unregisterObserver() {
        final int observersCount = 0;

        subject.registerObserver(mockObserver);
        subject.unregisterObserver(mockObserver);

        assertEquals(observersCount, subject.getObservers().size());
    }

    @Test
    public void notifyObservers() {
        Mockito.doNothing().when(mockObserver).update();

        subject.registerObserver(mockObserver);
        subject.notifyObservers();

        verify(mockObserver, times(1)).update();
    }
}