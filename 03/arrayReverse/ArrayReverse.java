public class ArrayReverse {
    public static int[] reverse(int[] ar) {
        int[] res = new int[ar.length];
        int arrayLength = ar.length;
        
        for (int index = 0; index < arrayLength; index++)
        {
            res[index] = ar[arrayLength - index - 1];
        }
        return res;
    } 
}
