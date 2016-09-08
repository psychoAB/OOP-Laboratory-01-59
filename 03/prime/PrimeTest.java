public class PrimeTest {
     
    @Test
    public void testPrime() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(157));
        assertTrue(Prime.isPrime(56687));
        assertTrue(Prime.isPrime(102551));
    }

    @Test
    public void testComposite() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(200));
        assertFalse(Prime.isPrime(75));
        assertFalse(Prime.isPrime(396809));
        assertFalse(Prime.isPrime(96172057));
    }

    @Test
    public void testOne() {
        assertFalse(Prime.isPrime(1));
    }
}
