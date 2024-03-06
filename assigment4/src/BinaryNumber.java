
import java.util.Iterator;

public class BinaryNumber implements Comparable<BinaryNumber> {

    private BitList bits;

    private static BinaryNumber Zero() {
        return new BinaryNumber(0);
    }

    private static BinaryNumber One() {
        return new BinaryNumber(1);
    }

    //Do not change this constructor
    private BinaryNumber(int i) {
        bits = new BitList();
        if (i == 0)
            bits.addFirst(Bit.ZERO);
        if (i == 1)
            bits.addFirst(Bit.ONE);
        else if (i != 0)
            throw new IllegalArgumentException("This Constructor may only get either zero or one.");
    }

    // Copy constructor
    //Do not change this constructor
    public BinaryNumber(BinaryNumber number) {
        bits = new BitList(number.bits);
    }


    //Do not change this method
    public int length() {
        return bits.size();
    }

    //Do not change this method
    public boolean isLegal() {
        return bits.isNumber() & bits.isReduced();
    }


    //----------write your code BELOW this line only!!!---------------------------------------------------------

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.1 ================================================
    public BinaryNumber(char c) {
        int num = (int) c - 48;
        if (num < 0 | num > 9) {
            throw new IllegalArgumentException("input should be char that represents num between 0-9");
        } else {
            bits = new BitList();
            if (num == 0) {
                bits.addLast(Bit.ZERO);
            }
            while (num > 0) {
                if (num % 2 == 0) {
                    bits.addLast(Bit.ZERO);
                } else {
                    bits.addLast(Bit.ONE);
                }
                num = num / 2;
            }
        }
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.2 ================================================
    public String toString() {
        String s = "";
        // Do not remove or change the next two lines
        if (!isLegal()) // Do not change this line
            throw new RuntimeException("I am illegal.");// Do not change this line
        Iterator<Bit> iter = bits.iterator();
        while (iter.hasNext()) {
            s = iter.next() + s;
        }
        return s;
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.3 ================================================
    public boolean equals(Object other) {
        boolean isEquel = true;
        if (other == null){
            throw new IllegalArgumentException("input cannot be null");
        }
        if (other instanceof BinaryNumber) {
            boolean size = this.bits.size() == ((BinaryNumber) other).bits.size();// check if the number has same size
            boolean numOf1 = this.bits.getNumberOfOnes() == ((BinaryNumber) other).bits.getNumberOfOnes();//check if the number has same number os one's
            if (!size || !numOf1) {
                isEquel = false;
            } else {
                for (int i = 0; i < this.bits.size() && isEquel; i++) {
                    Bit first = this.bits.get(i);
                    Bit sec = ((BinaryNumber) other).bits.get(i);
                    if (!first.equals(sec)) {
                        isEquel = false;
                    }
                }
            }
        }
        else {isEquel = false;}
        return isEquel;
    }
        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.4 ================================================
        public BinaryNumber add (BinaryNumber addMe){
        if (addMe == null){
            throw new IllegalArgumentException("fdh");
        }
            Bit sum;
            Bit carry = Bit.ZERO;
            BinaryNumber bn = new BinaryNumber(0);
            bn.bits.removeFirst();
            paddingTheSmall(this, addMe);
            Iterator<Bit> thisiter = this.bits.iterator();
            Iterator<Bit> addMeIter = addMe.bits.iterator();
            while (thisiter.hasNext()){
                Bit t = thisiter.next();
                Bit a = addMeIter.next();
                sum = Bit.fullAdderSum(t, a, carry);
                carry = Bit.fullAdderCarry(t, a, carry);
                bn.bits.addLast(sum);
            }
            bn.bits.addLast(carry);
            bn.bits.reduce();
            return bn;
        }

        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.5 ================================================
        public int compareTo (BinaryNumber other){
            if (other == null) {
                throw new IllegalArgumentException("the input should be only BinaryNumber type");
            }
            int ans = 0;
            boolean compared = false;
            paddingTheSmall(this, other); // padding the small number to prevent exception;
            for (int i = this.bits.size() - 1; i >= 0 & !compared; i--) {
                int thisLast = this.bits.get(i).toInt();
                int otherLast = other.bits.get(i).toInt();
                if (thisLast > otherLast) {
                    ans = 1;
                    compared = true;
                }
                if (otherLast > thisLast) {
                    ans = -1;
                    compared = true;
                }
            }
            return ans;
        }

        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.6 ================================================
        public BinaryNumber subtract (BinaryNumber subtractMe){
            if (subtractMe == null) {
                throw new IllegalArgumentException("the input should be only BinaryNumber type");
            }
            if(this.compareTo(subtractMe) < 0){
                throw new IllegalArgumentException("you cant subtract big num from small num");
            }
            subtractMe.bits.padding(this.bits.size());// padding the small number to the same size of the big num
            BinaryNumber bn = new BinaryNumber(0);
            bn.bits.removeFirst();// create empty BinaryNumber
            Iterator<Bit> thisIter = this.bits.iterator();
            Iterator<Bit> subIter = subtractMe.bits.iterator();
            int borrow = 0;
            int sum;
            while (thisIter.hasNext()){
                int bigNum = thisIter.next().toInt();
                int smallNum = subIter.next().toInt();
                sum = bigNum - smallNum - borrow;
                if (sum < 0){
                    sum = sum+2;
                    borrow = 1;
                }
                else {borrow = 0;}
                bn.bits.addLast(new Bit(sum));
            }
            bn.bits.reduce();
            return bn;
        }

        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.7 ================================================
        public int toInt () {
            // Do not remove or change the next two lines
            if (!isLegal()){ // Do not change this line
                throw new RuntimeException("I am illegal.");}// Do not change this line
            int sum = 0;
            int pow = 1;
            Iterator<Bit> iter = this.bits.iterator();
            while (iter.hasNext()){
                if (iter.next().equals(Bit.ONE)){
                    sum = sum + pow;
                }
                pow = pow * 2;
            }
            return sum;
        }


        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.8 ================================================
        public BinaryNumber multiply (BinaryNumber multiplyMe){
            BinaryNumber sum = new BinaryNumber('0');
            BinaryNumber add = new BinaryNumber('0');
            add.bits.clear();
            int addSize = 0;
            Iterator<Bit> thisIter = this.bits.iterator();
            while (thisIter.hasNext()){
                int thisNum = thisIter.next().toInt();
                Iterator<Bit> multIter = multiplyMe.bits.iterator();
                while (multIter.hasNext()){
                    int multNum = multIter.next().toInt();
                    if (multNum * thisNum == 1){ add.bits.addLast(Bit.ONE);}
                    else {add.bits.addLast(Bit.ZERO);}
                }
                sum = sum.add(add);
                add.bits.clear();// reset the add num
                addSize++;
                add.bits.padding(addSize);
            }
            return sum;
        }

        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.9 ================================================
        public BinaryNumber divide (BinaryNumber divisor){
            throw new UnsupportedOperationException("Delete this line and implement the method.");
        }


        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.10 ================================================
        public BinaryNumber mod (BinaryNumber modulus){
            throw new UnsupportedOperationException("Delete this line and implement the method.");
        }

        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.11 ================================================
    public BinaryNumber(String s) {
            throw new UnsupportedOperationException("Delete this line and implement the method.");
        }

        //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 3.12 ================================================
        public String toIntString () {
            // Do not remove or change the next two lines
            if (!isLegal()) // Do not change this line
                throw new RuntimeException("I am illegal.");// Do not change this line

            throw new UnsupportedOperationException("Delete this line and implement the method.");
        }

        //=========================== Private methods of your own ================================================
        private void paddingTheSmall (BinaryNumber a, BinaryNumber b){
            // this fuck padding the small number in zero to be in the same size
            if (a.bits.size() > b.bits.size()) {
                b.bits.padding(this.bits.size());
            } else {
                a.bits.padding(b.bits.size());
            }
        }
//--------------write your code ABOVE this line only!!!---------------------------------------------------------

        // Returns this * 2
        // Do not change this method
        public BinaryNumber multiplyBy2 () {
            BinaryNumber output = new BinaryNumber(this);
            output.bits.shiftLeft();
            output.bits.reduce();
            return output;
        }

        // Returns this / 2
        // Do not change this method
        public BinaryNumber divideBy2 () {
            BinaryNumber output = new BinaryNumber(this);
            if (!equals(Zero()))
                output.bits.shiftRight();
            return output;
        }

    }


