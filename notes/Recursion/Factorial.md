# Factorial — Recursion Basics
Problem Link: (practice)
Pattern Tag: recursion / base-case / tail-recursion

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
To know how many ways 5 people can stand in a line, you realize: it's just 5 × (ways 4 people can stand in a line). Each step defers to a smaller version of itself.

## Core Insight
`n! = n * (n-1)!`. Base case: `n == 0 || n == 1` → return 1. Every recursive call reduces `n` by 1, guaranteeing termination.

## Approach
Direct recursion. Return 1 at base, else `n * factorial(n-1)`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Base: n==0 AND n==1 return 1         │ 0! = 1 by math definition             │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Multiply AFTER recursive call        │ Wait for sub-problem answer, then     │
│                                      │ combine (top-down)                    │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
factorial(n):
    if n == 0 or n == 1: return 1
    return n * factorial(n - 1)
```

## Complexity
- Time: O(n) — n recursive calls
- Space: O(n) — call stack depth

## Watch Out For
- Stack overflow for very large n (Java default stack ~500-1000 frames)
- Negative input is undefined — add a guard if needed

## Dry Run
```
factorial(4)
= 4 * factorial(3)
= 4 * 3 * factorial(2)
= 4 * 3 * 2 * factorial(1)
= 4 * 3 * 2 * 1
= 24 ✓
```

## Boilerplate Template
```java
public int factorial(int n) {
    if (n == 0 || n == 1) return 1;
    return n * factorial(n - 1);
}
```
