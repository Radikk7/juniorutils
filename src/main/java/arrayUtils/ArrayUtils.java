package arrayUtils;

import java.util.Arrays;
    /**
     * Utility class for working with arrays.
     */
    public class ArrayUtils {

        /**
         * Reverses the given array.
         * @param array Input array.
         * @return New array in reversed order.
         */
        public static int[] reverse(int[] array) {
            if (array == null) return null;
            int[] reversed = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                reversed[i] = array[array.length - 1 - i];
            }
            return reversed;
        }

        /**
         * Checks if the array contains any duplicate values.
         * @param array Input array.
         * @return True if duplicates are found, false otherwise.
         */
        public static boolean containsDuplicate(int[] array) {
            if (array == null) return false;
            Arrays.sort(array);
            for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1]) {
                    return true;
                }
            }
            return false;
        }

        /**
         * Sorts the array in ascending order.
         * @param array Input array.
         * @return New sorted array.
         */
        public static int[] sort(int[] array) {
            if (array == null) return null;
            int[] sorted = array.clone();
            Arrays.sort(sorted);
            return sorted;
        }

        /**
         * Returns the maximum value in the array.
         * @param array Input array.
         * @return Maximum value.
         */
        public static int max(int[] array) {
            if (array == null || array.length == 0)
                throw new IllegalArgumentException("Array is null or empty");
            int max = array[0];
            for (int value : array) {
                if (value > max) {
                    max = value;
                }
            }
            return max;
        }

        /**
         * Returns the minimum value in the array.
         * @param array Input array.
         * @return Minimum value.
         */
        public static int min(int[] array) {
            if (array == null || array.length == 0)
                throw new IllegalArgumentException("Array is null or empty");
            int min = array[0];
            for (int value : array) {
                if (value < min) {
                    min = value;
                }
            }
            return min;
        }

        /**
         * Returns the average of the array values.
         * @param array Input array.
         * @return Average value.
         */
        public static double average(int[] array) {
            if (array == null || array.length == 0)
                throw new IllegalArgumentException("Array is null or empty");
            return (double) sum(array) / array.length;
        }

        /**
         * Returns the sum of all values in the array.
         * @param array Input array.
         * @return Sum of elements.
         */
        public static int sum(int[] array) {
            if (array == null) return 0;
            int total = 0;
            for (int value : array) {
                total += value;
            }
            return total;
        }

        /**
         * Checks if the array is sorted in ascending order.
         * @param array Input array.
         * @return True if sorted, false otherwise.
         */
        public static boolean isSorted(int[] array) {
            if (array == null) return true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    return false;
                }
            }
            return true;
        }
        /**
         * Merges two integer arrays into one.
         * @param a First array.
         * @param b Second array.
         * @return Merged array.
         */
        public static int[] mergeArrays(int[] a, int[] b) {
            if (a == null) return b;
            if (b == null) return a;
            int[] result = new int[a.length + b.length];
            System.arraycopy(a, 0, result, 0, a.length);
            System.arraycopy(b, 0, result, a.length, b.length);
            return result;
        }
        /**
         * Returns the index of the first occurrence of a value in the array.
         * @param array Input array.
         * @param value Value to find.
         * @return Index of the value, or -1 if not found.
         */
        public static int indexOf(int[] array, int value) {
            if (array == null) return -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) return i;
            }
            return -1;
        }
        /**
         * Removes the first occurrence of a value from the array.
         * @param array Input array.
         * @param value Value to remove.
         * @return New array without the value.
         */
        public static int[] removeElement(int[] array, int value) {
            if (array == null) return null;
            int index = indexOf(array, value);
            if (index == -1) return array;

            int[] result = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    result[j++] = array[i];
                }
            }
            return result;
        }
        /**
         * Returns a new array containing only even numbers from the input array.
         * @param array Input array.
         * @return Array of even numbers.
         */
        public static int[] filterEvenNumbers(int[] array) {
            if (array == null) return null;
            return Arrays.stream(array)
                    .filter(n -> n % 2 == 0)
                    .toArray();
        }
        /**
         * Returns a new array containing only odd numbers from the input array.
         * @param array Input array.
         * @return Array of odd numbers.
         */
        public static int[] filterOddNumbers(int[] array) {
            if (array == null) return null;
            return Arrays.stream(array)
                    .filter(n -> n % 2 != 0)
                    .toArray();
        }
        /**
         * Returns an array with only unique elements (no duplicates).
         * @param array Input array.
         * @return Array of unique values.
         */
        public static int[] uniqueElements(int[] array) {
            if (array == null) return null;
            return Arrays.stream(array)
                    .distinct()
                    .toArray();
        }
        /**
         * Rotates the array to the left by one position.
         * @param array Input array.
         * @return Rotated array.
         */
        public static int[] rotateLeft(int[] array) {
            if (array == null || array.length <= 1) return array;
            int[] result = new int[array.length];
            for (int i = 1; i < array.length; i++) {
                result[i - 1] = array[i];
            }
            result[array.length - 1] = array[0];
            return result;
        }
        /**
         * Rotates the array to the right by one position.
         * @param array Input array.
         * @return Rotated array.
         */
        public static int[] rotateRight(int[] array) {
            if (array == null || array.length <= 1) return array;
            int[] result = new int[array.length];
            result[0] = array[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                result[i + 1] = array[i];
            }
            return result;
        }
        /**
         * Counts how many times a number appears in the array.
         * @param array Input array.
         * @param value Value to count.
         * @return Number of occurrences.
         */
        public static int countOccurrences(int[] array, int value) {
            if (array == null) return 0;
            int count = 0;
            for (int num : array) {
                if (num == value) count++;
            }
            return count;
        }
        /**
         * Checks if two arrays are equal.
         * @param a First array.
         * @param b Second array.
         * @return True if arrays are equal, false otherwise.
         */
        public static boolean arraysEqual(int[] a, int[] b) {
            return Arrays.equals(a, b);
        }











    }

