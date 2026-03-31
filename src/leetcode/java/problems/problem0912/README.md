# 912. SORT AN ARRAY

* Question: [LeetCode](https://leetcode.com/problems/sort-an-array/)
* Bubble Sort: [here](BubbleSort.java)
* Selection Sort: [here](SelectionSort.java)
* Insertion Sort: [here](InsertionSort.java)
* Merge Sort: [here](MergeSort.java)
* Quick Sort: [here](QuickSort.java)
* Testing: [here](SolutionTest.java)
* Tags: #array #sorting #divide-and-conquer

## Approach Summary:

This folder contains multiple sorting implementations for the same problem so their tradeoffs can be compared directly.

### Bubble Sort

- Repeatedly swaps adjacent inverted pairs until large elements bubble to the end.
- Time: `O(n^2)` worst case, `O(n)` best case with early exit
- Space: `O(1)`

### Selection Sort

- Repeatedly selects the smallest remaining element and places it at the next sorted position.
- Time: `O(n^2)`
- Space: `O(1)`

### Insertion Sort

- Builds the sorted prefix one element at a time by shifting the current value left until it reaches its position.
- Time: `O(n^2)` worst case, `O(n)` best case
- Space: `O(1)`

### Merge Sort

- Recursively splits the array into halves, sorts each half, and merges them back together.
- Time: `O(n log n)`
- Space: `O(n)`

### Quick Sort

- Randomly chooses a pivot, partitions the array around it, and recursively sorts both sides.
- Time: average `O(n log n)`, worst-case `O(n^2)`
- Space: average `O(log n)`, worst-case `O(n)` due to recursion stack
