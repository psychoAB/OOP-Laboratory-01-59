public class ArrayOrder {
    public static boolean isAscending(int[] ar) {
        int arrayLength = ar.length;
        int lastElement = ar[0];

        for(int index = 1; index < arrayLength; index++) {
            if (lastElement > ar[index]){
                return false;
            }
            lastElement = ar[index];
        }
        return true;
    }
}
