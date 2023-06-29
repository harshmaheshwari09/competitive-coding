# 733. FLOOD FILL

* Question: https://leetcode.com/problems/flood-fill/
* Solution: [here](Solution.java)
* Tags: #dfs, #graph
* Complexity: Time: O(m*n), Space: O(m*n)

# Problem Description

You are given an m x n matrix image consisting of integers representing the pixel values of an image. You are also given
an sr, sc, and newColor. You need to perform a flood fill on the image starting from the pixel at row sr and column sc.

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of
the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same
color), and so on. Replace the color of all of the aforementioned pixels with newColor.

Return the modified image after performing the flood fill.

For more details and examples, please refer to
the [LeetCode problem description.](https://leetcode.com/problems/flood-fill/)

## Solution

The solution to this problem can be achieved by using a depth-first search (DFS) approach. The algorithm follows these
steps:

1. Retrieve the color of the starting pixel at (sr, sc) and store it in a variable.
2. Check if the color of the starting pixel is already equal to the newColor. If they are the same, return the original
   image as no modification is needed.
3. Perform a DFS on the starting pixel and its neighboring pixels:
    * If the current pixel is within the boundaries of the image, has the same color as the starting pixel, and has not
      been visited yet, update its color to newColor.
    * Recursively call the DFS on the neighboring pixels.
4. Return the modified image.

**NOTE:** A point to note here is that if the initial coordinate has the same color as the given newColor, the function
should
return the original image. This is important to avoid an infinite loop where the function keeps modifying the same
pixels repeatedly.

The solution for this problem is implemented in the appropriate file [here](Solution.java)

## Complexity Analysis

The `time complexity of this solution is O(m * n)`, where m is the number of rows and n is the number of columns in the
image. This is because in the worst case, we may have to visit every pixel in the image. The `space complexity is O(m *
n)` as well, considering the space required for the recursive DFS calls.