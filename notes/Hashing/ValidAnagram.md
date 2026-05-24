# Valid Anagram — Easy
Problem Link: https://leetcode.com/problems/valid-anagram/
Pattern Tag: hashing / frequency-count / string

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Two bags of scrabble tiles. They're anagrams if each bag has exactly the same letters in the same quantities — just arranged differently.

## Core Insight
Use one HashMap: increment count for each char in `s`, decrement for each char in `t`. If all values are 0 at the end, they're anagrams.

## Approach
Approach 1: two HashMaps, compare with `.equals()`.
Approach 2 (optimal): one HashMap — increment on `s`, decrement on `t`. Check all values == 0. Also add early length check.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Length check first                   │ Different lengths can't be anagrams   │
│                                      │ — fast O(1) reject                    │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ One map: +1 for s, -1 for t          │ Saves space; net-zero means balanced  │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
if s.length != t.length: return false

map = HashMap
for c in s: map[c]++
for c in t: map[c]--

for count in map.values():
    if count != 0: return false

return true
```

## Complexity
- Time: O(n) — n = length of strings
- Space: O(1) — at most 26 distinct characters

## Watch Out For
- Early length check is important (avoids processing unequal strings)
- Works for lowercase English letters; for unicode, same logic works but map grows

## Dry Run
```
s="anagram", t="nagaram"

After s: {a:3, n:1, g:1, r:1, m:1}
After t: {a:3-3=0, n:1-1=0, g:1-1=0, r:1-1=0, m:1-1=0}
All zeros → true ✓
```

## Boilerplate Template
```java
public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) map.merge(c, 1, Integer::sum);
    for (char c : t.toCharArray()) map.merge(c, -1, Integer::sum);
    for (int count : map.values()) if (count != 0) return false;
    return true;
}
```
