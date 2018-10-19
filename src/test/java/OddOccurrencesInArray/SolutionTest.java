package OddOccurrencesInArray;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private int[] testTableSeven = {1, 1, 2, 0, 2, 56, 56};
    private int[] testTableNine = {152, 120, 65465, 2025, 120, 0, 2025, 152, 65465};
    private int[] testTableFirst = {5, 156, 22, 333, 156, 22, 333, 152, 152};
    private int[] testTableLast = {4, 3, 2, 2, 4, 3, 2, 2, 1};
    private Solution solution = new Solution();

    @Test
    public void solutionCodilityOddOccuranceTest() {
        Assert.assertEquals(0, solution.solution(testTableSeven));
        Assert.assertEquals(0, solution.solution(testTableNine));
        Assert.assertEquals(5, solution.solution(testTableFirst));
        Assert.assertEquals(1, solution.solution(testTableLast));
    }
}