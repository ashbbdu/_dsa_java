# Two Sum II - Input Array Is Sorted — Medium
Problem Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
Pattern Tag: array / two-pointer / sorted

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
You have a sorted list of prices. To find two items that total a budget, you check the cheapest and most expensive together. If the sum is too high, drop the expensive one. If too low, pick the next cheapest. Squeeze inward until you hit the target.

## Core Insight
Because the array is sorted, two pointers from both ends work: sum too big → move right pointer left; sum too small → move left pointer right.

## Approach
`start = 0`, `end = n-1`. While `start < end`: if `nums[start] + nums[end] == target` → record 1-indexed answer and break. If sum > target → `end--`. If sum < target → `start++`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Two pointers instead of nested loop  │ Brute O(n²) → TLE on this problem     │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Works because array is sorted        │ Sorted order lets us reason about     │
│                                      │ which pointer to move                 │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Return 1-indexed positions           │ Problem requirement                   │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
start = 0, end = n - 1

while start < end:
    sum = nums[start] + nums[end]
    if sum == target:
        return [start+1, end+1]
    else if sum > target:
        end--
    else:
        start++
```

## Complexity
- Time: O(n) — each pointer moves at most n steps total
- Space: O(1)

## Watch Out For
- Return 1-indexed answers (add 1 to both indices)
- Guaranteed exactly one solution per problem statement — safe to break on first match

## Dry Run
```
nums = [-10,-8,-2,1,2,5,6], target = 0

start=0(-10), end=6(6): sum=-4 → start++
start=1(-8),  end=6(6): sum=-2 → start++
start=2(-2),  end=6(6): sum=4  → end--
start=2(-2),  end=5(5): sum=3  → end--
start=2(-2),  end=4(2): sum=0  → match → [3, 5] ✓
```

## Boilerplate Template
```java
public int[] twoSum(int[] numbers, int target) {
    int start = 0, end = numbers.length - 1;
    while (start < end) {
        int sum = numbers[start] + numbers[end];
        if (sum == target) return new int[]{start + 1, end + 1};
        else if (sum > target) end--;
        else start++;
    }
    return new int[]{-1, -1};
}
```
