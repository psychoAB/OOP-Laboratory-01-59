import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {
    
    @Test
    public void testShouldBeAbleToCreateCounter() {
        Counter counter = new Counter();
        assertNotEquals(null, counter);
    }

    @Test
    public void testCounterShouldReturnZeroAfterCreated() {
        Counter counter = new Counter();
        assertEquals(0, counter.getValue());
    }
    
    @Test
    public void testCounterShouldIncreaseByOne() {
        Counter counter = new Counter();
        counter.increase();
        assertEquals(1, counter.getValue());
        counter.increase();
        assertEquals(2, counter.getValue());
    }
}
