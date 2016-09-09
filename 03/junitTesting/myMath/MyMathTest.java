import static org.junit.Assert.*;
 
import org.junit.Test;
 
public class MyMathTest {
     
    @Test
    public void testAbsZero() {
        assertEquals(0, MyMath.abs(0));
    }

    @Test
    public void testAbsPositive() {
        assertEquals(100, MyMath.abs(100));
    }

    @Test
    public void testAbsNegative() {
        assertEquals(50, MyMath.abs(-50));
    }
}
