package Project_BitValue;

public class Bits {
    public static void main(String[] args) {
        BitValue b1 = new BitValue();
        BitValue b2 = new BitValue();
        BitValue b3 = new BitValue();

        System.out.println("Is b2 set? " + b2.isTrue());
        
        b2.setBitValue(true);
        b1.setBitValue(true);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    
    
    }


}
