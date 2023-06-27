package leetcode.java.problems.problem0690;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/employee-importance
 * Tags: #tree
 * Complexity: Time: O(n), Space: O(n)
 */
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Employee requestedEmployee = null;
        for (var employee : employees) {
            employeeMap.put(employee.id, employee);
            if (employee.id == id) {
                requestedEmployee = employee;
            }
        }
        return helper(requestedEmployee, employeeMap);
    }

    private int helper(Employee employee, Map<Integer, Employee> employeeMap) {
        int ans = employee.importance;
        for (var subordinate : employee.subordinates) {
            ans += helper(employeeMap.get(subordinate), employeeMap);
        }
        return ans;
    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};