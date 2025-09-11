// Rotate array kth time to right side

/* This approach take O(n^2) time complexity

    for(int i=1; i<=k; i++) {
    int last = arr[arr.length-1];
    for(int j=arr.length-1; j>0; j--) {
        arr[j] = arr[j-1];
    }
    arr[0] = last;
    }
 */

/* Recursion Approach

    if(k == 0) {
        return;
    }

    int last = arr[arr.length-1];
    for(int j=arr.length-1; j>0; j--) {
        arr[j] = arr[j-1];
    }
    arr[0] = last;

    return rotateArray(arr, k-1);
*/


import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayKtimes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;

        int n = arr.length;
        // first reverse n-k to n-1 elements in an array
        for(int i=n-k, j=n-1; i<j; i++, j--) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
        }
        System.out.println(Arrays.toString(arr));


        // then reverse 0 to n-k elements
        for(int i=0, j=n-k-1; i<j; i++, j--) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
        System.out.println(Arrays.toString(arr));

        // reverse all elements
        for(int i=0, j=n-1; i<j; i++, j--) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
        }
        System.out.println("Final Array : " + Arrays.toString(arr));
    }
}
