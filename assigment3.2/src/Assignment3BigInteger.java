import java.math.BigInteger;
import java.util.Random;
public class Assignment3BigInteger {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("1");
        int d = 5;
        System.out.println(isPrime(n));
    }

    public static BigInteger sumSmaller(BigInteger n){
        BigInteger sum =  new BigInteger("0");
        //Task 1.1
        if (n.equals(n.abs())){
            while (!n.equals(BigInteger.ZERO)){
                n = n.subtract(BigInteger.ONE);
                sum = sum.add(n);
            }
        }
        return sum;
    }

    public static void printRandoms(int n){
        //Task 1.2
        Random random = new Random();
        for (int i = 0; i < n; i++){
            System.out.println(random.nextInt());
        }
    }

    public static boolean isPrime(BigInteger n){
        boolean ans= true;
        //Task 1.3
        if (n.compareTo(BigInteger.ZERO) == 0 | n.compareTo(BigInteger.ONE) == 0){
            ans = false;
        }
        BigInteger p = new BigInteger("2");
        while (ans & (p.multiply(p).compareTo(n) == -1 | p.multiply(p).compareTo(n) == 0)){
            if(n.remainder(p).equals(BigInteger.ZERO)){
                ans = false;
            }
            else {p = p.add(BigInteger.ONE);
            }
        }
        return ans;
    }

    public static BigInteger randomPrime(int n){
        BigInteger randBig = new BigInteger("0");
        //Task 1.4
        boolean isPrime = false;
        Random rand = new Random();
        while (!isPrime){
            randBig = new BigInteger(n,rand);
            if(randBig.compareTo(BigInteger.ONE) == 1 && isPrime(randBig)){
                isPrime = true;
            }
        }
        return randBig;
    }
}
