import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayFindTest {

    @Test
    public void testEmptyArray() {
        assertEquals(-1, ArrayFind.find(new int[] {}, 10));
        assertEquals(-1, ArrayFind.find(new int[] {}, 0));
    }

    @Test
    public void testNotFound() {
        assertEquals(-1, ArrayFind.find(new int[] { 1, 2, 3 }, 10));
        assertEquals(-1, ArrayFind.find(new int[] { -1, 1, 100 }, 0));
    }

    @Test
    public void testFindUnique() {
        assertEquals(0, ArrayFind.find(new int[] { 1, 2, 3 }, 1));
        assertEquals(1, ArrayFind.find(new int[] { -1, 1, 10, 100 }, 1));
        assertEquals(3, ArrayFind.find(new int[] { -1, 1, 10, 100 }, 100));
    }

    @Test
    public void testFindFirst() {
        assertEquals(0, ArrayFind.find(new int[] { 1, 2, 3, 1 }, 1));
        assertEquals(1, ArrayFind.find(new int[] { -1, 1, 10, 1, 100 }, 1));
        assertEquals(3, ArrayFind.find(new int[] { -1, 1, 10, 100, 100 }, 100));
    }
}
