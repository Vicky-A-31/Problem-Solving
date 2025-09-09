// Finding Repeating number
/*
 * arr = [1, 3, 2, 7, 5, 6, 4, 3];
 * answer is 3
 * 
 * we can achieve this using XOR operation 
 * this is similar for Finding missing number
 */

public class FindRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 7, 3, 6, 1};
        int n = arr.length - 1;

        int xor = 0;
        for(int i=0; i<arr.length; i++) {
            xor = xor ^ arr[i];
        }

        for(int i=1; i<=n; i++) {
            xor = xor ^ i;
        }

        System.out.println("Repeating Number is " + xor);
    }
}
