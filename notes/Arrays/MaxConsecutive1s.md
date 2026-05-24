# Max Consecutive Ones — Easy
Problem Link: https://leetcode.com/problems/max-consecutive-ones/
Pattern Tag: array / linear-scan / counter

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Walking along a road of green and red lights. Count how many greens you see in a row before hitting a red. Reset the counter at each red, but keep track of your longest green streak.

## Core Insight
Maintain a running `count` that increments on 1 and resets to 0 on 0. Update `maxCount` on every increment.

## Approach
Single pass: `count++` on `nums[i] == 1` (update max), `count = 0` on `nums[i] == 0`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Update maxCount inside the if block  │ Only need to check max when count grew│
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Reset count to 0 on 0                │ Streak breaks completely at any 0     │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
count = 0, maxCount = 0

for num in nums:
    if num == 1:
        count++
        maxCount = max(count, maxCount)
    else:
        count = 0

return maxCount
```

## Complexity
- Time: O(n)
- Space: O(1)

## Watch Out For
- Array of all 0s → maxCount stays 0, which is correct
- Update maxCount inside the `if` block, not outside

## Dry Run
```
nums = [1, 1, 0, 0, 1, 1, 1, 0]

1→count=1,max=1 | 1→count=2,max=2 | 0→count=0 | 0→count=0
1→count=1,max=2 | 1→count=2,max=2 | 1→count=3,max=3 | 0→count=0

return 3 ✓
```

## Boilerplate Template
```java
public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0, maxCount = 0;
    for (int num : nums) {
        if (num == 1) {
            count++;
            maxCount = Math.max(count, maxCount);
        } else {
            count = 0;
        }
    }
    return maxCount;
}
```
