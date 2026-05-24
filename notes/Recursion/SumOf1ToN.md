# Sum of 1 to N — Recursion
Problem Link: (practice)
Pattern Tag: recursion / accumulation / base-case

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Stacking coins: the total in a stack of n coins = n + (total in a stack of n-1 coins). Keep peeling one coin off the top until the stack is empty.

## Core Insight
`sum(n) = n + sum(n-1)`. Base case: `n == 0 → return 0`. Each call reduces n by 1 until it bottoms out.

## Approach
Direct recursion mirroring `n*(n+1)/2` formula, but as a recursive breakdown.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Base case n==0 returns 0             │ Sum of empty range is 0               │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Add AFTER recursive call             │ Current n contributes after sub-sum   │
│                                      │ is resolved                           │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
sum(n):
    if n == 0: return 0
    return n + sum(n - 1)
```

## Complexity
- Time: O(n)
- Space: O(n) — call stack

## Watch Out For
- Can also be solved in O(1) with `n*(n+1)/2` — recursion here is for practice
- Stack overflow for large n

## Dry Run
```
sum(5)
= 5 + sum(4)
= 5 + 4 + sum(3)
= 5 + 4 + 3 + sum(2)
= 5 + 4 + 3 + 2 + sum(1)
= 5 + 4 + 3 + 2 + 1 + sum(0)
= 5 + 4 + 3 + 2 + 1 + 0 = 15 ✓
```

## Boilerplate Template
```java
public int sum(int n) {
    if (n == 0) return 0;
    return n + sum(n - 1);
}
```
