// Move all zeroes to the end of the array
// Alternative approach is Move non-zero numbers to the front
// Note : don't use any extra memory

/*
 example : [0, 1, 0, 3, 12]
 output : [1, 3, 12, 0, 0]
 */

// naive approach
/* create a duplicate array with size of original array
 * then iterate over the original array and check if the element is not equal to 0
 * if not equal then add it to the new array.
 * remaining elements by default filled in 0.

 This approach take another array But in this question don't use extra memory,
 time complexity : O(n) space complexity: O(n)
 */


/* This approach using Two pointers
1. initialize two pointers one for keeps track index of non-zero elements
 another for iterating over the array.
2. if the element is not equal to 0 then swap it with the element at the index of non-zero elements
 */

import java.util.Arrays;

public class MoveZerostoEnd {
    public static void main(String[] args) {
      int[] array = {5, 0, 1, 0, 3, 12};
      System.out.println("Original Array : " + Arrays.toString(array));

      int index = 0; 
      for(int j=0; j<array.length; j++) {
        if(array[j] != 0) {
            array[index] = array[index] ^ array[j];
            array[j] = array[index] ^ array[j];
            array[index] = array[index] ^ array[j];
            index++;
        }
      }

      System.out.println("Modified Array : " + Arrays.toString(array));
    }
}