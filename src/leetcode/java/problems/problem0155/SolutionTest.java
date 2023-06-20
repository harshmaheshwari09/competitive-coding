package leetcode.java.problems.problem0155;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testSolution1() {
        MinStack st = new MinStack();
        st.push(-2);
        st.push(0);
        st.push(-3);
        Assertions.assertEquals(-3, st.getMin());
        st.pop();
        Assertions.assertEquals(0, st.top());
        Assertions.assertEquals(-2, st.getMin());

    }
}
