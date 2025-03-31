
import org.example.ArrayUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLast() {
        int[] x = {2, 3, 5};
        int y = 2;
        int result = ArrayUtils.findLast(x, y);
        assertEquals(-1, result);
    }

    @Test
    public void testLastZero() {
        int[] x = {0, 1, 0};
        int result = ArrayUtils.lastZero(x);
        assertEquals(0, result);
    }

    @Test
    public void testCountPositive() {
        int[] x = {-4, 2, 0, 2};
        int result = ArrayUtils.countPositive(x);
        assertEquals(3, result);
    }

    @Test
    public void testOddOrPos() {
        int[] x = {-3, -2, 0, 1, 4};
        int result = ArrayUtils.oddOrPos(x);
    }

    @Test
    public void testFindLength() {
        int[] nums = {-2, 0, 4, 5, 6};
        int k = 4;
        int result = ArrayUtils.findLength(nums, k);
        assertEquals(2, result);
    }

    @Test
    public void testCountOf() {
        int[] emptyArray = {};
        assertEquals(0, ArrayUtils.countOf(emptyArray, 5));

        int[] noTarget = {1, 2, 3};
        assertEquals(0, ArrayUtils.countOf(noTarget, 5));

        int[] oneTarget = {1, 5, 3};
        assertEquals(1, ArrayUtils.countOf(oneTarget, 5));

        int[] multiTarget = {5, 2, 5, 4, 5};
        assertEquals(3, ArrayUtils.countOf(multiTarget, 5));
    }
}