import static org.junit.Assert.*;

import org.junit.Test;

public class InversionTest {
     
    @Test
    public void testEmptyArray() {
        assertEquals(0, Inversion.count(new int[] {}));
    }

    @Test
    public void testOneElement() {
        assertEquals(0, Inversion.count(new int[] { 7 }));
    }

    @Test
    public void testTwoElements() {
        assertEquals(0, Inversion.count(new int[] { 1, 7 }));
        assertEquals(1, Inversion.count(new int[] { 7, 3 }));
    }

    @Test
    public void testSorted() {
        assertEquals(0, Inversion.count(new int[] { 1, 2, 3, 4, 5, 6 }));
        assertEquals(6, Inversion.count(new int[] { 6, 5, 4, 3 }));
    }

    @Test
    public void testList() {
        assertEquals(2, Inversion.count(new int[] { 1, 3, 2, 5, 4 }));
        assertEquals(4, Inversion.count(new int[] { 6, 5, 10, 3 }));
    }
}
