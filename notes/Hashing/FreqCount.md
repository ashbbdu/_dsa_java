# Frequency Count — Fundamentals
Problem Link: (practice / pattern)
Pattern Tag: hashing / frequency / hashmap

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Counting how many times each letter appears in a passage — like a letter-frequency analysis used in cryptography.

## Core Insight
`getOrDefault(key, 0) + 1` is the idiomatic Java one-liner for safe frequency counting in a HashMap. It avoids a null-check branch.

## Approach
Iterate characters of string. For each char: `map.put(c, map.getOrDefault(c, 0) + 1)`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ getOrDefault(key, 0)                 │ Returns 0 for missing keys — avoids   │
│                                      │ NullPointerException on first seen    │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ toCharArray() for iteration          │ Cleaner than indexing; works for all  │
│                                      │ Unicode chars                         │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
map = HashMap<Character, Integer>
for c in s.toCharArray():
    map.put(c, map.getOrDefault(c, 0) + 1)
return map
```

## Complexity
- Time: O(n)
- Space: O(k) — k = distinct characters

## Watch Out For
- `map.merge(c, 1, Integer::sum)` is the modern idiomatic alternative
- For fixed alphabet (a-z), an `int[26]` array is faster than a HashMap

## Dry Run
```
s = "aabbcca"

a→1, a→2, b→1, b→2, c→1, c→2, a→3

result: {a=3, b=2, c=2} ✓
```

## Boilerplate Template
```java
public Map<Character, Integer> charFrequency(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    return map;
}
```
