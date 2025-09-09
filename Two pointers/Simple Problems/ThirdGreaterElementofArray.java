public class ThirdGreaterElementofArray {
    public static void main(String[] args) {
        int[] arr = { 23, 12, 7, 45, 23, 98, 3 };

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(first < arr[i]) {
                third = second;
                second = first;
                first = arr[i];
            } else if(second < arr[i]) {
                third = second;
                second = arr[i];
            } else if(third < arr[i]) {
                third = arr[i];
            }
        }

        System.out.println("First: " + first + " Second: " + second + " Third: " + third);
    }
}
