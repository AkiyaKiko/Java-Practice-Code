package Project_BitValue;

/**
 * BitValue
 */
public class BitValue {

    private boolean bitvalue;
    public BitValue () {
        bitvalue = false;

    }

    public boolean isTrue() {
        return bitvalue;

    }

    public void setBitValue (boolean status) {
        bitvalue = status;

    }

    public String toString() {
        return "Bit Value:" + bitvalue;

    }

    
}