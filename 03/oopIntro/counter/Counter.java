public class Counter {
    int currentCounter = 0;

    public Counter(int initValue) {
        currentCounter = initValue;
    }
    
    public Counter() {
        this(0);
    }
    
    public int getValue() {
        return currentCounter;
    }
    
    public void increase() {
        currentCounter++;
    }

    public void decrease() {
        currentCounter--;
    }

    public void reset() {
        currentCounter = 0;
    }
    
    public void setValue(int newValue) {
        currentCounter = newValue;
    }
}
