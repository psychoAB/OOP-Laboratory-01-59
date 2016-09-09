import static org.junit.Assert.*;
 
import org.junit.Test;

public class Median3Test {

    @Test
    public void testDistinctIntegers() {
        assertEquals(2, Median3.median(1, 2, 3));
        assertEquals(2, Median3.median(3, 2, 1));
        assertEquals(2, Median3.median(1, 3, 2));
        assertEquals(2, Median3.median(3, 1, 2));
    }

    @Test
    public void testWithNegativeIntegers() {
        assertEquals(2, Median3.median(-1, 2, 3));
        assertEquals(1, Median3.median(3, -2, 1));
        assertEquals(-2, Median3.median(1, -3, -2));
        assertEquals(-1, Median3.median(3, -1, -2));
    }

    @Test
    public void testDuplicates() {
        assertEquals(2, Median3.median(2, 2, 1));
        assertEquals(1, Median3.median(1, 3, 1));
        assertEquals(-1, Median3.median(3, -1, -1));
    }

    @Test
    public void testAllEqual() {
        assertEquals(2, Median3.median(2, 2, 2));
        assertEquals(-1, Median3.median(-1, -1, -1));
        assertEquals(0, Median3.median(0, 0, 0));
    }
}
