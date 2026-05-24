# Build Array from Permutation — Easy
Problem Link: https://leetcode.com/problems/build-array-from-permutation/
Pattern Tag: array / in-place / encoding

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
You have a set of lockers where each locker says "go look in locker X." You want to record what's in that locker — but if you start overwriting lockers, you'll lose the original values before you've read them all.

## Core Insight
Encode both old and new values in the same cell: `nums[i] = nums[i] + n * (nums[nums[i]] % n)`. The old value is recoverable as `nums[i] % n`, and the new value is `nums[i] / n`.

## Approach
Brute: extra array `arr[i] = nums[nums[i]]` → O(n) space.
Optimal: two-pass in-place encoding. Pass 1 encodes. Pass 2 decodes.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Encode: nums[i] + n * (target % n)   │ Packs new value in high bits, old     │
│                                      │ value preserved in low bits (% n)     │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Two passes                           │ Can't decode until all cells encoded  │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
// Pass 1: encode
for i = 0 to n-1:
    nums[i] = nums[i] + n * (nums[nums[i]] % n)

// Pass 2: decode
for i = 0 to n-1:
    nums[i] = nums[i] / n

return nums
```

## Complexity
- Time: O(n)
- Space: O(1) — in-place encoding

## Watch Out For
- `nums[nums[i]] % n` — must extract original value of `nums[nums[i]]` since it may already be encoded
- Values are in range [0, n-1] so `% n` correctly extracts the original

## Dry Run
```
nums = [0, 2, 1, 5, 3, 4]   n=6

Pass 1:
i=0: nums[0] = 0 + 6*(nums[0]%6) = 0 + 6*0 = 0
i=1: nums[1] = 2 + 6*(nums[2]%6) = 2 + 6*1 = 8
i=2: nums[2] = 1 + 6*(nums[1]%6) = 1 + 6*2 = 13  (nums[1]=8 → 8%6=2)
...

Pass 2: nums[i] = nums[i]/6 → gives the final permutation result ✓
```

## Boilerplate Template
```java
public int[] buildArray(int[] nums) {
    int n = nums.length;
    // encode
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] + n * (nums[nums[i]] % n);
    }
    // decode
    for (int i = 0; i < n; i++) {
        nums[i] = nums[i] / n;
    }
    return nums;
}
```
