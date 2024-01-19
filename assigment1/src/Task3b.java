
import java.util.Scanner;


public class Task3b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        //---------------write your code BELOW this line only!--------------
        int n = scanner.nextInt(); // the number of the exponent
        int k = scanner.nextInt(); // the number of the division
        int moduloSum = 1; // the sum of the modulo
        int sum = 1; // the sum of the 2**n
        while (n>30){
            n = n-30;
            // calculate 2**30
            for(int p = 1;p <= 30;p = p+1){
                sum = sum * 2;
            }
            moduloSum = moduloSum * (sum%k);
            sum = 1;
        }
        if (n > 0){
            // calculate 2**n
            for(int p = 1;n >= p;p = p+1){
                sum = sum * 2;
            }
            moduloSum = moduloSum * (sum%k);
        }
        ans = moduloSum%k;
        //---------------write your code ABOVE this line only!--------------

        System.out.println(ans);
		scanner.close();
    }
}