# Move Zeroes — Easy
Problem Link: https://leetcode.com/problems/move-zeroes/
Pattern Tag: array / two-pointer / in-place

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Sorting a line of people where some are "placeholders" (zeros). You swap every real person (non-zero) to the front, letting placeholders drift to the back naturally.

## Core Insight
Two-pointer: `i` marks the position where the next non-zero should go. `j` scans forward. When `nums[j] != 0`, swap `nums[i]` and `nums[j]`, then `i++`. All zeros end up at the tail.

## Approach
Brute: count zeros, shift non-zeros forward, fill tail with zeros.
Optimal: `i = 0`. For `j = 1` to `n-1`: if `nums[j] != 0` → swap `nums[i]` with `nums[j]`, `i++`. Note: `i` starts at 0 and `j` starts at 1 (but can also start both at 0).

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Swap instead of shift                │ Avoids O(n²) shifting; zeros go back  │
│                                      │ automatically via swap                │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ i pointer only advances on non-zero  │ i always points to current zero slot  │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
i = 0
for j = 1 to n-1:
    if nums[j] != 0:
        swap(nums[i], nums[j])
        i++
```

## Complexity
- Time: O(n)
- Space: O(1) — in-place

## Watch Out For
- Relative order of non-zero elements must be preserved (swap does this)
- Zeros pushed back maintain their count correctly via swaps

## Dry Run
```
nums = [4, 0, 5, 0, 3]   i=0

j=1: nums[1]=0 → skip
j=2: nums[2]=5 → swap(nums[0],nums[2]) → [5,0,4,0,3], i=1
j=3: nums[3]=0 → skip
j=4: nums[4]=3 → swap(nums[1],nums[4]) → [5,3,4,0,0], i=2

Result: [5,3,4,0,0] ✓ (non-zeros preserved in order, zeros at end)
```

## Boilerplate Template
```java
public void moveZeroes(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != 0) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
        }
    }
}
```
