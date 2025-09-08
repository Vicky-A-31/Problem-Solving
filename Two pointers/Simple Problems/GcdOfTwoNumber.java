// three ways we are finding gcd
// gcd - greatest common divisor
/*
    int a = 20, b = 28;
    int min = Math.min(a, b);
    for(int i=min; i>0; i++) {
        if(a % min == 0 && b % min == 0) {
                break;
            }
            min--;
        }
        System.out.println("Gcd is " + min);
 */

// Euclidean Algorithm
/* 
    public static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        } 
        if(b == 0) {
            return a;
        } 
        if(a == b) {
            return a;
        }

        // a is greater
        if(a > b) {
            a = a - b;
            return gcd(a, b);
        } 
        // b is greater
        else {
            b = b - a;
            return gcd(a, b);
        }
    }
*/

// Efficient Approach is Modified Euclidean Algorithm
/*
 * if(b == 0) return a;
 * else return gcd(b, a % b);
 */
public class GcdOfTwoNumber {
    public static void main(String[] args) {
        int a = 36, b = 108;
        int result = gcd(a, b);
        System.out.println("Gcd is " + result);
    }

    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
