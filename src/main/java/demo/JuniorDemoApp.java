package demo;

import stringUtils.StringUtils;
import java.util.Scanner;
import java.util.Arrays;
import numbers.NumberUtils;
import arrayUtils.ArrayUtils;
import encoding.EncodingUtils;




public class JuniorDemoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==== JuniorUtils Demo App ====");
            System.out.println("Choose category:");
            System.out.println("1. String Operations");
            System.out.println("2. Array Operations");
            System.out.println("3. Number Operations");
            System.out.println("4. Encoding");
            System.out.println("0. Exit");
            System.out.print("> ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    stringOperations(scanner);
                    break;
                case "2":
                    arrayOperations(scanner);
                    break;
                case "3":
                    numberOperations(scanner);
                    break;
                case "4":
                    encodingOperations(scanner);
                    break;
                case "0":
                    running = false;
                    System.out.println("Goodbye, tiger 🐯");
                    break;
                default:
                    System.out.println("Invalid input, try again.");
            }
        }

        scanner.close();
    }


    private static void stringOperations(Scanner scanner) {
        boolean back = false;

        while (!back) {
            System.out.println("\n-- String Operations --");
            System.out.println("1. Reverse String");
            System.out.println("2. Check Palindrome (case-sensitive)");
            System.out.println("3. Check Palindrome (ignore case)");
            System.out.println("4. Capitalize Words");
            System.out.println("0. Back");
            System.out.print("> ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter a string: ");
                    String input = scanner.nextLine();
                    System.out.println("Reversed: " + StringUtils.reverse(input));
                    break;
                case "2":
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Is Palindrome: " + StringUtils.isPalindrome(input));
                    break;
                case "3":
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Is Palindrome (ignore case): " + StringUtils.isPalindromeIgnoreCase(input));
                    break;
                case "4":
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Capitalized: " + StringUtils.capitalizeWords(input));
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    private static int[] readIntArray(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String line = scanner.nextLine().trim();
        if (line.isEmpty()) return new int[0];

        // поддерживаем форматы "1,2,3" и "1 2 3"
        String[] parts = line.replaceAll("\\s+", ",").split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        return arr;
    }

    private static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine().trim());
    }
    private static void arrayOperations(Scanner scanner) {
        boolean back = false;

        while (!back) {
            System.out.println("\n-- Array Operations --");
            System.out.println("1. Reverse");
            System.out.println("2. Sort");
            System.out.println("3. Contains duplicate");
            System.out.println("4. Sum");
            System.out.println("5. Average");
            System.out.println("6. Min");
            System.out.println("7. Max");
            System.out.println("8. Is sorted");
            System.out.println("9. Unique elements");
            System.out.println("10. Filter even");
            System.out.println("11. Filter odd");
            System.out.println("12. Rotate left");
            System.out.println("13. Rotate right");
            System.out.println("14. Index of value");
            System.out.println("15. Remove value");
            System.out.println("16. Merge two arrays");
            System.out.println("0. Back");
            System.out.print("> ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1": {
                        int[] arr = readIntArray(scanner, "Enter array (e.g. 1,2,3): ");
                        System.out.println("Reversed: " + Arrays.toString(ArrayUtils.reverse(arr)));
                        break;
                    }
                    case "2": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Sorted: " + Arrays.toString(ArrayUtils.sort(arr)));
                        break;
                    }
                    case "3": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Contains duplicate: " + ArrayUtils.containsDuplicate(arr));
                        break;
                    }
                    case "4": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Sum: " + ArrayUtils.sum(arr));
                        break;
                    }
                    case "5": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Average: " + ArrayUtils.average(arr));
                        break;
                    }
                    case "6": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Min: " + ArrayUtils.min(arr));
                        break;
                    }
                    case "7": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Max: " + ArrayUtils.max(arr));
                        break;
                    }
                    case "8": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Is sorted: " + ArrayUtils.isSorted(arr));
                        break;
                    }
                    case "9": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Unique: " + Arrays.toString(ArrayUtils.uniqueElements(arr)));
                        break;
                    }
                    case "10": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Even: " + Arrays.toString(ArrayUtils.filterEvenNumbers(arr)));
                        break;
                    }
                    case "11": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Odd: " + Arrays.toString(ArrayUtils.filterOddNumbers(arr)));
                        break;
                    }
                    case "12": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Rotate left: " + Arrays.toString(ArrayUtils.rotateLeft(arr)));
                        break;
                    }
                    case "13": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        System.out.println("Rotate right: " + Arrays.toString(ArrayUtils.rotateRight(arr)));
                        break;
                    }
                    case "14": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        int value = readInt(scanner, "Enter value to find: ");
                        System.out.println("Index: " + ArrayUtils.indexOf(arr, value));
                        break;
                    }
                    case "15": {
                        int[] arr = readIntArray(scanner, "Enter array: ");
                        int value = readInt(scanner, "Enter value to remove: ");
                        System.out.println("Result: " + Arrays.toString(ArrayUtils.removeElement(arr, value)));
                        break;
                    }
                    case "16": {
                        int[] a = readIntArray(scanner, "Enter first array: ");
                        int[] b = readIntArray(scanner, "Enter second array: ");
                        System.out.println("Merged: " + Arrays.toString(ArrayUtils.mergeArrays(a, b)));
                        break;
                    }
                    case "0":
                        back = true;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


    private static void numberOperations(Scanner scanner) {
        boolean back = false;

        while (!back) {
            System.out.println("\n-- Number Operations --");
            System.out.println("1. Is Even");
            System.out.println("2. Is Odd");
            System.out.println("3. Is Prime");
            System.out.println("4. Factorial");
            System.out.println("5. Fibonacci(n)");
            System.out.println("6. GCD (a, b)");
            System.out.println("7. LCM (a, b)");
            System.out.println("8. To Binary");
            System.out.println("9. To Hex");
            System.out.println("10. Abs");
            System.out.println("11. Is Divisible (a by b)");
            System.out.println("12. Power (base^exp)");
            System.out.println("13. Random in range [min,max]");
            System.out.println("14. Max(a,b)");
            System.out.println("15. Min(a,b)");
            System.out.println("16. Is Positive");
            System.out.println("17. Is Negative");
            System.out.println("0. Back");
            System.out.print("> ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1": {
                        int n = readInt(scanner, "Enter number: ");
                        System.out.println("Is even: " + NumberUtils.isEven(n));
                        break;
                    }
                    case "2": {
                        int n = readInt(scanner, "Enter number: ");
                        System.out.println("Is odd: " + NumberUtils.isOdd(n));
                        break;
                    }
                    case "3": {
                        int n = readInt(scanner, "Enter number: ");
                        System.out.println("Is prime: " + NumberUtils.isPrime(n));
                        break;
                    }
                    case "4": {
                        int n = readInt(scanner, "Enter number (>=0): ");
                        System.out.println("Factorial: " + NumberUtils.factorial(n));
                        break;
                    }
                    case "5": {
                        int n = readInt(scanner, "Enter n (>=0): ");
                        System.out.println("Fibonacci(" + n + "): " + NumberUtils.fibonacci(n));
                        break;
                    }
                    case "6": {
                        int a = readInt(scanner, "Enter a: ");
                        int b = readInt(scanner, "Enter b: ");
                        System.out.println("GCD: " + NumberUtils.gcd(a, b));
                        break;
                    }
                    case "7": {
                        int a = readInt(scanner, "Enter a: ");
                        int b = readInt(scanner, "Enter b: ");
                        System.out.println("LCM: " + NumberUtils.lcm(a, b));
                        break;
                    }
                    case "8": {
                        int n = readInt(scanner, "Enter number: ");
                        System.out.println("Binary: " + NumberUtils.toBinary(n));
                        break;
                    }
                    case "9": {
                        int n = readInt(scanner, "Enter number: ");
                        System.out.println("Hex: " + NumberUtils.toHex(n));
                        break;
                    }
                    case "10": {
                        int n = readInt(scanner, "Enter number: ");
                        System.out.println("Abs: " + NumberUtils.abs(n));
                        break;
                    }
                    case "11": {
                        int a = readInt(scanner, "Enter a: ");
                        int b = readInt(scanner, "Enter b (divisor): ");
                        System.out.println("Is divisible: " + NumberUtils.isDivisible(a, b));
                        break;
                    }
                    case "12": {
                        int base = readInt(scanner, "Enter base: ");
                        int exp  = readInt(scanner, "Enter exponent (>=0): ");
                        System.out.println("Power: " + NumberUtils.power(base, exp));
                        break;
                    }
                    case "13": {
                        int min = readInt(scanner, "Enter min: ");
                        int max = readInt(scanner, "Enter max: ");
                        System.out.println("Random: " + NumberUtils.generateRandom(min, max));
                        break;
                    }
                    case "14": {
                        int a = readInt(scanner, "Enter a: ");
                        int b = readInt(scanner, "Enter b: ");
                        System.out.println("Max: " + NumberUtils.max(a, b));
                        break;
                    }
                    case "15": {
                        int a = readInt(scanner, "Enter a: ");
                        int b = readInt(scanner, "Enter b: ");
                        System.out.println("Min: " + NumberUtils.min(a, b));
                        break;
                    }
                    case "16": {
                        int n = readInt(scanner, "Enter number: ");
                        System.out.println("Is positive: " + NumberUtils.isPositive(n));
                        break;
                    }
                    case "17": {
                        int n = readInt(scanner, "Enter number: ");
                        System.out.println("Is negative: " + NumberUtils.isNegative(n));
                        break;
                    }
                    case "0":
                        back = true;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


    private static void encodingOperations(Scanner scanner) {
        boolean back = false;

        while (!back) {
            System.out.println("\n-- Encoding Operations --");
            System.out.println("1. Base64 Encode");
            System.out.println("2. Base64 Decode");
            System.out.println("3. URL Encode");
            System.out.println("4. URL Decode");
            System.out.println("5. HEX Encode");
            System.out.println("6. HEX Decode");
            System.out.println("7. ROT13");
            System.out.println("8. Caesar Encode");
            System.out.println("9. Caesar Decode");
            System.out.println("10. MD5 Hash");
            System.out.println("11. SHA-256 Hash");
            System.out.println("0. Back");
            System.out.print("> ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1": {
                        String s = readString(scanner, "Enter text: ");
                        System.out.println("Base64: " + EncodingUtils.encodeBase64(s));
                        break;
                    }
                    case "2": {
                        String s = readString(scanner, "Enter Base64: ");
                        System.out.println("Decoded: " + EncodingUtils.decodeBase64(s));
                        break;
                    }
                    case "3": {
                        String s = readString(scanner, "Enter text: ");
                        System.out.println("URL Encoded: " + EncodingUtils.encodeURL(s));
                        break;
                    }
                    case "4": {
                        String s = readString(scanner, "Enter URL-encoded text: ");
                        System.out.println("URL Decoded: " + EncodingUtils.decodeURL(s));
                        break;
                    }
                    case "5": {
                        String s = readString(scanner, "Enter text: ");
                        System.out.println("HEX: " + EncodingUtils.encodeHex(s));
                        break;
                    }
                    case "6": {
                        String s = readString(scanner, "Enter HEX: ");
                        System.out.println("Decoded: " + EncodingUtils.decodeHex(s));
                        break;
                    }
                    case "7": {
                        String s = readString(scanner, "Enter text: ");
                        System.out.println("ROT13: " + EncodingUtils.applyROT13(s));
                        break;
                    }
                    case "8": {
                        String s = readString(scanner, "Enter text: ");
                        int shift = readInt(scanner, "Enter shift (0-25): ");
                        System.out.println("Caesar Encoded: " + EncodingUtils.encodeCaesar(s, shift));
                        break;
                    }
                    case "9": {
                        String s = readString(scanner, "Enter text: ");
                        int shift = readInt(scanner, "Enter shift (0-25): ");
                        System.out.println("Caesar Decoded: " + EncodingUtils.decodeCaesar(s, shift));
                        break;
                    }
                    case "10": {
                        String s = readString(scanner, "Enter text: ");
                        System.out.println("MD5: " + EncodingUtils.hashMD5(s));
                        break;
                    }
                    case "11": {
                        String s = readString(scanner, "Enter text: ");
                        System.out.println("SHA-256: " + EncodingUtils.hashSHA256(s));
                        break;
                    }
                    case "0":
                        back = true;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    private static String readString(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }




}
