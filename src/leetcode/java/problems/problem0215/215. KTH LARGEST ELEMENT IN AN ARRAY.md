# 215. KTH LARGEST ELEMENT IN AN ARRAY

* Question: https://leetcode.com/problems/kth-largest-element-in-an-array/
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)

## Brute Force Approach

The brute force approach involves sorting the array in non-decreasing order and returning the element at the Kth index.
This can be achieved using any efficient sorting algorithm such as QuickSort or MergeSort. The time complexity of this
approach is `O(nlog(n))`, where n is the size of the array.

## Min Heap Approach

The min heap approach involves maintaining a min heap of size K. We initially insert the first K elements of the array
into the min heap. For each subsequent element, we compare it with the root of the min heap. If the element is greater
than the root, we replace the root with the new element and heapify the min heap to maintain its property. At the end,
the root of the min heap will be the Kth largest element in the array. The time complexity of this approach is
`O(nlog(K))`, where n is the size of the array.

## QuickSelect Approach

The QuickSelect algorithm is an efficient in-place approach for finding the Kth largest element. It is based on the
partitioning step of the QuickSort algorithm. The idea is to randomly select an element as the pivot and partition the
array such that all elements on the left side are smaller than or equal to the pivot, and all elements on the right side
are greater than the pivot. If the position of the pivot after partitioning is exactly K, then we have found the Kth
largest element. Otherwise, we recursively apply the QuickSelect algorithm on the left or right partition based on the
position of the pivot compared to K. `The average time complexity of QuickSelect is O(n), but in the worst case, it can
be O(n^2)`.
