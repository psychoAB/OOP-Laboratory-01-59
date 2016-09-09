public class ArrayCountCond {
    public static int countGreaterThan(int[] ar, int x) {
        int arrayLenth = ar.length;
        int count = 0;

        for(int index = 0; index < arrayLenth; index++) {
            if(ar[index] > x) {
                count++;
            }
        }
        return count;
    }
}
