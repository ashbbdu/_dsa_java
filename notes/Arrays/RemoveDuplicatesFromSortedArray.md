# Remove Duplicates from Sorted Array — Easy
Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Pattern Tag: array / two-pointer / in-place

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
A sorted attendance sheet with repeat names. You rewrite the list in-place keeping only the first occurrence of each name, compressing it to the front.

## Core Insight
Two-pointer: `k` tracks where the next unique element should go. Scan with `i`; whenever `nums[i] != nums[k-1]`, write `nums[i]` at `nums[k]` and advance `k`.

## Approach
Current code uses a HashSet (O(n) space). Optimal two-pointer uses O(1) space: `k = 1`, iterate from index 1, copy when element differs from previous unique.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Two-pointer over HashSet             │ O(1) space; sorted array makes        │
│                                      │ duplicates contiguous, easy to detect │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Start k=1, i=1                       │ First element is always unique        │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
k = 1
for i = 1 to n-1:
    if nums[i] != nums[i-1]:
        nums[k] = nums[i]
        k++
return k
```

## Complexity
- Time: O(n)
- Space: O(1) — in-place two-pointer

## Watch Out For
- Works only because the array is sorted (duplicates are adjacent)
- Return value is k (count of unique elements), not the modified array

## Dry Run
```
nums = [-2, 2, 4, 4, 4, 5, 5]   k=1

i=1: 2 != -2  → nums[1]=2,  k=2
i=2: 4 != 2   → nums[2]=4,  k=3
i=3: 4 == 4   → skip
i=4: 4 == 4   → skip
i=5: 5 != 4   → nums[3]=5,  k=4
i=6: 5 == 5   → skip

return 4  (nums = [-2, 2, 4, 5, _, _, _]) ✓
```

## Boilerplate Template
```java
public int removeDuplicates(int[] nums) {
    int k = 1;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
}
```
