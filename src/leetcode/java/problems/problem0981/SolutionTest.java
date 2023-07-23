package leetcode.java.problems.problem0981;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        TimeMap tm = new TimeMap();
        tm.set("love","high",10);
        tm.set("love","low",20);
        Assertions.assertEquals("", tm.get("love", 5));
        Assertions.assertEquals("high", tm.get("love", 10));
        Assertions.assertEquals("high", tm.get("love", 15));
    }
}
