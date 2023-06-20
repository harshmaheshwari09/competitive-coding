package leetcode.java.problems.problem0912;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testBubbleSort() {
        Sort obj = new BubbleSort();
        int[] actual = {1, 4, 2, 3, 5};
        obj.performSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectionSort() {
        Sort obj = new SelectionSort();
        int[] actual = {1, 4, 2, 3, 5};
        obj.performSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsertionSort() {
        Sort obj = new InsertionSort();
        int[] actual = {1, 4, 2, 3, 5};
        obj.performSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeSort() {
        Sort obj = new MergeSort();
        int[] actual = {1, 4, 2, 3, 5};
        obj.performSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testQuickSort() {
        Sort obj = new QuickSort();
        int[] actual = {1, 4, 2, 3, 5};
        obj.performSort(actual);
        int[] expected = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expected, actual);
    }
}
