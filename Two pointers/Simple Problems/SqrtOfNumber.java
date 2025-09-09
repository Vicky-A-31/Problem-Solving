// Square root of a number 
/*
 * 1st approach is built in method Math.sqrt()
 * 
 * 2nd approach is iterate loop - O(n)
 *  int n=27;
    int result = 1;
    while(result * result <= n) {
        result++;
    }

    result -= 1;
    System.out.println(result);

 * 3rd apprach is binary search - O(log n)
 */

public class SqrtOfNumber {
    public static void main(String[] args) {
        int n = 100;
        int low = 1, high = n;
        int result = 0;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(mid * mid <= n) {
                result = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println(result);
    }
}