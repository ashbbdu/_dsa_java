# Running Sum of 1d Array — Easy
Problem Link: https://leetcode.com/problems/running-sum-of-1d-array/
Pattern Tag: array / prefix-sum

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
A bank statement where each row shows the cumulative total balance, not just that day's transaction.

## Core Insight
Prefix sum: `result[i] = sum of all elements from index 0 to i`. Maintain a running `sum` variable and build a result array.

## Approach
`sum = 0`. For each index: `arr[i] = sum + nums[i]`, then `sum += nums[i]`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Separate result array                │ Avoids mutating input                 │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Update sum after writing arr[i]      │ Current element must be included in   │
│                                      │ result[i] before sum is advanced      │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
sum = 0
arr = new int[n]

for i = 0 to n-1:
    arr[i] = sum + nums[i]
    sum = sum + nums[i]

return arr
```

## Complexity
- Time: O(n)
- Space: O(n) — result array

## Watch Out For
- Can also be done in-place: `nums[i] += nums[i-1]` starting from index 1

## Dry Run
```
nums = [1, 2, 3, 4]

i=0: arr[0]=0+1=1, sum=1
i=1: arr[1]=1+2=3, sum=3
i=2: arr[2]=3+3=6, sum=6
i=3: arr[3]=6+4=10, sum=10

return [1, 3, 6, 10] ✓
```

## Boilerplate Template
```java
public int[] runningSum(int[] nums) {
    int sum = 0;
    int[] arr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        arr[i] = sum + nums[i];
        sum += nums[i];
    }
    return arr;
}
```
