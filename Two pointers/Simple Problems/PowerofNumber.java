// power of a number
// built in method in java Math.pow(b,e) b - base, e - exponent
// Second Approach 
/* int b = 2, e = 5;
   int result = 1;
   for (int i = 1; i <= e; i++) {
      result *= b;
   }
    System.out.println(result); 

    This approach take O(n) time complexity

    public int power(int b, int e) {
        if(e == 0) {
            return 1;
        }
        else return b * power(b, e-1);
    }
*/

// effective approach is Divide and conquer algorithm
// take example : 2^19 we can split 2^9 * 2^9 * 2
// again we can split 2^9 => 2^4 * 2^4 * 2
// again we can split 2^4 => 2^2 * 2^2
// again we can split 2^2 => 2^1
// stop e == 0

// this approach takes O(log n) time complexity

public class PowerofNumber {
    public static void main(String[] args) {
        int b = 2, e = 5;
        int result = power(b, e);
        System.out.println(result);
    }

    public static int power(int b, int e) {
        if (e == 0) {
            return 1;
        } else {
            // even
            if ((e & 1) == 0) {
                return power(b, e / 2) * power(b, e / 2);
            }
            // odd
            else {
                return b * power(b, e / 2) * power(b, e / 2);
            }
        }
    }
}