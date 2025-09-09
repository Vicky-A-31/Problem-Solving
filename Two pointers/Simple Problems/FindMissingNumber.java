// Find the missing number in an array
// ex: arr = [1, 4, 2, 6, 5]; anser is 3

/*
 * using n(n+1)/2 formula - time complexity O(n)
 * 1. find sum of all numbers in an array
 * 2. find sum using formula n = arr.length + 1
 * 3. subtract formulaSum - sum
 * 4. get the missing number
 * 
 *      int[] arr = {1, 4, 2, 6, 5};

        int n = arr.length + 1;

        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        
        int formulaSum = (n * (n + 1)) / 2;

        int result = formulaSum - sum;
        System.out.println("Missing number is " + result);
 */


/*
 * using XOR to get the missing number
 * ex: n ^ n = 0
 * ex : arr = [1, 4, 2, 6, 5]; anser is 3
 * 
 * 1st perform XOR operation for all array elements
 * 2nd perform XOR operation from 1 to n = arr.length + 1;
 */

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 6, 5};

        int result = 0;

        for(int i=0; i<arr.length; i++)  {
            result = result ^ arr[i];
        }

        int n = arr.length + 1;
        for(int i=1; i<=n; i++) {
            result = result ^ i;
        }

        System.out.println("The Result is " + result);
    }
}
