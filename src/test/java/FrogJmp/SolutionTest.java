package FrogJmp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void smallNumberTest() {
        assertEquals(3, solution.solution(10, 85, 30));
        assertEquals(9, solution.solution(1, 10, 1));
        assertEquals(5, solution.solution(1, 10, 2));
    }

    @Test
    public void largeNumberTest() {
        assertEquals(9999, solution.solution(1, 10_000, 1));
        assertEquals(28_076, solution.solution(5022, 10_000_000, 356));
        assertEquals(4516, solution.solution(15_642, 568_492_479, 125_899));
        assertEquals(284238419, solution.solution(15_642, 568_492_479, 2));
    }

    @Test
    public void trickyNumberTest() {
        assertEquals(0, solution.solution(1, 1, 100));
        assertEquals(1, solution.solution(1, 101, 100));
        assertEquals(2, solution.solution(1, 102, 100));
        assertEquals(142730189, solution.solution(3, 999111321, 7));
    }

}