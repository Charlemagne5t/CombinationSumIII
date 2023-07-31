import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void combinationSum3Test1() {
        int k = 3;
        int n = 7;
        List<List<Integer>> expected = new ArrayList<>(List.of(new ArrayList<>(List.of(1, 2, 4))));
        List<List<Integer>> actual = new Solution().combinationSum3(k, n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void combinationSum3Test2() {
        int k = 3;
        int n = 9;
        List<List<Integer>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1, 2, 6)),
                new ArrayList<>(List.of(1, 3, 5)),
                new ArrayList<>(List.of(2, 3, 4))
        ));
        List<List<Integer>> actual = new Solution().combinationSum3(k, n);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void combinationSum3Test3() {
        int k = 4;
        int n = 1;
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = new Solution().combinationSum3(k, n);

        Assert.assertEquals(expected, actual);
    }
}
