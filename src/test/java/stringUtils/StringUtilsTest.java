package stringUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse_basic() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void palindrome_caseSensitive() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertFalse(StringUtils.isPalindrome("Madam")); // регистр важен
    }

    @Test
    void palindrome_ignoreCase() {
        assertTrue(StringUtils.isPalindromeIgnoreCase("Madam"));
        assertFalse(StringUtils.isPalindromeIgnoreCase("Java"));
    }

    @Test
    void capitalizeWords_basic() {
        assertEquals("Java Is Fun", StringUtils.capitalizeWords("java is FUN"));
        assertEquals("", StringUtils.capitalizeWords(""));
        assertNull(StringUtils.capitalizeWords(null));
    }
}
