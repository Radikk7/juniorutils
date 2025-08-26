package stringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtils {

    /**
     * Reverses the given string.
     * @param input The input string.
     * @return The reversed string.
     */
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
    /**
     * Checks if the given string is a palindrome (case-insensitive).
     * @param input The input string.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindromeIgnoreCase(String input) {
        if (input == null) {
            return false;
        }
        String reversed = reverse(input);
        return input.equalsIgnoreCase(reversed);
    }

    /**
     * Checks if the given string is a palindrome (case-sensitive).
     * @param input The input string.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String reversed = reverse(input);
        return input.equals(reversed); // Case-sensitive comparison
    }

    /**
     * Counts the number of vowels (a, e, i, o, u) in the given string.
     * @param input The input string.
     * @return The number of vowels in the string.
     */
    public static int countVowels(String input) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    /**
     * Counts the number of consonants in the given string.
     * @param input The input string.
     * @return The number of consonants in the string.
     */
    public static int countConsonants(String input) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }
    /**
     * Removes all vowels (a, e, i, o, u) from the given string.
     * @param input The input string.
     * @return A string without vowels.
     */
    public static String removeVowels(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[aeiouAEIOU]", "");
    }
    /**
     * Removes all consonants from the given string.
     * @param input The input string.
     * @return A string without consonants.
     */
    public static String removeConsonants(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[^aeiouAEIOU]", "");
    }

    /**
     * Capitalizes the first letter of the given string.
     * @param input The input string.
     * @return The string with the first letter capitalized.
     */
    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }
    /**
     * Counts how many times a given character appears in a string.
     * @param input The input string.
     * @param ch The character to count.
     * @return The number of occurrences of the character.
     */
    public static int countOccurrences(String input, char ch) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    /**
     * Reverses the order of words in a given sentence.
     * @param sentence The input sentence.
     * @return The sentence with reversed word order.
     */
    public static String reverseWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return sentence;
        }
        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    /**
     * Checks if the given string contains only digits.
     * @param input The input string.
     * @return True if the string consists only of digits, false otherwise.
     */
    public static boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return input.matches("\\d+");
    }
    /**
     * Finds the most frequent character in a string.
     * @param input The input string.
     * @return The most frequent character.
     */
    public static char mostFrequentCharacter(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        char mostFrequent = input.charAt(0);
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostFrequent;
    }
    /**
     * Removes duplicate characters from a string while preserving order.
     * @param input The input string.
     * @return A string without duplicate characters.
     */
    public static String removeDuplicates(String input) {
        if (input == null) {
            return null;
        }
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
    /**
     * Checks if two strings are anagrams of each other.
     * @param a First string.
     * @param b Second string.
     * @return True if both strings are anagrams, false otherwise.
     */
    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }
        char[] charsA = a.toLowerCase().toCharArray();
        char[] charsB = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(charsA);
        java.util.Arrays.sort(charsB);
        return java.util.Arrays.equals(charsA, charsB);
    }
    /**
     * Returns a string containing only characters that appear once.
     * @param input Input string.
     * @return String of unique characters.
     */
    public static String getUniqueCharacters(String input) {
        if (input == null) {
            return null;
        }
        Map<Character, Integer> countMap = new HashMap<>();
        for (char ch : input.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (countMap.get(ch) == 1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    /**
     * Removes all white spaces from the input string.
     * @param input The input string.
     * @return String without white spaces.
     */
    public static String removeWhiteSpaces(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("\\s+", "");
    }
    /**
     * Repeats the input string a given number of times.
     * @param input The input string.
     * @param times Number of repetitions.
     * @return The repeated string.
     */
    public static String repeat(String input, int times) {
        if (input == null || times <= 0) {
            return "";
        }
        return input.repeat(times);
    }
    /**
     * Counts how many times a character appears in a string.
     * @param input Input string.
     * @param target Character to count.
     * @return Number of occurrences.
     */
    public static int countCharacterOccurrences(String input, char target) {
        if (input == null) {
            return 0;
        }
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }

    /**
     * Capitalizes the first letter of each word in a string.
     * @param input Input string.
     * @return Capitalized string.
     */
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return result.toString().trim();
    }
    /**
     * Checks if the string contains only letters.
     * @param input Input string.
     * @return True if only letters, false otherwise.
     */
    public static boolean isOnlyLetters(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return input.matches("[a-zA-Z]+");
    }

    /**
     * Counts the number of words in a string.
     * @param input Input string.
     * @return Number of words.
     */
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    /**
     * Removes all punctuation marks from the input string.
     * @param input Input string.
     * @return String without punctuation.
     */
    public static String removePunctuation(String input) {
        if (input == null) {
            return null;
        }
        return input.replaceAll("[\\p{Punct}]", "");
    }

    /**
     * Checks if one string is a substring of another.
     * @param text The main string.
     * @param pattern The string to check as a substring.
     * @return True if pattern is a substring of text, false otherwise.
     */
    public static boolean isSubstring(String text, String pattern) {
        if (text == null || pattern == null) {
            return false;
        }
        return text.contains(pattern);
    }








}
