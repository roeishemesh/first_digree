import java.util.Random;
public class ModularHash implements HashFactory<Integer> {
    private Random rand;
    private HashingUtils utils;

    public ModularHash() {
        this.rand = new Random();
    }

    @Override
    public HashFunctor<Integer> pickHash(int k) {
        throw new UnsupportedOperationException("Delete this line and replace it with your implementation");
    }

    public class Functor implements HashFunctor<Integer> {
        final private int a;
        final private int b;
        final private long p;
        final private int m;

        public Functor(int k){
            this.a = 1 + (int) (Math.random() * (Integer.MAX_VALUE - 1));
            this.b = 1 + (int) (Math.random() * (Integer.MAX_VALUE - 1));
            long suspect = Integer.MAX_VALUE + (long) ((Math.random() * (Long.MAX_VALUE - (long) Integer.MAX_VALUE)));
            while (!utils.runMillerRabinTest(suspect,50)){
                suspect = Integer.MAX_VALUE + (long) ((Math.random() * (Long.MAX_VALUE - (long) Integer.MAX_VALUE)));
            }
            this.p = suspect;
            this.m = 1;
        }

        @Override
        public int hash(Integer key) {
            throw new UnsupportedOperationException("Delete this line and replace it with your implementation");
        }

        public int a() {
            return a;
        }

        public int b() {
            return b;
        }

        public long p() {
            return p;
        }

        public int m() {
            return m;
        }
    }
}
