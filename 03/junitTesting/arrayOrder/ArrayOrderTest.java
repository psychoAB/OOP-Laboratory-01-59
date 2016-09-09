import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayOrderTest {
    @Test
    public void testOneElement() {
        assertTrue(ArrayOrder.isAscending(new int[] { 1 }));
        assertTrue(ArrayOrder.isAscending(new int[] { -10 }));
        assertTrue(ArrayOrder.isAscending(new int[] { 0 }));
    }

    @Test
    public void testTwoElements() {
        assertTrue(ArrayOrder.isAscending(new int[] { 1, 2 }));
        assertTrue(ArrayOrder.isAscending(new int[] { -10, 9 }));
        assertTrue(ArrayOrder.isAscending(new int[] { 0, 1 }));
        assertFalse(ArrayOrder.isAscending(new int[] { 2, 1 }));
        assertFalse(ArrayOrder.isAscending(new int[] { -9, -10 }));
        assertFalse(ArrayOrder.isAscending(new int[] { 1, 0 }));
    }

    @Test
    public void testSimpleList() {
        assertTrue(ArrayOrder.isAscending(new int[] { 1, 2, 5, 7 }));
        assertTrue(ArrayOrder.isAscending(new int[] { -1, 10, 50 }));
        assertFalse(ArrayOrder.isAscending(new int[] { 50, 60, 70, 60 }));
        assertFalse(ArrayOrder.isAscending(new int[] { 10, 9, 8, 7, 6, 5 }));
    }

    @Test
    public void testWithDuplicates() {
        assertTrue(ArrayOrder.isAscending(new int[] { 0,0 }));
        assertTrue(ArrayOrder.isAscending(new int[] { 100, 100 }));
        assertTrue(ArrayOrder.isAscending(new int[] { 1, 1, 3 }));
        assertTrue(ArrayOrder.isAscending(new int[] { 0, 1, 1, 1 }));
        assertFalse(ArrayOrder.isAscending(new int[] { 2, 1, 3, 3 }));
        assertFalse(ArrayOrder.isAscending(new int[] { 0, 0, 1, 1, 4, 4, 2 }));
    }
}
