# Reverse String — Easy
Problem Link: https://leetcode.com/problems/reverse-string/
Pattern Tag: array / two-pointer / in-place

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Flipping a word on a card — hold both ends and swap the outermost characters, then move inward.

## Core Insight
Two pointers from both ends, swap and close in until they meet.

## Approach
`start = 0`, `end = n-1`. While `start < end`: swap `s[start]` and `s[end]`, `start++`, `end--`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ In-place swap                        │ O(1) space; problem requires in-place │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ stop when start >= end               │ Middle element of odd-length doesn't  │
│                                      │ need swapping                         │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
start = 0, end = n - 1
while start < end:
    swap(s[start], s[end])
    start++
    end--
```

## Complexity
- Time: O(n)
- Space: O(1)

## Watch Out For
- Input is a `char[]` not `String` (Strings are immutable in Java)

## Dry Run
```
s = ['h','e','l','l','o']

start=0,end=4: swap h,o → [o,e,l,l,h]
start=1,end=3: swap e,l → [o,l,l,e,h]
start=2,end=2: stop

Result: ['o','l','l','e','h'] ✓
```

## Boilerplate Template
```java
public void reverseString(char[] s) {
    int start = 0, end = s.length - 1;
    while (start < end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;
    }
}
```
