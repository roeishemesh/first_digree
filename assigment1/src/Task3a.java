
import java.util.Scanner;

public class Task3a {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        //---------------write your code BELOW this line only!--------------
        int n = scanner.nextInt();
        int sum = 1;
        for(int p = 1;n >= p;p = p+1){
            sum = sum * 2;
        }
        ans = sum;
        //---------------write your code ABOVE this line only!--------------
        System.out.println(ans);
		scanner.close();
	}
}