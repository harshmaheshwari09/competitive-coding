package leetcode.java.problems.problem0327;

/**
 * Ques: <a href="https://algomaster.io/learn/dsa/count-of-range-sum">...</a>
 * LeetCode: <a href="https://leetcode.com/problems/count-of-range-sum/">...</a>
 * Tags: #prefix_sum #merge_sort #divide_and_conquer #binary_indexed_tree
 * Complexity: Time: O(n log n), Space: O(n)
 */
public class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] prefixSums = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }

        long[] temp = new long[prefixSums.length];
        return (int) countRangeSum(prefixSums, temp, 0, prefixSums.length, lower, upper);
    }

    private long countRangeSum(long[] sums, long[] temp, int left, int right, int lower, int upper) {
        if (right - left <= 1) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        long count = countRangeSum(sums, temp, left, mid, lower, upper)
                + countRangeSum(sums, temp, mid, right, lower, upper);

        int lowerBound = mid;
        int upperBound = mid;
        for (int i = left; i < mid; i++) {
            while (lowerBound < right && sums[lowerBound] - sums[i] < lower) {
                lowerBound++;
            }
            while (upperBound < right && sums[upperBound] - sums[i] <= upper) {
                upperBound++;
            }
            count += upperBound - lowerBound;
        }

        merge(sums, temp, left, mid, right);
        return count;
    }

    private void merge(long[] sums, long[] temp, int left, int mid, int right) {
        int leftPtr = left;
        int rightPtr = mid;
        int writePtr = left;

        while (leftPtr < mid && rightPtr < right) {
            if (sums[leftPtr] <= sums[rightPtr]) {
                temp[writePtr++] = sums[leftPtr++];
            } else {
                temp[writePtr++] = sums[rightPtr++];
            }
        }
        while (leftPtr < mid) {
            temp[writePtr++] = sums[leftPtr++];
        }
        while (rightPtr < right) {
            temp[writePtr++] = sums[rightPtr++];
        }

        for (int i = left; i < right; i++) {
            sums[i] = temp[i];
        }
    }
}
