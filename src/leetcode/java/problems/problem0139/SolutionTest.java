package leetcode.java.problems.problem0139;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        List<String> dict = List.of("leet", "code");
        String word = "leetcode";
        Assertions.assertTrue(sol.wordBreak(word, dict));
    }
}
