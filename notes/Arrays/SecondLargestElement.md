# Second Largest Element — Easy
Problem Link: (practice / interview classic)
Pattern Tag: array / linear-scan / two-variable

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Watching students line up by height. You track the tallest seen so far, and whenever someone new takes that title, the old tallest becomes the new second-tallest candidate.

## Core Insight
One pass: when `nums[i] > largest`, push `largest` down to `secondLargest` before updating. Otherwise, if `nums[i] < largest && nums[i] > secondLargest`, update `secondLargest` directly.

## Approach
Brute: two passes — find largest first, then second largest excluding it.
Optimal: single pass tracking both variables simultaneously.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Push largest → secondLargest first   │ Must preserve old largest before      │
│ then update largest                  │ overwriting it                        │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ strict < largest check               │ Handles duplicates — same value as    │
│                                      │ largest should not count as second    │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Return -1 if secondLargest unchanged │ Array has < 2 distinct values         │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
largest = MIN_VALUE
secondLargest = MIN_VALUE

for num in nums:
    if num > largest:
        secondLargest = largest
        largest = num
    else if num < largest and num > secondLargest:
        secondLargest = num

return secondLargest == MIN_VALUE ? -1 : secondLargest
```

## Complexity
- Time: O(n) — single pass
- Space: O(1)

## Watch Out For
- Arrays with length < 2 → return -1 early
- Arrays with all identical elements → secondLargest stays `MIN_VALUE` → return -1

## Dry Run
```
nums = [1, 2, 3, 4, 5]

i=0: 1 > MIN → secondLargest=MIN, largest=1
i=1: 2 > 1   → secondLargest=1,   largest=2
i=2: 3 > 2   → secondLargest=2,   largest=3
i=3: 4 > 3   → secondLargest=3,   largest=4
i=4: 5 > 4   → secondLargest=4,   largest=5

return 4 ✓
```

## Boilerplate Template
```java
public int secondLargest(int[] nums) {
    if (nums.length < 2) return -1;
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int num : nums) {
        if (num > largest) {
            secondLargest = largest;
            largest = num;
        } else if (num < largest && num > secondLargest) {
            secondLargest = num;
        }
    }
    return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
}
```
