
import java.util.Scanner;

public class Task4d {

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	int ans = 0;

        //---------------write your code BELOW this line only!--------------
        int n = scanner.nextInt();
        boolean isAd = true;
        while (isAd) {
            int a = (int) (Math.random() * (n - 1)) + 1;
            ans = ans +1;
            int divideIn2 = ((n-1)/2); // check how many times 2 insert into n
            int moduloOf2 = ((n-1)%2);// check in n is even
            int moduloSum = 1; // the sum of the modulo
            // calculate the module of (a*a) as the number of times that 2 enters n-1
            for(int p = 1;p <= divideIn2; p = p + 1){
                moduloSum = (moduloSum * ((a*a)%n))%n;
            }
            // if the n-1 is odd, add the modulo of a%n (always a because n>a
            if (moduloOf2 == 1){
                moduloSum = moduloSum * a;
            }
            if(moduloSum != 1){
               isAd = false;
            }

        }

        //---------------write your code ABOVE this line only!--------------

        System.out.println(ans);
		scanner.close();
    }
}