<h1>Java Array Tricks for DSA</h1>

## Tricks/algorithms

1. [Sliding Window Technique](#sliding-window-technique)
2. [Two-Pointer Technique](#two-pointer-technique)
3. [Kadane’s Algorithm for Maximum Subarray Sum](#kadane’s-algorithm-for-maximum-subarray-sum)
4. [Majority Element (Boyer-Moore Voting Algorithm)](#majority-element-boyer-moore-voting-algorithm)
5. [Prefix Sum for Range Queries](#prefix-sum-for-range-queries)

---

### 1. Sliding Window Technique

This technique is used to find subarrays with a specific sum, maximum sum, or other properties within a fixed window size.

**Example Problem**: Find the maximum sum of any subarray of size `k`.

**Code:**
```java
int maxSum(int[] arr, int k) {
    int windowSum = 0; // Holds the sum of the current window
    int maxSum = Integer.MIN_VALUE; // Stores the maximum sum found

    // Initialize the first window
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }
    maxSum = windowSum;

    // Slide the window over the array
    for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k]; // Add next element, remove the element that slides out
        maxSum = Math.max(maxSum, windowSum); // Update maxSum if we found a new maximum
    }
    return maxSum;
}
```

**Input:**
```java
int[] arr = {2, 1, 5, 1, 3, 2};
int k = 3;
```

**Output:**
```
9  // Maximum sum of subarray [5, 1, 3]
```

---

### 2. Two-Pointer Technique

This technique is effective for finding pairs or triplets with a given sum or for manipulating elements in sorted arrays.

**Example Problem**: Check if there exists a pair of elements in a sorted array that adds up to a target sum.

**Code:**
```java
boolean hasPairWithSum(int[] arr, int sum) {
    int left = 0, right = arr.length - 1; // Initialize two pointers

    // Traverse until the pointers meet
    while (left < right) {
        int currentSum = arr[left] + arr[right];
        if (currentSum == sum) return true; // Pair found
        else if (currentSum < sum) left++; // Increase left pointer if sum is too small
        else right--; // Decrease right pointer if sum is too large
    }
    return false;
}
```

**Input:**
```java
int[] arr = {1, 2, 4, 4};
int sum = 8;
```

**Output:**
```
true  // Pair (4, 4) adds up to 8
```

---

### 3. Kadane’s Algorithm for Maximum Subarray Sum

Kadane’s Algorithm is used to find the maximum sum of a contiguous subarray in O(n) time.

**Example Problem**: Find the maximum sum of any contiguous subarray.

**Code:**
```java
int maxSubArraySum(int[] arr) {
    int maxSoFar = arr[0]; // Stores the maximum sum found so far
    int maxEndingHere = arr[0]; // Stores the maximum sum of subarrays ending at current position

    // Traverse the array
    for (int i = 1; i < arr.length; i++) {
        maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]); // Extend or start a new subarray
        maxSoFar = Math.max(maxSoFar, maxEndingHere); // Update maxSoFar if new maximum found
    }
    return maxSoFar;
}
```

**Input:**
```java
int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
```

**Output:**
```
6  // Maximum subarray sum for subarray [4, -1, 2, 1]
```

---

### 4. Majority Element (Boyer-Moore Voting Algorithm)

The Boyer-Moore Voting Algorithm efficiently finds an element that appears more than n/2 times in an array.

**Example Problem**: Find the majority element in an array (an element that appears more than `n/2` times).

**Code:**
```java
int majorityElement(int[] arr) {
    int candidate = arr[0]; // Initialize candidate for majority element
    int count = 1; // Counter for candidate frequency

    // Phase 1: Find a candidate
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] == candidate) count++; // Increment if same as candidate
        else if (--count == 0) { // Decrement if different, reset if count reaches zero
            candidate = arr[i];
            count = 1;
        }
    }
    return candidate;
}
```

**Input:**
```java
int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
```

**Output:**
```
4  // Majority element
```

---

### 5. Prefix Sum for Range Queries

The prefix sum technique allows efficient calculation of the sum of elements within a specific range.

**Example Problem**: Given a range `[L, R]`, find the sum of elements between `L` and `R` in the array.

**Code:**
```java
int[] prefixSum(int[] arr) {
    int[] prefix = new int[arr.length];
    prefix[0] = arr[0]; // Initialize first element of prefix array

    // Build prefix array
    for (int i = 1; i < arr.length; i++) {
        prefix[i] = prefix[i - 1] + arr[i]; // Each element is sum of all elements up to it
    }
    return prefix;
}

// Query function
int rangeSum(int[] prefix, int L, int R) {
    if (L == 0) return prefix[R]; // Sum from start if L is 0
    return prefix[R] - prefix[L - 1]; // Subtract prefix sum before L
}
```

**Input:**
```java
int[] arr = {1, 2, 3, 4, 5};
int[] prefix = prefixSum(arr);
int L = 1, R = 3;
```

**Output:**
```
9  // Sum of elements from index 1 to 3 ([2, 3, 4])
```

---

These tricks will help you solve common array-based problems more efficiently.
```

Each code block now includes comments to explain each line or major step within the code, making it easier to understand and follow.
