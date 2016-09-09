import java.util.Arrays;

public class Median3 {
    public static int median(int a, int b, int c) {
        int[] data = {a, b, c};
        Arrays.sort(data);
        return data[1];
    }
}
