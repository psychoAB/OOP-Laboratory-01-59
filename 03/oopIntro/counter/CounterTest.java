import static org.junit.Assert.*;

public class CounterTest {
    
    @test
    public void testShouldBeAbleToCreateCounter() {
        Counter counter = new Counter();
        assertNotEquals(null, counter);
    }

    public void testCounterShouldReturnZeroAfterCreated() {
        Counter counter = new Counter();
        assertEquals(0, counter.getValue())
    }
    
    public void testCounterShouldIncreaseByOne() {
        Counter counter = new Counter();
        counter.increase();
        assertEquals(1, counter.getValue());
        counter.increase();
        assertEquals(2, counter.getValue());
    }
}
