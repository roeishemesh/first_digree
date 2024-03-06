public class Bit {

    private final boolean value;
    public static final Bit ONE = new Bit(true);
    public static final Bit ZERO = new Bit(false);

    public Bit(boolean value) {
        this.value = value;
    }

    public Bit(int intValue) {

        if (intValue == 0)
            value = false;
        else {
            if (intValue == 1)
                value = true;
            else throw new IllegalArgumentException(intValue + " is neither 0 nor 1.");
        }
    }

    public String toString() {
        return "" + toInt();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bit))
            return false;
        else return value == ((Bit) obj).value;
    }


    public int toInt() {
        int output;
        if (value)
            output = 1;
        else
            output = 0;
        return output;
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 1.1 ================================================
    //--------------Write your code below this line only-----------------------------------------------------------
    public static Bit fullAdderSum(Bit bit1, Bit bit2, Bit bit3) {
    	if(bit1.toInt() + bit2.toInt() + bit3.toInt() == 2 | bit1.toInt() + bit2.toInt() + bit3.toInt() == 0){
            return ZERO;
        }
        else{
            return ONE;
        }
    }

    public static Bit fullAdderCarry(Bit bit1, Bit bit2, Bit bit3) {
    	if(bit1.toInt() + bit2.toInt() + bit3.toInt() <= 1){
            return ZERO;
        }
        else {return ONE;}
    }

//=========================== Private methods of your own ================================================  
public static void main(String[] args) {
    Bit b0 = Bit.ZERO;
    Bit b1 = Bit.ONE;
    System.out.println(fullAdderCarry(b1,b1,b1));
}


//--------------write your code ABOVE this line only!!!---------------------------------------------------------


}
