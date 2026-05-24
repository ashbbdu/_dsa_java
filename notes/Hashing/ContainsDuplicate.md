# Contains Duplicate — Easy
Problem Link: https://leetcode.com/problems/contains-duplicate/
Pattern Tag: hashing / hashset / sorting

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Checking a guest list for repeated names. Once you spot a name you've already written down, you know there's a duplicate — no need to finish reading the list.

## Core Insight
HashSet: add each element; if it's already in the set, return true immediately (early exit). This beats HashMap frequency-counting because you don't need the count.

## Approach
Three approaches tried:
1. HashMap frequency count → O(n) time, O(n) space (but wasteful, counts all)
2. HashSet with early exit → O(n) time, O(n) space (optimal for time+space balance)
3. Sort + adjacent check → O(n log n) time, O(1) space (trade time for space)

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ HashSet over HashMap                 │ Only need presence, not frequency     │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Early return on contains()           │ Stops as soon as duplicate found      │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Sort alternative                     │ Duplicates become adjacent; O(1) space│
│                                      │ but O(n log n) time                   │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
// HashSet (optimal)
set = HashSet
for num in nums:
    if set.contains(num): return true
    set.add(num)
return false

// Sort alternative
sort(nums)
for i = 0 to n-2:
    if nums[i] == nums[i+1]: return true
return false
```

## Complexity
- HashSet: Time O(n), Space O(n)
- Sort: Time O(n log n), Space O(1)

## Watch Out For
- Check `contains` BEFORE `add` — otherwise you'd add then never find it again

## Dry Run
```
nums = [1, 2, 3, 4, 1]

add 1 → set={1}
add 2 → set={1,2}
add 3 → set={1,2,3}
add 4 → set={1,2,3,4}
check 1 → already in set → return true ✓
```

## Boilerplate Template
```java
public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for (int num : nums) {
        if (seen.contains(num)) return true;
        seen.add(num);
    }
    return false;
}
```
