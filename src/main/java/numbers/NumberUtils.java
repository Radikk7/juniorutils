package numbers;
import java.util.concurrent.ThreadLocalRandom;

public class NumberUtils {
    /**
     * Checks if the number is even.
     * @param number The number to check.
     * @return True if even, false if odd.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Checks if the number is odd.
     * @param number The number to check.
     * @return True if odd, false if even.
     */
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    /**
     * Checks if the number is a prime number.
     * @param number The number to check.
     * @return True if prime, false otherwise.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    /**
     * Calculates the factorial of a number.
     * @param number The number.
     * @return Factorial value.
     */
    public static long factorial(int number) {
        if (number < 0)
            throw new IllegalArgumentException("Negative numbers not allowed");
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Returns the nth Fibonacci number.
     * @param n Index (starting from 0).
     * @return nth Fibonacci number.
     */
    public static long fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Index must be non-negative");
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Calculates the greatest common divisor (GCD) of two numbers.
     * @param a First number.
     * @param b Second number.
     * @return GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    /**
     * Calculates the least common multiple (LCM) of two numbers.
     * @param a First number.
     * @param b Second number.
     * @return LCM of a and b.
     */
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        return Math.abs(a * b) / gcd(a, b);
    }
    /**
     * Converts an integer to a binary string.
     * @param number The number to convert.
     * @return Binary string.
     */
    public static String toBinary(int number) {
        return Integer.toBinaryString(number);
    }

    /**
     * Converts an integer to a hexadecimal string.
     * @param number The number to convert.
     * @return Hex string.
     */
    public static String toHex(int number) {
        return Integer.toHexString(number);
    }

    /**
     * Returns the absolute value of the given number.
     * @param number Input number.
     * @return Absolute value.
     */
    public static int abs(int number) {
        return number < 0 ? -number : number;
    }

    /**
     * Checks if one number is divisible by another.
     * @param a Dividend.
     * @param b Divisor.
     * @return True if a is divisible by b.
     */
    public static boolean isDivisible(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a % b == 0;
    }

    /**
     * Raises a number to a power.
     * @param base Base number.
     * @param exponent Exponent.
     * @return base^exponent
     */
    public static long power(int base, int exponent) {
        if (exponent < 0)
            throw new IllegalArgumentException("Exponent must be non-negative");
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }


    /**
     * Generates a random integer between min and max (inclusive).
     * @param min Minimum value.
     * @param max Maximum value.
     * @return Random number.
     */
    public static int generateRandom(int min, int max) {
        if (min > max) throw new IllegalArgumentException("min cannot be greater than max");
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    /**
     * Returns the greater of two numbers.
     * @param a First number.
     * @param b Second number.
     * @return Maximum of a and b.
     */
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    /**
     * Returns the smaller of two numbers.
     * @param a First number.
     * @param b Second number.
     * @return Minimum of a and b.
     */
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    /**
     * Checks if the number is positive.
     * @param number Input number.
     * @return True if positive.
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }
    /**
     * Checks if the number is negative.
     * @param number Input number.
     * @return True if negative.
     */
    public static boolean isNegative(int number) {
        return number < 0;
    }



}
