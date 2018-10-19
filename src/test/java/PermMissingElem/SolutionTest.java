package PermMissingElem;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private int[] testTableEmpty = {};
    private int[] testTableSingle = {2};
    private int[] testTableSingle2 = {1};
    private int[] testTableCodility = {2, 3, 1, 5};
    private int[] testTableMiddle = {1, 3, 5, 8, 9, 4, 7, 2};
    private int[] testTableFirst = {2, 3, 6, 5, 4, 7, 8, 9};
    private int[] testTableLast = {7, 5, 3, 1, 8, 4, 6, 2};
    private Solution solution = new Solution();

    @Test
    public void solutionCodilityOddOccuranceTest() {
        Assert.assertEquals(1, solution.solution(testTableEmpty));
        Assert.assertEquals(1, solution.solution(testTableSingle));
        Assert.assertEquals(2, solution.solution(testTableSingle2));
        Assert.assertEquals(4, solution.solution(testTableCodility));
        Assert.assertEquals(6, solution.solution(testTableMiddle));
        Assert.assertEquals(1, solution.solution(testTableFirst));
        Assert.assertEquals(9, solution.solution(testTableLast));
    }

}