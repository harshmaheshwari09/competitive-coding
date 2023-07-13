# 238. PRODUCT OF ARRAY EXCEPT SELF

* Question: https://leetcode.com/problems/product-of-array-except-self/
* Solution: [here](Solution.java)
* Tags: #array
* Complexity: Time: O(n), Space: O(1)

Just store the left and right product (Try doing this with extra space first)
This one is constant space because we are returning the array we created
In first pass calculate the left product except self and in second calculate the right
