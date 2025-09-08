// print all divisors from 1 to 100
/*  int n = 100;
    for(int i=1; i<=100; i++) {
        if(n % i == 0) {
            System.out.print(i + " ");
        }
    }

    This approach take O(n) time complexity
*/

import java.util.Set;
import java.util.TreeSet;

public class PrintAllDivisors {
    public static void main(String[] args) {
        int n = 100;
        Set<Integer> result = new TreeSet<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(i); // divisor
                result.add(n / i); // quotient 28/2 = 14, (2, 14) divisors of 28 
            }
        }

        System.out.println(result.toString());
    }
}
