# Remove Element — Easy
Problem Link: https://leetcode.com/problems/remove-element/
Pattern Tag: array / two-pointer / in-place

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Editing a list: you want to keep all entries that are NOT the forbidden value, compressing survivors to the front.

## Core Insight
Write pointer `k`: only advance when you encounter a value equal to `val` (the problem wants non-val elements counted, but current code keeps val). The clean optimal approach: advance `k` when `nums[i] != val`.

## Approach
Optimal: `k = 0`. For each `num`: if `num != val` → `nums[k++] = num`. Return `k`.

> Note: current code has a logic bug — it copies `nums[i]` when `nums[i] == val`, but the intent is to keep non-val elements.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Keep elements != val                 │ Problem asks to remove val occurrences │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Single write pointer k               │ Compresses valid elements to front    │
│                                      │ without extra space                   │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
k = 0
for num in nums:
    if num != val:
        nums[k] = num
        k++
return k
```

## Complexity
- Time: O(n)
- Space: O(1)

## Watch Out For
- Return k (count), not the array — judge only checks first k elements
- Elements after index k don't matter

## Dry Run
```
nums = [3, 2, 2, 3]   val = 3   k = 0

i=0: 3 == val → skip
i=1: 2 != val → nums[0]=2, k=1
i=2: 2 != val → nums[1]=2, k=2
i=3: 3 == val → skip

return 2  (nums = [2, 2, _, _]) ✓
```

## Boilerplate Template
```java
public int removeElement(int[] nums, int val) {
    int k = 0;
    for (int num : nums) {
        if (num != val) {
            nums[k++] = num;
        }
    }
    return k;
}
```
