public class SkipListUtils {

    public static double calculateExpectedHeight(double p) {
        return 1/(1-p);
    }

    public static boolean[] changedMethodsArray() {
        throw new UnsupportedOperationException("Delete this line and replace it with your implementation");
    }

    public static void main(String[] args) {
        System.out.println(calculateExpectedHeight(0.6));
    }
}
