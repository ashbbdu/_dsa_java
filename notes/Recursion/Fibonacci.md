# Fibonacci — Recursion
Problem Link: (practice)
Pattern Tag: recursion / overlapping-subproblems / memoization

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
Each step on a staircase requires knowing how many ways you could reach the two steps below it. The tree of calls mirrors the branching nature of the sequence.

## Core Insight
`fib(n) = fib(n-1) + fib(n-2)`. Two base cases: `fib(0) = 0`, `fib(1) = 1`. Pure recursion is O(2^n) — add memoization or use DP for O(n).

## Approach
Plain recursion (current) — exponential time due to repeated sub-calls.
Memoization: cache results → O(n) time, O(n) space.
Iterative DP: track only last two values → O(n) time, O(1) space.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Two base cases (n==0, n==1)          │ fib(0)=0 and fib(1)=1 are definitions │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Memoization to fix pure recursion    │ fib(n-2) is recomputed O(2^n) times   │
│                                      │ in naive version — cache kills this   │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
// Pure recursion
fib(n):
    if n == 0: return 0
    if n == 1: return 1
    return fib(n-1) + fib(n-2)

// Memoized
memo = int[n+1] filled with -1
fib(n):
    if n <= 1: return n
    if memo[n] != -1: return memo[n]
    memo[n] = fib(n-1) + fib(n-2)
    return memo[n]
```

## Complexity
- Pure recursion: Time O(2^n), Space O(n) stack
- Memoized: Time O(n), Space O(n)
- Iterative: Time O(n), Space O(1)

## Watch Out For
- Pure recursion TLEs for n > ~40
- Check both `n==0` AND `n==1` — missing either causes infinite recursion

## Dry Run
```
fib(5)
= fib(4) + fib(3)
= (fib(3)+fib(2)) + (fib(2)+fib(1))
= ((fib(2)+fib(1))+fib(2)) + (fib(2)+1)
...eventually = 5 ✓
```

## Boilerplate Template
```java
// Memoized
public int fib(int n) {
    int[] memo = new int[n + 2];
    Arrays.fill(memo, -1);
    return helper(n, memo);
}
private int helper(int n, int[] memo) {
    if (n <= 1) return n;
    if (memo[n] != -1) return memo[n];
    return memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
}
```
