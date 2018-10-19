package ratation;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private int[] empty = {};
    private int[] fiveElements = {1, 2, 3, 4, 5};
    private int[] tenElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    private Solution solution = new Solution();

    @Test
    public void testRotationByOne() {
        int[] fiveRotatedByOne = {5, 1, 2, 3, 4};
        int[] tenRotatedByOne = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(empty, solution.solution(empty, 1));
        Assert.assertArrayEquals(fiveRotatedByOne, solution.solution(fiveElements, 1));
        Assert.assertArrayEquals(tenRotatedByOne, solution.solution(tenElements, 1));
    }

    @Test
    public void testRotationByTwo() {
        int[] fiveRotatedByTwo = {4, 5, 1, 2, 3};
        int[] tenRotatedByTwo = {9, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        Assert.assertArrayEquals(empty, solution.solution(empty, 2));
        Assert.assertArrayEquals(fiveRotatedByTwo, solution.solution(fiveElements, 2));
        Assert.assertArrayEquals(tenRotatedByTwo, solution.solution(tenElements, 2));
    }

    @Test
    public void testRotationBySix() {
        int[] fiveRotatedBySix = {5, 1, 2, 3, 4};
        int[] tenRotatedBySix = {5, 6, 7, 8, 9, 0, 1, 2, 3, 4};
        Assert.assertArrayEquals(empty, solution.solution(empty, 6));
        Assert.assertArrayEquals(fiveRotatedBySix, solution.solution(fiveElements, 6));
        Assert.assertArrayEquals(tenRotatedBySix, solution.solution(tenElements, 6));
    }

    @Test
    public void testRotationByTen() {
        int[] fiveRotatedByTen = {1, 2, 3, 4, 5};
        int[] tenRotatedByTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Assert.assertArrayEquals(empty, solution.solution(empty, 10));
        Assert.assertArrayEquals(fiveRotatedByTen, solution.solution(fiveElements, 10));
        Assert.assertArrayEquals(tenRotatedByTen, solution.solution(tenElements, 10));
    }
}