import org.example.ArrayUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLast() {
        int[] x = { 2, 3, 5 };
        int y = 2;
        int result = ArrayUtils.findLast(x, y);
        assertEquals(-1, result);

        int[] x2 = { 1, 2, 3, 2 };
        int result2 = ArrayUtils.findLast(x2, 2);
        assertEquals(3, result2);

        int[] x3 = {};
        int result3 = ArrayUtils.findLast(x3, 2);
        assertEquals(-1, result3);

        int[] x4 = { 2 };
        int result4 = ArrayUtils.findLast(x4, 2);
        assertEquals(-1, result4);

        int[] x5 = { 3, 2 };
        int result5 = ArrayUtils.findLast(x5, 2);
        assertEquals(1, result5);

        int[] x6 = { 2, 3 };
        int result6 = ArrayUtils.findLast(x6, 2);
        assertEquals(-1, result6);
    }

    @Test
    public void testLastZero() {
        int[] x = { 0, 1, 0 };
        int result = ArrayUtils.lastZero(x);
        assertEquals(0, result);

        int[] x2 = { 1, 2, 3 };
        int result2 = ArrayUtils.lastZero(x2);
        assertEquals(-1, result2);

        int[] x3 = {};
        int result3 = ArrayUtils.lastZero(x3);
        assertEquals(-1, result3);

        int[] x4 = { 0 };
        int result4 = ArrayUtils.lastZero(x4);
        assertEquals(0, result4);

        int[] x5 = { 1, 0 };
        int result5 = ArrayUtils.lastZero(x5);
        assertEquals(1, result5);
    }

    @Test
    public void testCountPositive() {
        int[] x = { -4, 2, 0, 2 };
        int result = ArrayUtils.countPositive(x);
        assertEquals(3, result);

        int[] x2 = { -1, -2, -3 };
        int result2 = ArrayUtils.countPositive(x2);
        assertEquals(0, result2);

        int[] x3 = {};
        int result3 = ArrayUtils.countPositive(x3);
        assertEquals(0, result3);

        int[] x4 = { 0 };
        int result4 = ArrayUtils.countPositive(x4);
        assertEquals(1, result4);

        int[] x5 = { 1, 2, 3 };
        int result5 = ArrayUtils.countPositive(x5);
        assertEquals(3, result5);
    }

    @Test
    public void testOddOrPos() {
        int[] x = { -3, -2, 0, 1, 4 };
        int result = ArrayUtils.oddOrPos(x);
        assertEquals(2, result);

        int[] x2 = { -2, 0 };
        int result2 = ArrayUtils.oddOrPos(x2);
        assertEquals(0, result2);

        int[] x3 = { 2, 4, 6 };
        int result3 = ArrayUtils.oddOrPos(x3);
        assertEquals(3, result3);

        int[] x4 = {};
        int result4 = ArrayUtils.oddOrPos(x4);
        assertEquals(0, result4);

        int[] x5 = { 1, 3, 5 };
        int result5 = ArrayUtils.oddOrPos(x5);
        assertEquals(3, result5);

        int[] x6 = { -1, -3, -5 };
        int result6 = ArrayUtils.oddOrPos(x6);
        assertEquals(0, result6);
    }

    @Test
    public void testFindLength() {
        int[] nums = { -2, 0, 4, 5, 6 };
        int k = 4;
        int result = ArrayUtils.findLength(nums, k);
        assertEquals(2, result);

        int[] nums2 = { 1, 2 };
        int result2 = ArrayUtils.findLength(nums2, 10);
        assertEquals(1, result2);

        int[] nums3 = {};
        int result3 = ArrayUtils.findLength(nums3, 5);
        assertEquals(0, result3);

        int[] nums4 = { 10 };
        int result4 = ArrayUtils.findLength(nums4, 5);
        assertEquals(0, result4);

        int[] nums5 = { 6, 7, 8 };
        int result5 = ArrayUtils.findLength(nums5, 5);
        assertEquals(0, result5);

        int[] nums6 = { 1, 2, 3, 4, 1, 1 };
        int result6 = ArrayUtils.findLength(nums6, 5);
        assertEquals(1, result6);

        int[] nums7 = { 3, 1, 2, 1 };
        int result7 = ArrayUtils.findLength(nums7, 4);
        assertEquals(2, result7);

        int[] nums8 = { 4 };
        int result8 = ArrayUtils.findLength(nums8, 4);
        assertEquals(0, result8);

        int[] nums9 = { 1, 2, 1, 2 };
        int result9 = ArrayUtils.findLength(nums9, 3);
        assertEquals(1, result9);
    }

    @Test
    public void testCountOf() {
        int[] emptyArray = {};
        assertEquals(0, ArrayUtils.countOf(emptyArray, 5));

        int[] noTarget = { 1, 2, 3 };
        assertEquals(0, ArrayUtils.countOf(noTarget, 5));

        int[] oneTarget = { 1, 5, 3 };
        assertEquals(1, ArrayUtils.countOf(oneTarget, 5));

        int[] multiTarget = { 5, 2, 5, 4, 5 };
        assertEquals(3, ArrayUtils.countOf(multiTarget, 5));

        int[] allTarget = { 5, 5, 5 };
        assertEquals(3, ArrayUtils.countOf(allTarget, 5));

        int[] singleElement = { 5 };
        assertEquals(1, ArrayUtils.countOf(singleElement, 5));

        int[] singleNonTarget = { 1 };
        assertEquals(0, ArrayUtils.countOf(singleNonTarget, 5));
    }
}