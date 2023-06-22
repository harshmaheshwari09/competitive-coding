# 540. SINGLE ELEMENT IN A SORTED ARRAY

* Question: https://leetcode.com/problems/single-element-in-a-sorted-array/
* Solution: [here](Solution.java)
* Tags: #binary_search
* Complexity: Time: O(log(n)), SpaceO(1)

To find the single element in a sorted array where all other elements occur twice, you can use the following approach
based on the properties you mentioned:

1. Initialize two pointers, 'left' and 'right', pointing to the start and end of the array, respectively.

2. Perform a binary search on the array while 'left' is less than 'right'.

3. Calculate the middle index as 'mid' = (left + right) / 2.

4. Check if the element at index 'mid' is the single element. You can do this by comparing it with its adjacent
   elements. If it is not equal to either of its adjacent elements, then it is the single element. Return it as the
   result.

5. If the element at index 'mid' is not the single element, check if it is at an odd index (odd position) and is the
   first occurrence of that number, or if it is at an even index (even position) and is the second occurrence of that
   number.

6. If the above condition is true, it means the single element is on the left side of 'mid'. Update 'right' to 'mid - 1'
   and repeat the binary search from step 2.

7. If the above condition is false, it means the single element is on the right side of 'mid'. Update 'left' to 'mid +
   1' and repeat the binary search from step 2.

8. Continue the binary search until 'left' becomes greater than 'right'. In this case, the single element will be the
   element at index 'left'. Return it as the result.

By using this approach, you can efficiently find the single element in the sorted array where all other elements occur
twice.






