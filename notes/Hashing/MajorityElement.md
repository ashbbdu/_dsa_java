# Majority Element — Easy
Problem Link: https://leetcode.com/problems/majority-element/
Pattern Tag: hashing / boyer-moore / frequency

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
In an election where one candidate has more than half the votes, you can find the winner just by tallying. The candidate with count > n/2 will dominate any tally.

## Core Insight
HashMap frequency count works but Boyer-Moore Voting is optimal: O(1) space. One candidate + vote count — if count drops to 0, switch candidate. The majority element always survives.

## Approach
Current code: HashMap + find max value entry — but returns the max frequency, not the element. There's a bug: should return the key (element), not the value (count).

Optimal: Boyer-Moore — `candidate`, `count`. For each num: if `count == 0` set candidate; if num == candidate, `count++`, else `count--`. Return candidate.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Boyer-Moore over HashMap             │ O(1) space; guaranteed to work when   │
│                                      │ majority element exists (> n/2)       │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Guaranteed majority exists           │ Problem constraint: solution always   │
│                                      │ exists, so no validation needed       │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
// HashMap approach
map = frequency count
for (key, val) in map: if val > n/2 return key

// Boyer-Moore (optimal)
candidate = 0, count = 0
for num in nums:
    if count == 0: candidate = num
    if num == candidate: count++ else count--
return candidate
```

## Complexity
- HashMap: Time O(n), Space O(n)
- Boyer-Moore: Time O(n), Space O(1)

## Watch Out For
- Current code bug: returns `ans` (a count value) not the element — should return the key whose value > n/2
- Boyer-Moore only works when a majority element is guaranteed to exist

## Dry Run
```
nums = [3, 2, 3]

i=0: count=0 → candidate=3, count=1
i=1: 2 != 3  → count=0
i=2: count=0 → candidate=3, count=1

return 3 ✓
```

## Boilerplate Template
```java
// Boyer-Moore
public int majorityElement(int[] nums) {
    int candidate = 0, count = 0;
    for (int num : nums) {
        if (count == 0) candidate = num;
        count += (num == candidate) ? 1 : -1;
    }
    return candidate;
}
```
