public class Counter {
    int initValue = 0;
    int currentCounter = 0;

    public Counter(int __initValue) {
        initValue = __initValue;
        currentCounter = __initValue;
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

    public void resetToInit() {
        currentCounter = initValue;
    }
    
    public void setValue(int newValue) {
        currentCounter = newValue;
    }
}
