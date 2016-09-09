public class ArrayFind {
    public static int find(int[] ar, int x) {
        int arrayLength = ar.length;
        
        for(int index = 0; index < arrayLength; index++) {
            if(ar[index] == x) {
                return index;
            }
        }
        return -1;
    }
}
