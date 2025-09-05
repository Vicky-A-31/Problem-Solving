public class SentencePalindrome {
    public static void main(String[] args) {
        String input = "A1 man4 a% plan a canal $Panama09";
        // ignore spaces, special characters and numbers
        int i = 0, j = input.length() - 1;

        while (i < j) {
            if (!Character.isLetter(input.charAt(i))) {
                i++;
            }

            else if (!Character.isLetter(input.charAt(j))) {
                j--;
            }

            else if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))) {
                System.out.println("Not a palindrome");
                return;
            } else {
                // characters are same
                i++;
                j--;
            }
        }
        System.out.println(input + " is a palindrome");

    }
}
