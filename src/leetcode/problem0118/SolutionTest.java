package leetcode.problem0118;

import org.junit.jupiter.api.Test;
import resources.ValidationMethods;

import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.generate(5);
        List<List<Integer>> expected =
            List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
            );
        ValidationMethods.validateListOfList(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        List<List<Integer>> actual = sol.generate(1);
        List<List<Integer>> expected = List.of(List.of(1));
        ValidationMethods.validateListOfList(expected, actual);
    }
}
