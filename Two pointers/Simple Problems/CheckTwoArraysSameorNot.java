/*
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.toString(arr1).equals(Arrays.toString(arr2))) {
            System.out.println("Both Array contains Same values");
        } else {
            System.out.println("Both array does not contain same values.");
        }

        for(int i=0; i<arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                System.out.println("Both array does not contain same values.");
                return;
            }
        }
*/

import java.util.Arrays;
import java.util.HashMap;

public class CheckTwoArraysSameorNot {
    public static void main(String[] args) {
        int[] arr1 = {3,2,5,7,4,5,9};
        int[] arr2 = {5,2,7,9,5,3};

        // to check element contains another array
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr1.length; i++) {
            if(!map.containsKey(arr1[i])) {
                map.put(arr1[i], 1);
            } else {
                map.put(arr1[i], map.get(arr1[i])+1);
            }
        }

        System.out.println("Array 1 Elements : " + map.toString());

        // iterate arr2 elements and check which is present in map
        for(int i=0; i<arr2.length; i++) {
            if(!map.containsKey(arr2[i])) {
                System.out.println("Both arrays does not contains same elements.");
                return;
            }
            // map contains arr2 elements then reduce the frequency of same value
            else {
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }

        System.out.println("Both Arrays contains the same elements.");
    }
}
