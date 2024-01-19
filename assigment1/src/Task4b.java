
import java.util.Scanner;

public class Task4b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        //---------------write your code BELOW this line only!--------------
        int n = scanner.nextInt();
        int numOfPrimes = 0; //The number of numbers less than or equal to n
        int smallNum = 2;
        while (smallNum <= n) {
            boolean isPrime = true;
            for (int p = 2; p * p <= smallNum & isPrime; p = p + 1) {
                if (smallNum % p == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                numOfPrimes = numOfPrimes + 1;
            }
            smallNum = smallNum + 1;
        }
        ans =numOfPrimes;


        //---------------write your code ABOVE this line only!--------------

        System.out.println(ans);
        scanner.close();
    }
}