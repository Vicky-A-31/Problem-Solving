import java.util.HashSet;
import java.util.Arrays;

public class IntersectionofArraysWithDistinct {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 6, 8};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        HashSet<Integer> set = new HashSet<>();
        for(int i: array1) {
            set.add(i);
        }

        System.out.print("Intersection: ");
        
        for(int i: array2) {
            if(set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
