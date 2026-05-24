# Check Sorted Array — Recursion
Problem Link: (practice)
Pattern Tag: recursion / array / comparison

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Walking along a row of numbered tiles, checking that each tile's number is no greater than the next. Stop if you find one that isn't.

## Core Insight
Compare adjacent elements recursively. Base: `start >= end → true` (past the last pair). If `nums[start] > nums[start+1] → false`. Else recurse with `start+1`.

## Approach
Brute (current): iterative O(n) loop.
Recursive: `check(nums, 0, 1)` — compare index `start` and `start+1`, advance start.

> Note: the current recursive implementation has a bug — it passes `start+1` for both arguments, losing track of the comparison window. Correct version below.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Compare start vs start+1             │ Only adjacent pair matters for sorted │
│                                      │ check; no need for end pointer        │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Base: start >= size-1                │ Checked all pairs → array is sorted   │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
isSorted(nums):
    return check(nums, 0)

check(nums, start):
    if start >= nums.size() - 1: return true
    if nums[start] > nums[start+1]: return false
    return check(nums, start + 1)
```

## Complexity
- Time: O(n)
- Space: O(n) — call stack

## Watch Out For
- Bug in current code: `check(nums, start+1, start+1)` passes same index for both params — should use single-index version
- Base: `start >= size-1` (not `size`) — last valid comparison is between `size-2` and `size-1`

## Dry Run
```
nums = [1, 2, 3, 4, 5]

check(0): 1 <= 2 → check(1)
check(1): 2 <= 3 → check(2)
check(2): 3 <= 4 → check(3)
check(3): 4 <= 5 → check(4)
check(4): 4 >= size-1(4) → return true ✓
```

## Boilerplate Template
```java
public boolean isSorted(ArrayList<Integer> nums) {
    return check(nums, 0);
}

private boolean check(ArrayList<Integer> nums, int start) {
    if (start >= nums.size() - 1) return true;
    if (nums.get(start) > nums.get(start + 1)) return false;
    return check(nums, start + 1);
}
```
