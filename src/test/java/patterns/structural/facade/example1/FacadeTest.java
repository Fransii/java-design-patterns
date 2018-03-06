package patterns.structural.facade.example1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class FacadeTest {

    private  Facade facade;

    @Mock
    private FirstComplicatedClass firstComplicatedClass;

    @Mock
    private SecondComplicatedClass secondComplicatedClass;

    @Mock
    private ThirdComplicatedClass thirdComplicatedClass;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        facade = new Facade(firstComplicatedClass, secondComplicatedClass, thirdComplicatedClass);
    }

    @Test
    public void doSomething() {
        Mockito.doNothing().when(firstComplicatedClass).doFirstComplicatedStuff();
        Mockito.doNothing().when(secondComplicatedClass).doSecondComplicatedStuff();
        Mockito.doNothing().when(thirdComplicatedClass).doThirdComplicatedStuff();

        facade.doSomething();

        verify(firstComplicatedClass, times(1)).doFirstComplicatedStuff();
        verify(secondComplicatedClass, times(1)).doSecondComplicatedStuff();
        verify(thirdComplicatedClass, times(1)).doThirdComplicatedStuff();
    }
}