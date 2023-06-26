# 210. COURSE SCHEDULE II

* Question: https://leetcode.com/problems/course-schedule-ii
* Solution: [here](Solution.java)
* Tags: #graph, #topological_sort
* Complexity: Time: O(V+E), Space: O(V)

## Problem Description

You are given a list of courses, numCourses, and a list of prerequisites, prerequisites, where
prerequisites[i] = [ai, bi] indicates that you must take course bi before taking course ai. Return the ordering of
courses you should take to finish all courses. If there are multiple valid answers, return any of them. If it is
impossible to finish all courses, return an empty array.

For more details and examples, please refer to
the [LeetCode problem description](https://leetcode.com/problems/course-schedule-ii).

## Solution

The solution to this problem involves using topological sort. The algorithm follows these steps:

1. Calculate the adjacency matrix and the in-degree for all the nodes based on the prerequisites.
2. Add all the nodes with an in-degree of 0 to a queue.
3. While the queue is not empty, perform the following:
    * Pop an element from the queue and add it to the solution.
    * Update the in-degree of all its neighbors.
    * If any neighbor's in-degree becomes 0, add it to the queue.
4. If all the elements are added to the solution list, return the list. Otherwise, return an empty array.

The solution for this problem is implemented in the appropriate file [here](Solution.java).

## Complexity Analysis

The `time complexity of this solution is O(V + E)`, where V is the number of courses (vertices) and E is the number of
prerequisites (edges). The `space complexity is O(V)`, as we use additional data structures to store the adjacency matrix
and in-degrees.