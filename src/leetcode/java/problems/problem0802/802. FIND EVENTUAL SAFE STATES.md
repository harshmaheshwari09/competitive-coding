# 802. FIND EVENTUAL SAFE STATES

* Question: https://leetcode.com/problems/find-eventual-safe-states/
* Solution: [here](Solution.java)
* Tags: #topological_sort
* Complexity: Time: O(V+E), Space: O(V)

## Problem Description

You are given a directed graph, where each node represents a set of nodes that it has a directed edge to. You need to
find and return a list of nodes that are eventually safe. A node is considered eventually safe if there exists a
directed path starting from that node that does not contain any cycles.

For more details and examples, please refer to
the [LeetCode problem description.](https://leetcode.com/problems/find-eventual-safe-states/)

## Solution

The solution to this problem involves using a topological sort to identify the eventually safe nodes. The algorithm
follows these steps:

1. Create an adjacency list where the direction of the edges is reversed. This means that for each node, store the nodes
   that have directed edges towards it.
2. Create an in-degree array that stores the in-degree of each node. Initially, set all indegrees to the number of
   incoming
   edges for each node.
3. Initialize a queue and add all nodes with an in-degree of 0 to the queue. These nodes are considered safe initially.
4. While the queue is not empty, perform the following:
    * Pop a node from the queue and add it to the list of eventually safe nodes.
    * Iterate through the neighbors of the current node:
        * Reduce the in-degree of each neighbor by 1.
        * If the in-degree of a neighbor becomes 0, add it to the queue as it is now considered safe.
5. Return the list of eventually safe nodes.

The solution for this problem is implemented in the appropriate file [here](Solution.java).

## Complexity Analysis

The `time complexity of this solution is O(V + E)`, where V is the number of nodes (vertices) and E is the number of
edges
in the graph. This is because we need to visit each node and its outgoing edges once. The `space complexity is O(V)`,
considering the space required for the adjacency list, the in-degree array, and the queue.
