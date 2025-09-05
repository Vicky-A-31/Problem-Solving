/*
 * Find a pair with a given sum in a sorted and rotated array
 * Input: arr[] = {11, 15, 6, 8, 9, 10}, sum = 16
 * Output: Pair found (6, 10)   
 * Explanation: 6 + 10 = 16
 * 
 * 1. Find the pivot element, the largest element in the array
 * 2. Initialize two pointers, one at the smallest element (pivot + 1) and one at the largest element (pivot)
 * 3. Iterate while the two pointers do not cross (l < r)
 * 4. If the sum of the elements at the two pointers is equal to the target, we have found a pair
 * 5. If the sum is greater than the target, we need to move the right pointer to the left
 * 6. If the sum is less than the target, we need to move the left pointer to the right
 * 7. If the two pointers cross, then we have not found a pair
 * 8. Time complexity: O(n) Space complexity: O(1)
 */

import java.util.Arrays;

public class PairSuminSortedandRotated {
    public static void main(String[] args) {
        int[] array = {11, 15, 6, 8, 9, 10}; // greatest is 15 and smallest is 6
        int target = 16;

        System.out.println("Input Array : " + Arrays.toString(array) + "Target: " + target);

        int n = array.length;
        int pivot = -1;

        // find the pivot element
        for(int i=0; i<n-1; i++) {
            if(array[i] > array[i+1]) {
                pivot = i;
                break;
            }
        }

        int l = (pivot + 1) % n; // index of smallest element
        int r = pivot; // index of largest element

        while(l != r) {
            int sum = array[l] + array[r];
            if(sum == target) {
                System.out.println("Pair found: (" + array[l] + ", " + array[r] + ")");
                return;
            } else if(sum < target) {
                l = (l < n) ? l+1 : 0 ; // move to next element
            } else {
                r = (r > 0) ? r-1 : n-1; // move to previous element
            }
        }

        System.out.println("No Pair found.");
    }
}
