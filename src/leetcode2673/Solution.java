package leetcode2673;

class Solution {
    int ans;

    public int minIncrements(int n, int[] cost) {
        int firstLeaf = (n - 1) / 2;
        int maxLeaf = 0;
        for (int i = 0; i < firstLeaf; i++) {
            cost[getLeftChildIdx(i)] += cost[i]; // updating left child
            cost[getRightChildIdx(i)] += cost[i]; // updating right child
            maxLeaf = Math.max(maxLeaf, Math.max(cost[getLeftChildIdx(i)], cost[getRightChildIdx(i)]));
        }
        ans = 0;
        helper(0, n, cost, maxLeaf);
        return ans;
    }

    public int helper(int curr, int n, int[] cost, int maxLeaf) {
        if (isLeaf(curr, n)) {
            int diff = maxLeaf - cost[curr];
            cost[curr] = maxLeaf;
            ans += diff;
            return diff;
        }
        int left = helper(getLeftChildIdx(curr), n, cost, maxLeaf);
        int right = helper(getRightChildIdx(curr), n, cost, maxLeaf);
        int diff = Math.min(left, right);
        cost[curr] += diff;
        ans -= diff;
        return diff;
    }

    public int getLeftChildIdx(int curr) {
        return curr * 2 + 1;
    }


    public int getRightChildIdx(int curr) {
        return curr * 2 + 2;
    }

    public boolean isLeaf(int curr, int n) {
        return (curr * 2 + 1 >= n);
    }
}
