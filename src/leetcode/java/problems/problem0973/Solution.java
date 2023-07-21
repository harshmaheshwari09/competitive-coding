package leetcode.java.problems.problem0973;

import java.util.Random;

/**
 * Ques: https://leetcode.com/problems/k-closest-points-to-origin/
 * Tags: #quick_select
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public int[][] kClosest(int[][] p, int k) {
        Point[] points = new Point[p.length];
        int i = 0;
        for (int[] point : p) {
            points[i++] = new Point(point);
        }

        Random random = new Random();
        int left = 0; int right = points.length - 1;
        while (left < right) {
            int pivot = random.nextInt(right - left) + left;
            int pos = quickSelect(left, right, pivot, points);
            if (pos == k) {
                break;
            }
            if (pos < k) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }

        int[][] ans = new int[k][2];
        for (i = 0; i < k; i++) {
            ans[i] = points[i].coordinates;
        }
        return ans;
    }

    private int quickSelect(int left, int right, int pivot, Point[] points) {
        swap(points, left, pivot);
        pivot = left++;
        while (left <= right) {
            while (left <= right && points[left].dis < points[pivot].dis) {
                left++;
            }

            while (left <= right && points[right].dis >= points[pivot].dis) {
                right--;
            }

            if (left < right) {
                swap(points, left++, right--);
            }
        }
        swap(points, pivot, right);
        return right;
    }

    private void swap(Point[] points, int x, int y) {
        var temp = points[x];
        points[x] = points[y];
        points[y] = temp;
    }

    public class Point {
        int[] coordinates;
        int dis;

        public Point(int[] point) {
            this.coordinates = point;
            this.dis = point[0] * point[0] + point[1] * point[1];
        }
    }

}
