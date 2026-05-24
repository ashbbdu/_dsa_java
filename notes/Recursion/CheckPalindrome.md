# Check Palindrome — Recursion
Problem Link: (practice)
Pattern Tag: recursion / two-pointer / string

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Reading a word from both ends simultaneously. If the outermost letters always match, the word is a palindrome. Stop when the pointers cross.

## Core Insight
Recursive two-pointer on the string: compare `s.charAt(start)` and `s.charAt(end)`. If mismatch → false. If `start > end` → true (all checked). Else recurse inward.

## Approach
Helper `checkElems(String s, int start, int end)`. Base cases: length 1 always palindrome; mismatch → false; `start > end` → true. Recurse with `start+1, end-1`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Check mismatch BEFORE crossing check │ Short-circuit: if chars differ,       │
│                                      │ no need to go deeper                  │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ s.length()==1 as special base case   │ Single char is always palindrome      │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
palindromeCheck(s):
    return checkElems(s, 0, s.length - 1)

checkElems(s, start, end):
    if s.length == 1: return true
    if s[start] != s[end]: return false
    if start > end: return true
    return checkElems(s, start + 1, end - 1)
```

## Complexity
- Time: O(n/2) = O(n)
- Space: O(n/2) — call stack

## Watch Out For
- Order of base cases matters: check mismatch before crossing to avoid false positives
- Even-length strings: pointers will cross (`start > end`); odd-length: they'll meet (`start == end`)

## Dry Run
```
s = "racecar"

check(0,6): 'r'=='r' → check(1,5)
check(1,5): 'a'=='a' → check(2,4)
check(2,4): 'c'=='c' → check(3,3)
check(3,3): 'e', start==end < length → not mismatch → check(4,2)
check(4,2): start > end → return true ✓
```

## Boilerplate Template
```java
public boolean palindromeCheck(String s) {
    return checkElems(s, 0, s.length() - 1);
}

private boolean checkElems(String s, int start, int end) {
    if (s.length() == 1) return true;
    if (s.charAt(start) != s.charAt(end)) return false;
    if (start >= end) return true;
    return checkElems(s, start + 1, end - 1);
}
```
