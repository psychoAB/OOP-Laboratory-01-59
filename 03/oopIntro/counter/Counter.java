public class Counter {
    int currentCounter = 0;
    
    public int getValue() {
        return currentCounter;
    }
    
    public void increase() {
        currentCounter++;
    }

    public void reset() {
        currentCounter = 0;
    }
}
