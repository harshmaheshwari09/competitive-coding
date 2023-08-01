package leetcode.java.problems.problem0207;

import java.util.*;

/**
 * Ques: https://leetcode.com/problems/course-schedule/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        int[] inDegree = new int[numCourses];
        for (int[] entry : prerequisites) {
            int src = entry[1];
            int des = entry[0];
            map.get(src).add(des);
            inDegree[des]++;
        }

        int coursesCompleted = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                q.offer(i);
                coursesCompleted++;
            }
        }

        while (q.size() > 0) {
            int node = q.poll();
            for (int neigh : map.get(node)) {
                inDegree[neigh]--;
                if (inDegree[neigh] == 0) {
                    q.offer(neigh);
                    coursesCompleted++;
                }
            }
        }

        return numCourses == coursesCompleted;
    }
}
