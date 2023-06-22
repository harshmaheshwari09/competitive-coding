# 160. INTERSECTION OF TWO LINKED LISTS

* Question: https://leetcode.com/problems/intersection-of-two-linked-lists/
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #linked_list
* Complexity: O(n)

To find the intersection point of two linked lists, you can use the following approach:

1. Traverse both linked lists and find their lengths, let's call them 'n' and 'm', where 'n' is the length of the first
   linked list and 'm' is the length of the second linked list.

2. Calculate the difference between the lengths: diff = |n - m|.

3. Move the pointer of the longer linked list (the one with 'n' nodes) forward by 'diff' steps. This ensures that both
   linked lists have the same number of nodes remaining to traverse.

4. Iterate through both linked lists simultaneously, moving their pointers forward by one node at a time until they either
   intersect (i.e., the pointers point to the same node) or reach the end of both lists (i.e., the pointers are both null).

5. If the pointers intersect, then you have found the intersection point. Return the intersecting node.

6. If the pointers reach the end of both lists without intersecting, then there is no intersection point. Return null or
   any other appropriate indication.

By following these steps, you can determine the intersection point of two linked lists efficiently.
