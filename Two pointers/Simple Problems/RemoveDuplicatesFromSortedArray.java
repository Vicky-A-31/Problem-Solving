// Remove duplicates from an array

// we can't delete array element
// so we update the array in place of duplicates

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int index = 1;
        for(int i=1; i<array.length; i++) {
            if(array[i] != array[i-1]) {
                array[index] = array[i];
                index++;
            }
        }

        System.out.println("Array without duplicates:");
        System.out.print("[");
        for(int i=0; i<index; i++) {
            System.out.print(array[i]);
            if(i != index-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
