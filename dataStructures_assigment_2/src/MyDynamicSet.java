/**
 * @param <T> The type of the satellite data of the elements in the dynamic-set.
 */
public class MyDynamicSet<T> {
    /*
     * You may add any fields that you wish to add.
     * Remember that the use of built-in Java classes is not allowed,
     * the only variables types you can use are:
     * 	-	the given classes in the assignment
     * 	-	basic arrays
     * 	-	primitive variables
     */
    private MySortedArray<T> arr;

    /***
     * The constructor should initiate an empty dynamic-set.
     */
    public MyDynamicSet() {
        this.arr = new MySortedArray<T>();
    }

    public Element<T> search(int k) {
        return arr.search(k);

    }

    public void insert(Element<T> x) {
        ArrayElement<T> toInsert = new ArrayElement<T>(x);
        arr.insert(toInsert);
    }


    public void delete(Element<T> x) {
        ArrayElement<T> toDelete = (ArrayElement<T>) x;
        arr.delete(toDelete);
    }

    public Element<T> minimum() {
        if (arr.size() == 0) {
            return null;
        }
        return arr.get(0);
    }

    public Element<T> maximum() {
        if (arr.size() == 0) {
            return null;
        }
        return arr.get(arr.size() - 1);
    }

    public Element<T> successor(Element<T> x) {
        ArrayElement<T> succes = (ArrayElement<T>) x;
        if (succes.index() == arr.size() - 1) {
            return null;
        }
        return arr.get(succes.index() + 1);
    }

    public Element<T> predecessor(Element<T> x) {
        ArrayElement<T> pre = (ArrayElement<T>) x;
        if (pre.index() == 0) {
            return null;
        }
        return arr.get(pre.index() - 1);
    }

    public String toString() {
        return arr.toString();
    }
}