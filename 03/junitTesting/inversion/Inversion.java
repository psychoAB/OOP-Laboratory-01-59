public class Inversion {
    public static int count(int[] ar) {
        int arrayLength = ar.length;
        int count = 0;
        
        for(int index = 0; index < arrayLength; index++) {
            for(int pairIndex = index; pairIndex < arrayLength; pairIndex++) {
                if(ar[index] > ar[pairIndex]) {
                    count++;
                }
            }
        }
        return count;
    }
}
