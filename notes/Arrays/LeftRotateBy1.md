# Left Rotate Array By 1 — Easy
Problem Link: (practice)
Pattern Tag: array / in-place / rotation

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
A queue where the first person leaves and rejoins at the back. Everyone shifts one spot forward, and the first person fills the last slot.

## Core Insight
Save the first element, shift every element one index to the left, then place the saved element at the last index.

## Approach
`firstEle = nums[0]`. Loop `i = 0` to `n-2`: `nums[i] = nums[i+1]`. Finally `nums[n-1] = firstEle`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Save first element before loop       │ It gets overwritten in the first step │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Loop stops at n-2                    │ Last slot is filled by saved element  │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
firstEle = nums[0]
for i = 0 to n-2:
    nums[i] = nums[i+1]
nums[n-1] = firstEle
```

## Complexity
- Time: O(n)
- Space: O(1) — in-place

## Watch Out For
- Loop bound is `n-2` (inclusive), not `n-1` — avoids out-of-bounds

## Dry Run
```
nums = [7, 6, 5, 4]
firstEle = 7
i=0: nums[0]=6
i=1: nums[1]=5
i=2: nums[2]=4
nums[3] = 7
Result: [6, 5, 4, 7] ✓
```

## Boilerplate Template
```java
public void rotateByOne(int[] nums) {
    int firstEle = nums[0];
    for (int i = 0; i < nums.length - 1; i++) {
        nums[i] = nums[i + 1];
    }
    nums[nums.length - 1] = firstEle;
}
```
