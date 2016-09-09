import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayCountCondTest {

    @Test
    public void testEmptyArray() {
        assertEquals(0, ArrayCountCond.countGreaterThan(new int[] {}, 100));
    }

    @Test
    public void testNoGreaterThan() {
        assertEquals(0, 
        ArrayCountCond.countGreaterThan(new int[] { 200, 300 }, 400));
        assertEquals(0, 
        ArrayCountCond.countGreaterThan(new int[] { 100, 200 }, 300));
    }

    @Test
    public void testSomeGreaterThan() {
        assertEquals(1, 
        ArrayCountCond.countGreaterThan(new int[] { 301, 200, 300 }, 300));
        assertEquals(2, 
        ArrayCountCond.countGreaterThan(new int[] { 99, 100, 200, 5, 300 }, 100));
    }
}
