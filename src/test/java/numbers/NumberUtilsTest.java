package numbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void parity_and_sign() {
        assertTrue(NumberUtils.isEven(10));
        assertFalse(NumberUtils.isEven(7));
        assertTrue(NumberUtils.isOdd(7));
        assertTrue(NumberUtils.isPositive(5));
        assertTrue(NumberUtils.isNegative(-1));
        assertEquals(7, NumberUtils.abs(-7));
    }

    @Test
    void prime_factorial_fibonacci() {
        assertTrue(NumberUtils.isPrime(13));
        assertFalse(NumberUtils.isPrime(1));
        assertEquals(120, NumberUtils.factorial(5));
        assertEquals(21, NumberUtils.fibonacci(8));
    }

    @Test
    void gcd_lcm_power_divisible() {
        assertEquals(6, NumberUtils.gcd(12, 18));
        assertEquals(12, NumberUtils.lcm(4, 6));
        assertEquals(32, NumberUtils.power(2, 5));
        assertTrue(NumberUtils.isDivisible(15, 5));
        assertFalse(NumberUtils.isDivisible(14, 5));
    }

    @Test
    void bases_and_random() {
        assertEquals("1010", NumberUtils.toBinary(10));
        assertEquals("ff", NumberUtils.toHex(255));
        int rnd = NumberUtils.generateRandom(1, 3);
        assertTrue(rnd >= 1 && rnd <= 3);
    }
}
