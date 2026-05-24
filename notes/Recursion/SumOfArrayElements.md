# Sum of Array Elements — Recursion
Problem Link: (practice)
Pattern Tag: recursion / array / index-based

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Adding up a list of numbers by handing it to a helper who adds just the first number, then passes the rest of the list back to you recursively.

## Core Insight
Pass an index into the array. Base case: `left >= nums.length → return 0`. Recursive case: `nums[left] + sum(nums, left+1)`.

## Approach
Helper function `sum(int[] nums, int left)`. Increment index each call rather than modifying the array.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Pass index, not a subarray           │ Avoids O(n) array copy at each level  │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Base: left >= length (not ==)        │ Handles empty arrays and off-by-one   │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
arraySum(nums):
    return sum(nums, 0)

sum(nums, left):
    if left >= nums.length: return 0
    return nums[left] + sum(nums, left + 1)
```

## Complexity
- Time: O(n)
- Space: O(n) — call stack

## Watch Out For
- Base condition is `>=` not `==` to safely handle edge cases
- Public wrapper + private helper is the clean pattern for index-based recursion

## Dry Run
```
nums = [1, 2, 3]

sum(nums, 0) = 1 + sum(nums, 1)
             = 1 + 2 + sum(nums, 2)
             = 1 + 2 + 3 + sum(nums, 3)
             = 1 + 2 + 3 + 0 = 6 ✓
```

## Boilerplate Template
```java
public int arraySum(int[] nums) {
    return sum(nums, 0);
}

private int sum(int[] nums, int left) {
    if (left >= nums.length) return 0;
    return nums[left] + sum(nums, left + 1);
}
```
