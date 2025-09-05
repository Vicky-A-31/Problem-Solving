// two sum problem
// input : [0, -1, 2, -3, 1], target = -2
// output : Pair found: (-3, 1) 

// suppose we have an array which is sorted in ascending order
// we can use the two pointer technique to find the pair
// 1. initialize two pointers, one at the beginning and one at the end of the array
// 2. iterate while the two pointers do not cross
// 3. if the sum of the elements at the two pointers is equal to the target, we have found a pair
// 4. if the sum is greater than the target, we need to move the right pointer to the left
// 5. if the sum is less than the target, we need to move the left pointer to the right

/* int i=0, j=array.length-1;
    while(i < j) {
        int sum = array[i] + array[j];
        if(sum > target) {
            j--;
        } else if(sum < target) {
            i++;
        } else {
            System.out.println("Pair found: (" + array[i] + ", " + array[j] + ")");
            return;
        }
    }
    System.out.println("No Pair found.");
 */

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {0, -1, 2, -3, 1};
        int target = -2;

        System.out.println("Input Array : " + Arrays.toString(array) + "Target: " + target);

        HashSet<Integer> set = new HashSet<>();

        for (int i : array) {
            int x = target - i;
            // to avoid the case of (1, 1) when target is 2 and array contains only one 1
            if (set.contains(x)) {
                System.out.println("Pair found: (" + i + ", " + x + ")");
                break;
            }
            set.add(i);
        }
    }
}
