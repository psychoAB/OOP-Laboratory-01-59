import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {
    
    @Test
    public void testShouldBeAbleToCreateCounter() {
        Counter counter = new Counter();
        assertNotEquals(null, counter);
    }

    @Test
    public void testCounterShouldBeCreatedWithInitialValue() {
        Counter counter = new Counter(7);
        assertEquals(7, counter.getValue());
    }

    @Test
    public void testCounterShouldBeCreatedWithInitialValueAndStepSize() {
        Counter counter = new Counter(9,3);
        counter.increase();
        assertEquals(12, counter.getValue());
        counter.decrease();
        counter.decrease();
        assertEquals(6, counter.getValue());
    }

    @Test
    public void testCounterShouldReturnZeroAfterCreated() {
        Counter counter = new Counter();
        assertEquals(0, counter.getValue());
    }
    
    @Test
    public void testCounterShouldIncrease() {
        Counter counter = new Counter();
        counter.increase();
        assertEquals(1, counter.getValue());
        counter.increase();
        assertEquals(2, counter.getValue());
    }

    @Test
    public void testCounterShouldDecrease() {
        Counter counter = new Counter(7);
        counter.decrease();
        assertEquals(6, counter.getValue());
        counter.decrease();
        assertEquals(5, counter.getValue());
    }

    @Test
    public void testCounterShouldReset() {
        Counter counter = new Counter();
        counter.increase();
        counter.increase();
        counter.reset();
        assertEquals(0, counter.getValue());
    }
    
    @Test
    public void testCounterShouldResetToInit() {
        Counter counter = new Counter(21);
        counter.increase();
        counter.resetToInit();
        assertEquals(21, counter.getValue());
    }
    @Test
    public void testCounterShouldBeSetable() {
        Counter counter = new Counter();
        counter.setValue(10);
        assertEquals(10, counter.getValue());
    }
}
