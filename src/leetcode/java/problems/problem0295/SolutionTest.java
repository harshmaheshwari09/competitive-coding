package leetcode.java.problems.problem0295;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(-1);
        Assertions.assertEquals(-1.0, mf.findMedian());
        mf.addNum(-2);
        Assertions.assertEquals(-1.5, mf.findMedian());
        mf.addNum(-3);
        Assertions.assertEquals(-2.0, mf.findMedian());
    }
}
