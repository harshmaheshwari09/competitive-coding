package leetcode.java.problems.problem0912;

/**
 * Complexity: Time: O(nLog(n)), Space: O(n)
 */
public class MergeSort implements Sort {
    @Override
    public void performSort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    public void mergeSort(int[] nums, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + (r - l) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, mid, mid + 1, r);
    }

    public void merge(int[] nums, int l1, int r1, int l2, int r2) {
        int[] left = new int[r1 - l1 + 1];
        for (int i = l1; i <= r1; i++) {
            left[i - l1] = nums[i];
        }

        int[] right = new int[r2 - l2 + 1];
        for (int i = l2; i <= r2; i++) {
            right[i - l2] = nums[i];
        }

        int leftPtr = 0, rightPtr = 0;
        while (leftPtr < left.length && rightPtr < right.length) {
            nums[l1++] = (left[leftPtr] < right[rightPtr] ? left[leftPtr++] : right[rightPtr++]);
        }
        while (leftPtr < left.length) {
            nums[l1++] = left[leftPtr++];
        }
        while (rightPtr < right.length) {
            nums[l1++] = right[rightPtr++];
        }
    }
}
