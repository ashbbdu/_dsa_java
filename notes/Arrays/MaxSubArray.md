# Maximum Subarray — Medium
Problem Link: https://leetcode.com/problems/maximum-subarray/
Pattern Tag: array / kadane / dynamic-programming

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Tracking your best streak in a game. If your current streak goes negative, dump it — a fresh start from the next element will always be better.

## Core Insight
Kadane's Algorithm: maintain `currentSum`. At each element, either extend the current subarray or start fresh (`Math.max(nums[i], currentSum + nums[i])`). Track `maxSum` throughout.

## Approach
Brute (current code): nested loop O(n²) — also has a bug, returns 1 instead of max.
Optimal (Kadane's): single pass O(n).

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Reset currentSum when it goes < 0   │ Negative prefix only drags down future │
│                                      │ elements; start fresh                 │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Initialize maxSum = nums[0]          │ Handles all-negative arrays correctly │
│ (not MIN_VALUE)                      │                                       │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
currentSum = nums[0]
maxSum = nums[0]

for i = 1 to n-1:
    currentSum = max(nums[i], currentSum + nums[i])
    maxSum = max(maxSum, currentSum)

return maxSum
```

## Complexity
- Time: O(n)
- Space: O(1)

## Watch Out For
- Initialize both variables to `nums[0]`, not 0 or MIN_VALUE — handles all-negative input
- Brute O(n²) passes on small inputs but TLEs on large ones

## Dry Run
```
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

i=1: cur=max(1,-1)=1,      max=1
i=2: cur=max(-3,-2)=-2→-2, max=1   (fresh start fails, forced -2)
     Actually: cur=max(-3,1-3)=max(-3,-2)=-2, max=1
i=3: cur=max(4,-2+4)=max(4,2)=4,   max=4
i=4: cur=max(-1,4-1)=3,   max=4
i=5: cur=max(2,3+2)=5,    max=5
i=6: cur=max(1,5+1)=6,    max=6
i=7: cur=max(-5,6-5)=1,   max=6
i=8: cur=max(4,1+4)=5,    max=6

return 6 ✓
```

## Boilerplate Template
```java
public int maxSubArray(int[] nums) {
    int currentSum = nums[0];
    int maxSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
}
```
