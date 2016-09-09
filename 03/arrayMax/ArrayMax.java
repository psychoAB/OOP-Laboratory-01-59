import java.util.Arrays;

public class ArrayMax {
    public static int max(int[] ar) {
        Arrays.sort(ar);
        return ar[ar.length - 1];
    }
}
