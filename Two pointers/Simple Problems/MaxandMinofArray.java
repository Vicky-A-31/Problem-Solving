public class MaxandMinofArray {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 7, 45, 23, 98, 3 };

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum : " + min + " Maximum : " + max);
    }
}
