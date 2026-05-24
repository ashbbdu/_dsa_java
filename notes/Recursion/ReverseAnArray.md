# Reverse an Array — Recursion
Problem Link: (practice)
Pattern Tag: recursion / two-pointer / in-place

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Flipping a row of tiles by having two people at both ends swap their tiles, then step inward — stopping when they meet in the middle.

## Core Insight
Recursive two-pointer: swap `nums[start]` and `nums[end]`, then call `swap(nums, start+1, end-1)`. Base: `start > end → return`.

## Approach
Helper `swap(int[] nums, int start, int end)`. Each call handles one swap and reduces the range by 1 from each side.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Base: start > end                    │ Handles both odd (pointers cross) and │
│                                      │ even (pointers meet) length arrays    │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ In-place swap                        │ O(1) extra space (ignoring stack)     │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
reverseArray(nums):
    swap(nums, 0, nums.length - 1)

swap(nums, start, end):
    if start > end: return nums
    swap nums[start] and nums[end]
    return swap(nums, start + 1, end - 1)
```

## Complexity
- Time: O(n)
- Space: O(n/2) — call stack depth = n/2

## Watch Out For
- Base case `start > end` (not `>=`) — when start == end it's the middle element, no swap needed but that iteration can also be safely skipped with `>=`

## Dry Run
```
nums = [1, 2, 3, 4, 5]

swap(0,4): [5,2,3,4,1]
swap(1,3): [5,4,3,2,1]
swap(2,2): start==end → return

Result: [5,4,3,2,1] ✓
```

## Boilerplate Template
```java
public int[] reverseArray(int[] nums) {
    return swap(nums, 0, nums.length - 1);
}

private int[] swap(int[] nums, int start, int end) {
    if (start > end) return nums;
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
    return swap(nums, start + 1, end - 1);
}
```
