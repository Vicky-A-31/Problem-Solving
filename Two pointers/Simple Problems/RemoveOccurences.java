// Remove All Occurrences of an Element in an Array

/* Given an integer array arr[] and an integer ele 
the task is to the remove all occurrences of ele from arr[] in-place and 
return the number of elements which are not equal to ele. 
If there are k number of elements which are not equal to ele then the input array arr[] should be modified such that 
the first k elements should contain the elements which are not equal to ele and then the remaining elements. 
Note : Don't use any extra memory */

// Example : arr = [0, 1, 2, 3, 2, 1, 5] element = 2
// Output : arr = [0, 1, 3, 1, 5]  k = 5, don't return array

// naive approach :
/* find the number of not equal to elements as count and create a array using that count.
 then iterate over the original array and check if the element is not equal to the given element
 if not equal then add it to the new array.

This approach take another array But in this question don't use extra memory,
 time complexity : O(n) space complexity: O(n)
*/


// this approach uses two pointers, time complexity: O(n) space complexity: O(1)

import java.util.Arrays;

class RemoveOccurences { 
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 2, 1, 5};
        int element = 2;

        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] != element) {
                array[count] = array[i];
                count++;
            }
        }

        for(int i=count; i<array.length; i++) {
            array[i] = -1;
        }

        System.out.println("Count : " + count);
        System.out.println("Modified Array : " + Arrays.toString(array));
    }
}    