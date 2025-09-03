// sort 0s, 1s and 2s an array
// We can solve this problem using move zeroes at end or move non-zeroes to front
// example : [0, 1, 2, 0, 1, 2, 0, 2, 1, 0]
// output : [0, 0, 0, 0, 1, 1, 1, 2, 2, 2]

/* 1. three pointers we are using this approach 
 * low : keeps track of 0s
 * mid : keeps track of 1s
 * high : keeps track of 2s
 * 
 * 2. Initially, low and mid points at start of an array,
 * high points at end of an array
 * 
 * 3. arr[mid] == 0, swap it with arr[low] then increment both low and mid by 1
 * 
 * 4. arr[mid] == 2, swap it with arr[high] then decrement high by 1
 * 
 * 5. arr[mid] == 1, just increment mid by 1
 * 
 * 6. mid > high , then stop the loop because 0s, 1s and 2s are sorted.
 */


import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        // using move non-zeroes to front approach
        int[] array = {0, 1, 2, 0, 1, 2, 0, 2, 1, 0};
        System.out.println("Original Array : " + Arrays.toString(array));
        
        /* 
        int index = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] == 0) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }

        for(int i=index; i<array.length; i++) {
            if(array[i] == 1) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }

        for(int i=index; i<array.length; i++) {
            if(array[i] == 2) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
        */

        int low = 0, mid = 0, high = array.length - 1;

        while(mid <= high) { // mid > high then loop stopped
            if(array[mid] == 0) {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++; // increment both low and mid by 1
                mid++;
            } else if(array[mid] == 2) {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--; // decrement only high by 1
            } else if(array[mid] == 1) {
                mid++; // increment mid by 1 
            }
        }

        System.out.println("Sorted Array : " + Arrays.toString(array));
    }
}
