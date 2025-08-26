package arrayUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class ArrayUtilsTest {

    @Test
    void sort_and_reverse() {
        int[] arr = {3, 1, 2};
        assertArrayEquals(new int[]{1,2,3}, ArrayUtils.sort(arr));
        assertArrayEquals(new int[]{2,1,3}, ArrayUtils.reverse(new int[]{3,1,2}));
    }

    @Test
    void containsDuplicate_and_unique() {
        int[] arr = {1,2,2,3};
        assertTrue(ArrayUtils.containsDuplicate(arr));
        assertArrayEquals(new int[]{1,2,3}, ArrayUtils.uniqueElements(arr));
    }

    @Test
    void sum_min_max_avg() {
        int[] arr = {2, 4, 6};
        assertEquals(12, ArrayUtils.sum(arr));
        assertEquals(2, ArrayUtils.min(arr));
        assertEquals(6, ArrayUtils.max(arr));
        assertEquals(4.0, ArrayUtils.average(arr), 1e-9);
    }

    @Test
    void index_remove_rotate() {
        int[] arr = {10, 20, 30, 40};
        assertEquals(2, ArrayUtils.indexOf(arr, 30));
        assertArrayEquals(new int[]{10, 30, 40}, ArrayUtils.removeElement(arr, 20));
        assertArrayEquals(new int[]{20,30,40,10}, ArrayUtils.rotateLeft(arr));
        assertArrayEquals(new int[]{40,10,20,30}, ArrayUtils.rotateRight(arr));
    }

    @Test
    void filter_even_odd() {
        int[] arr = {1,2,3,4,5,6};
        assertArrayEquals(new int[]{2,4,6}, ArrayUtils.filterEvenNumbers(arr));
        assertArrayEquals(new int[]{1,3,5}, ArrayUtils.filterOddNumbers(arr));
    }
}
