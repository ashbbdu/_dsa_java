# Reverse a String — Recursion
Problem Link: (practice)
Pattern Tag: recursion / two-pointer / ArrayList

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Same as reversing an array — two people swap outermost characters and step inward until they meet.

## Core Insight
Identical pattern to ReverseAnArray but operating on `ArrayList<Character>`. Base: `start >= end`. Swap `s.get(start)` and `s.get(end)` using `s.set()`.

## Approach
Helper `swap(ArrayList<Character> s, int start, int end)`. Recurse with `start+1, end-1`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Base: start >= end                   │ Covers both even and odd lengths      │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ ArrayList.set() for swap             │ Strings are immutable in Java;        │
│                                      │ ArrayList allows index-based mutation  │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
reverseString(s):
    swap(s, 0, s.size() - 1)

swap(s, start, end):
    if start >= end: return s
    temp = s.get(start)
    s.set(start, s.get(end))
    s.set(end, temp)
    return swap(s, start + 1, end - 1)
```

## Complexity
- Time: O(n)
- Space: O(n/2) — call stack

## Watch Out For
- Use `>=` not `>` in base case here (both work but `>=` is cleaner — stops before no-op)
- For `char[]`, prefer array version over ArrayList

## Dry Run
```
s = ['h','e','l','l','o']

swap(0,4): ['o','e','l','l','h']
swap(1,3): ['o','l','l','e','h']
start=2 >= end=2 → return

Result: ['o','l','l','e','h'] ✓
```

## Boilerplate Template
```java
public ArrayList<Character> reverseString(ArrayList<Character> s) {
    return swap(s, 0, s.size() - 1);
}

private ArrayList<Character> swap(ArrayList<Character> s, int start, int end) {
    if (start >= end) return s;
    char temp = s.get(start);
    s.set(start, s.get(end));
    s.set(end, temp);
    return swap(s, start + 1, end - 1);
}
```
