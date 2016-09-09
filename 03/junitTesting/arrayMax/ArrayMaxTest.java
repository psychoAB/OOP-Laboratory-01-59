import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayMaxTest {

    @Test
    public void testOneElement() {
        assertEquals(0, ArrayMax.max(new int[] { 0 }));
        assertEquals(100, ArrayMax.max(new int[] { 100 }));
        assertEquals(-10, ArrayMax.max(new int[] { -10 }));
    }

    @Test
    public void testWithNoDuplicate() {
        assertEquals(5, ArrayMax.max(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals(5, ArrayMax.max(new int[] { 5, 4, 3 }));
        assertEquals(200, ArrayMax.max(new int[] { 100, 200, 50, 40 }));
        assertEquals(-5, ArrayMax.max(new int[] { -10, -20, -60, -5 }));
    }

    @Test
    public void testWithDuplicate() {
        assertEquals(5, ArrayMax.max(new int[] { 1, 2, 3, 5, 3, 4, 5 }));
        assertEquals(5, ArrayMax.max(new int[] { 5, 4, 3, 3, 4 }));
        assertEquals(130, ArrayMax.max(new int[] { 100, 130, 100, 50, 50, 40 }));
        assertEquals(-7, ArrayMax.max(new int[] { -10, -20, -7, -10, -60, -7 }));
    }
}
