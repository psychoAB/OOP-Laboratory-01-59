public class Counter {
    int initValue = 0;
    int currentCounter = 0;
    int stepSize = 1;

    public Counter(int __initValue) {
        initValue = __initValue;
        currentCounter = __initValue;
    }

    public Counter(int __initValue, int __stepSize) {
        initValue = __initValue;
        currentCounter = __initValue;
        stepSize = __stepSize;
    }
    
    public Counter() {
        this(0);
    }
    
    public int getValue() {
        return currentCounter;
    }
    
    public void increase() {
        currentCounter += stepSize;
    }

    public void decrease() {
        currentCounter -= stepSize;
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
