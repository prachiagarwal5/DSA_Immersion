package contest_1;
import java.util.*;
public class min_lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Input integer n
            int x=0;
            int y=0;

            // Choose x and y such that x + y = n
            // We can choose x = n/2 and y = n/2 if n is even
            // Otherwise, we can choose x = (n-1)/2 and y = (n+1)/2
            if (n % 2 == 0) {
                x = y = n / 2;
            } else {
                x = (n - 1) / 2;
                y = (n + 1) / 2;
            }

            System.out.println(x + " " + y);
        }
    }
}

	
