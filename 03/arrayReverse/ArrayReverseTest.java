import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayReverseTest {
     
    @Test
    public void testEmptyArray() {
        assertArrayEquals(new int[] {}, 
        ArrayReverse.reverse(new int[] {}));    
    }

    @Test
    public void testOneElement() {
        assertArrayEquals(new int[] { 10 }, 
        ArrayReverse.reverse(new int[] { 10 }));    
        assertArrayEquals(new int[] { 20 }, 
        ArrayReverse.reverse(new int[] { 20 }));    
    }

    @Test
    public void testManyElements() {
        assertArrayEquals(new int[] { 50, 40, 30, 20, 10 }, 
        ArrayReverse.reverse(new int[] { 10, 20, 30, 40, 50 }));    
        assertArrayEquals(new int[] { 2, 1, 2, 1, 4 }, 
        ArrayReverse.reverse(new int[] { 4, 1, 2, 1, 2 }));    
    }
}
