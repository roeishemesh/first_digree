public class main {
    public static void main(String[] args) {
        BitList bl = new BitList();
        bl.addFirst(Bit.ZERO);


        BinaryNumber bn5 = new BinaryNumber('5');
        BinaryNumber bn0 = new BinaryNumber('0');
        BinaryNumber bn1 = new BinaryNumber('1');
        BinaryNumber bn3 = new BinaryNumber('3');
        BinaryNumber bn100 = bn5.multiplyBy2().multiplyBy2().multiply(bn5);
        BinaryNumber bn300 = bn100.multiply(bn3);
//        System.out.println(bn100.toInt());
//        System.out.println(bn300.toInt());

        System.out.println(bn5.multiply(bn1).toInt());


//        System.out.println(bn1a.compareTo(bn5));
//        System.out.println(bn4.compareTo(bn4a));
//        System.out.println(bn4.compareTo(bn5));

    }
}
