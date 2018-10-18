package maxGap;



public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void solutionCodilityOnGapTest() {
        Assert.assertEquals(1, solution.solution(5));
        Assert.assertEquals(2, solution.solution(9));
        Assert.assertEquals(4, solution.solution(33));
        Assert.assertEquals(8, solution.solution(513));
        Assert.assertEquals(8, solution.solution(513));
    }

    @Test
    public void solutionCodilityManyGapsTest() {
        Assert.assertEquals(4, solution.solution(529));
        Assert.assertEquals(5, solution.solution(1041));
        Assert.assertEquals(4, solution.solution(4241));
        Assert.assertEquals(3, solution.solution(2199));
        Assert.assertEquals(5, solution.solution(42049));
    }

    @Test
    public void solutionCodilityZeroGapsTest() {
        Assert.assertEquals(0, solution.solution(7));
        Assert.assertEquals(0, solution.solution(15));
        Assert.assertEquals(0, solution.solution(32));
        Assert.assertEquals(0, solution.solution(127));
        Assert.assertEquals(0, solution.solution(1023));
    }
}