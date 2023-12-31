# 659. ENCODE AND DECODE STRINGS

* Question: https://leetcode.com/problems/encode-and-decode-strings/
* Solution: [here](Solution.java)
* Tags: #string
* Complexity: Time: O(n), Space: O(n)

## Problem Description

Design an algorithm to encode a list of strings to a string and decode a string to a list of strings.

Implement the encode and decode methods:
* **encode(strs)** - Encodes a list of strings strs to a single string.
* **decode(s)** - Decodes the encoded string s back to the original list of strings.

Note:
The input list of strings can contain any printable ASCII characters and commas (',').

## Example
```
Input: ["hello", "world", "leet", "code"]
Output: "5#hello,5#world,4#leet,4#code"
Explanation:
The encoded string is composed of the string length followed by '#' and the string itself.
The comma (',') separates each encoded string.
```