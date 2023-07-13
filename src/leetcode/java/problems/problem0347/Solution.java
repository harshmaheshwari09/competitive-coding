package leetcode.java.problems.problem0347;

import java.util.*;

/**
 * Ques: https://leetcode.com/problems/top-k-frequent-elements/description/
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int val : nums) {
            freqMap.put(val, freqMap.getOrDefault(val, 0) + 1);
        }
        return quickSelectHelper(freqMap, k);
    }

    /**
     * Tags: #quick_select
     * Complexity: Time: O(n), Space: O(n)
     */
    private int[] quickSelectHelper(Map<Integer, Integer> freqMap, int k) {
        Random random = new Random();
        int arr[] = new int[freqMap.size()];
        int i = 0;
        for (int val : freqMap.keySet()) {
            arr[i++] = val;
        }
        int left = 0, right = freqMap.size() - 1;
        while (left < right) {
            int pivot = random.nextInt(right - left) + left;
            int pos = quickSelect(freqMap, arr, left, pivot, right);
            if (pos == k - 1) {
                break;
            }
            if (pos < k) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }
        int ans[] = new int[k];
        for (i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    private int quickSelect(Map<Integer, Integer> freqMap, int[] arr, int left, int pivot, int right) {
        swap(arr, left, pivot);
        pivot = left++;
        while (left <= right) {
            while (left <= right && freqMap.get(arr[left]) > freqMap.get(arr[pivot])) {
                left++;
            }
            while (left < right && freqMap.get(arr[pivot]) >=  freqMap.get(arr[right])) {
                right--;
            }
            if (left <= right) {
                swap(arr, left++, right--);
            }
        }
        swap(arr, pivot, right);
        return right;
    }

    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    /**
     * Tags: #heap, #array
     * Complexity: Time: O(n * log(k)), Space: O(n)
     */
    private int[] priorityQueueHelper(Map<Integer, Integer> freqMap, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (var entry : freqMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
