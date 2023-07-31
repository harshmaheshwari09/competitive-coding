package leetcode.java.problems.problem0133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/clone-graph/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class Solution {
    public Node cloneGraph(Node node) {
        Map<Integer, Node> nodeMap = new HashMap<>();
        return helper(node, nodeMap);
    }

    private Node helper(Node node, Map<Integer, Node> nodeMap) {
        if (node == null) {
            return null;
        }

        int value = node.val;
        if (nodeMap.containsKey(value)) {
            return nodeMap.get(value);
        }

        Node newNode = new Node(value);
        nodeMap.put(value, newNode);
        for (var neigh : node.neighbors) {
            newNode.neighbors.add(helper(neigh, nodeMap));
        }
        return newNode;
    }
}
