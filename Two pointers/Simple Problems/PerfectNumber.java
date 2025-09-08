// Perfect number is which is equal to sum of all it's divisors
// Eg: 1,2,3 are divisors of 6 => 6 = 1 + 2 + 3

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println((sum == n) ? "Perfect Number" : "Not Perfect Number");
    }
}
