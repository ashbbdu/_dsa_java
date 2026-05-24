# Find Missing Number — Easy
Problem Link: https://leetcode.com/problems/missing-number/
Pattern Tag: array / math / xor

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
You have a roll-call list of students numbered 0 to n but one is absent. Sum up all present numbers and compare to the expected total — the difference is who's missing.

## Core Insight
Expected sum of 0..n = n*(n+1)/2. Subtract the actual array sum. The difference is the missing number. O(n) time, O(1) space.

## Approach (current code is brute O(n²))
Brute: for each i in 0..n, scan array to check if i exists — O(n²).
Optimal (math): `expectedSum = n*(n+1)/2 - actualSum`.
Also works: XOR all indices 0..n with all values — missing one cancels out.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Sum formula over brute search        │ O(n) vs O(n²); no nested loop needed  │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ XOR alternative                      │ Avoids integer overflow for large n   │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
// Math approach
n = nums.length
expectedSum = n * (n + 1) / 2
actualSum = sum of all nums
return expectedSum - actualSum

// XOR approach
xor = 0
for i = 0 to n: xor ^= i
for num in nums: xor ^= num
return xor
```

## Complexity
- Time: O(n)
- Space: O(1)

## Watch Out For
- Integer overflow for very large n → use `long` or prefer XOR
- n = nums.length (array has n elements, range is 0..n)

## Dry Run
```
nums = [0, 1, 2, 4, 5, 6]   n=6

expectedSum = 6*7/2 = 21
actualSum   = 0+1+2+4+5+6 = 18
missing     = 21 - 18 = 3 ✓
```

## Boilerplate Template
```java
public int missingNumber(int[] nums) {
    int n = nums.length;
    int expected = n * (n + 1) / 2;
    int actual = 0;
    for (int num : nums) actual += num;
    return expected - actual;
}
```
