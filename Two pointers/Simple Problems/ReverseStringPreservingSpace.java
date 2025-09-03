// Reverse a String while preserving spaces


public class ReverseStringPreservingSpace {
    public static void main(String[] args) {
        String input = "Hello this is vicky";
        char[] array = input.toCharArray();
        int i=0, j=array.length-1;
        while(i < j) {
            if(array[i] == ' ') {
                i++;
            } else if(array[j] == ' ') {
                j--;
            } else {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        System.out.println(new String(array));
    }
}
