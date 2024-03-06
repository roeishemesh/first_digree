import java.util.LinkedList;
import java.util.Iterator;

public class BitList extends LinkedList<Bit> {
    private int numberOfOnes;

    // Do not change the constructor
    public BitList() {
        numberOfOnes = 0;
    }

    // Do not change the method
    public int getNumberOfOnes() {
        return numberOfOnes;
    }

//----------write your code BELOW this line only!!!---------------------------------------------------------

//=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.1 ================================================

    public void addLast(Bit element) {
        if (element == null) {
            throw new IllegalArgumentException("you can't add null element");
        }
        super.addLast(element);
        if (element.equals(Bit.ONE)) {
            numberOfOnes++;
        }
    }

    public void addFirst(Bit element) {
        if (element == null) {
            throw new IllegalArgumentException("you can't add null element");
        }
        super.addFirst(element);
        if (element.equals(Bit.ONE)) {
            numberOfOnes++;
        }
    }

    public Bit removeLast() {
        Bit lastBit = super.removeLast();
        if (lastBit.equals(Bit.ONE)) {
            numberOfOnes--;
        }
        return lastBit;
    }

    public Bit removeFirst() {
        Bit firstBit = super.removeFirst();
        if (firstBit.equals(Bit.ONE)) {
            numberOfOnes--;
        }
        return firstBit;
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.2 ================================================
    public String toString() {// is it good to use iterator
        String s = "";
        Iterator<Bit> iter = iterator();
        while (iter.hasNext()) {
            s = iter.next() + s;
        }
        return "<" + s + ">";
    }


    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.3 ================================================
    public BitList(BitList other) {
        if (other != null) {
            Iterator<Bit> iter = other.iterator();
            while (iter.hasNext()) {
                this.addLast(iter.next());
            }
        }
        else {
            throw new IllegalArgumentException("the input should be BitList");
        }
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.4 ================================================
    public boolean isNumber() {
        if (this.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.5 ================================================
    public boolean isReduced() {
        if (this.size() == 1 || (this.size() > 0 && this.peekLast().equals(Bit.ONE))) {
            return true;
        } else {
            return false;
        }
    }

    public void reduce() {
        while (!this.isReduced() & this.peekLast().equals(Bit.ZERO)) {
            this.removeLast();
        }
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.6 ================================================
    public Bit shiftRight() {
        if (this.size() == 1 && this.peek().equals(Bit.ONE)) {
            this.removeLast();
            this.addFirst(Bit.ZERO);
            return Bit.ONE;
        }
        if (this.size() > 1) {
            Bit temp = this.removeFirst();
            return temp;
        } else {
            return null;
        }
    }

    public void shiftLeft() {
        this.addFirst(Bit.ZERO);
    }

    //=========================== Intro2CS 2024/1, ASSIGNMENT 4, TASK 2.7 ================================================
    public void padding(int newLength) {
        while (this.size() < newLength) {
            this.addLast(Bit.ZERO);
        }
    }


//=========================== Private methods of your own ================================================  


//--------------write your code ABOVE this line only!!!---------------------------------------------------------

    //----------------------------------------------------------------------------------------------------------
    // The following overriding methods must not be changed.
    //----------------------------------------------------------------------------------------------------------
    public boolean add(Bit e) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public void add(int index, Bit element) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public Bit remove(int index) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public boolean offer(Bit e) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public boolean offerFirst(Bit e) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public boolean offerLast(Bit e) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public Bit set(int index, Bit element) {
        throw new UnsupportedOperationException("Do not use this method!");
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Do not use this method!");
    }
}
