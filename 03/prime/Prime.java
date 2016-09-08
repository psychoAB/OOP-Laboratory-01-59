public class Prime {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for(int divider = 2; divider < n; divider++) {
            if (n != divider && n % divider == 0)
            {
                return false;
            }
        }
        return true;
    }
}
