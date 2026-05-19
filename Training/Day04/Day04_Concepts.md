# Day 4 — Recursion (Basics to Intermediate)

**Date:** 2026-05-17
**Phase:** Phase 0 — Foundation
**Status:** [ ] Not Started | [~] In Progress | [x] Done

---

## Pehle samjho — Recursion kya hai?

Recursion matlab ek function jo **khud ko hi call karta hai** — jab tak ek condition meet na ho jaye.

```
Socho tum seedhi chadh rahe ho:
- Agar step 1 pe ho → ek aur step chadho → chadh ke dekhte hain → RECURSION
- Agar top pe pahunch gaye → ruk jao → BASE CASE
```

---

## PART 1 — Recursion ka Skeleton

```
Har recursive function mein teen cheezein ZAROORI hain:

1. BASE CASE     → ruko yahan, warna infinite loop
2. RECURSIVE CALL → chhota version solve karo
3. RETURN        → answer wapas pass karo
```

```java
public static void recursiveFunction(int n) {
    // Step 1: Base Case — kab rukna hai
    if (n == 0) return;

    // Step 2: Kuch kaam karo (before or after call)
    System.out.println(n);

    // Step 3: Recursive call — chhota problem solve karo
    recursiveFunction(n - 1);
}
```

> **Sab se common mistake:** Base case bhool jana → StackOverflowError aata hai
> ye same hai jaise infinite loop — function stack mein dalta jaata hai

---

## PART 2 — Call Stack samjho (ye interview mein puchha jaata hai)

```java
printDesc(3) called
│
├── print 3
│   └── printDesc(2) called
│       ├── print 2
│       │   └── printDesc(1) called
│       │       ├── print 1
│       │       │   └── printDesc(0) called
│       │       │       └── [BASE CASE — return]
│       │       └── [returns]
│       └── [returns]
└── [returns]
```

> Stack mein ek ke upar ek function frames badhte jaate hain.
> Base case milne ke baad ULTA order mein sabka kaam complete hota hai.
> Space complexity O(N) hoti hai — N depth ka stack banta hai.

---

## PART 3 — Print 1 to N (Ascending)

```java
// Approach 1: Print PEHLE, phir call (natural order)
public static void print1ToN(int n, int current) {
    if (current > n) return;       // base case
    System.out.println(current);   // pehle print karo
    print1ToN(n, current + 1);     // phir chhota call
}
// Call: print1ToN(5, 1)
// Output: 1 2 3 4 5
```

```java
// Approach 2: Call PEHLE, phir print (reverse trick)
public static void print1ToN_v2(int n) {
    if (n == 0) return;            // base case
    print1ToN_v2(n - 1);           // pehle baaki print ho jao
    System.out.println(n);         // phir apna print karo (wapas aate waqt)
}
// Call: print1ToN_v2(5)
// Output: 1 2 3 4 5
// YE CONCEPT BACKTRACKING KA BASE HAI — yaad rakh
```

---

## PART 4 — Print N to 1 (Descending)

```java
public static void printNTo1(int n) {
    if (n == 0) return;            // base case
    System.out.println(n);         // pehle apna print karo
    printNTo1(n - 1);              // phir chhota call
}
// Call: printNTo1(5)
// Output: 5 4 3 2 1
```

> Print before call = descending
> Print after call  = ascending
> Ye ek important mental model hai — internalize karo

---

## PART 5 — Factorial

```
5! = 5 × 4 × 3 × 2 × 1
   = 5 × (4!)
   = 5 × (4 × 3!)
   = 5 × (4 × (3 × 2!))
   ...
```

```java
public static int factorial(int n) {
    // Base case
    if (n == 0 || n == 1) return 1;

    // Recursive case: n! = n × (n-1)!
    return n * factorial(n - 1);
}

// factorial(4) kaise calculate hota hai:
// factorial(4)
//   = 4 * factorial(3)
//   = 4 * (3 * factorial(2))
//   = 4 * (3 * (2 * factorial(1)))
//   = 4 * (3 * (2 * 1))
//   = 4 * (3 * 2)
//   = 4 * 6
//   = 24

// Time:  O(N) — N baar call hota hai
// Space: O(N) — N depth ka call stack
```

---

## PART 6 — Fibonacci  ← LeetCode 509

```
Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21...
fib(n) = fib(n-1) + fib(n-2)
fib(0) = 0
fib(1) = 1
```

```java
public static int fibonacci(int n) {
    // Base cases — dono zaruri hain
    if (n == 0) return 0;
    if (n == 1) return 1;

    // Recursive case
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// fib(4) ka tree:
//           fib(4)
//          /       \
//       fib(3)    fib(2)
//       /    \    /    \
//    fib(2) fib(1) fib(1) fib(0)
//    /    \
// fib(1) fib(0)

// Time:  O(2^N) — exponential, bahut slow!
// Space: O(N)   — max depth N tak jaata hai
//
// IMPORTANT: Ye naive recursion hai — interview mein ye likhoge toh
// follow-up milega: "Can you optimize?" → DP / Memoization (Phase 10 mein)
```

---

## PART 7 — Sum of 1 to N

```java
public static int sumToN(int n) {
    if (n == 0) return 0;          // base case
    return n + sumToN(n - 1);      // n + sum of (n-1)
}

// sumToN(4):
// = 4 + sumToN(3)
// = 4 + (3 + sumToN(2))
// = 4 + (3 + (2 + sumToN(1)))
// = 4 + (3 + (2 + (1 + sumToN(0))))
// = 4 + 3 + 2 + 1 + 0 = 10

// Time: O(N)  Space: O(N)
// Note: Math formula O(1) se bhi ho sakta hai — n*(n+1)/2
// Recursion wala interview mein understanding check karta hai
```

---

## PART 8 — Power of a Number  ← LeetCode 50 (Pow(x, n))

```java
// Naive Recursion: O(N)
public static long powerNaive(int base, int exp) {
    if (exp == 0) return 1;        // base case: anything^0 = 1
    return base * powerNaive(base, exp - 1);
}

// Optimized — Fast Exponentiation: O(log N)
public static long powerFast(int base, int exp) {
    if (exp == 0) return 1;

    if (exp % 2 == 0) {
        // even exponent: base^exp = (base^(exp/2))^2
        long half = powerFast(base, exp / 2);
        return half * half;
    } else {
        // odd exponent: base^exp = base * base^(exp-1)
        return base * powerFast(base, exp - 1);
    }
}

// powerFast(2, 8):
// exp=8, even → half = powerFast(2, 4) → 16 → return 16*16 = 256
// powerFast(2, 4):
// exp=4, even → half = powerFast(2, 2) → 4 → return 4*4 = 16
// ...
// Time: O(log N)  Space: O(log N)
```

---

## PART 9 — Recursion ka Time & Space Complexity

```
Simple rule:

Time Complexity  = (number of recursive calls) × (work per call)
Space Complexity = max depth of call stack

Print 1 to N:
  Calls: N bari call hoti hai
  Work per call: O(1) (sirf print)
  Time: O(N) × O(1) = O(N)
  Space: O(N) — stack N deep

Fibonacci (naive):
  Calls: 2^N (tree dekhke samjho)
  Work per call: O(1)
  Time: O(2^N)
  Space: O(N) — max depth N

Fast Power:
  Calls: log(N) (exponent half hota hai har baar)
  Work per call: O(1)
  Time: O(log N)
  Space: O(log N)
```

---

## PART 10 — Common Mistakes

```java
// MISTAKE 1: Base case nahi likha
public static int bad(int n) {
    return n + bad(n - 1);   // StackOverflowError — kabhi nahi rukta
}

// MISTAKE 2: Base case wrong direction
public static int bad2(int n) {
    if (n == 100) return 0;  // agar n=5 se start kiya toh kabhi reach nahi
    return n + bad2(n + 1);  // n badhta ja raha hai, 100 pe ruke
}
// Yahan agar tum 5 se start karo toh 100 pe aake rukta hai — careful!

// MISTAKE 3: Return statement bhool gaye
public static int bad3(int n) {
    if (n == 0) return 0;
    n + bad3(n - 1);         // Compile error — return missing
}
```

---

## Mental Model — Recursion Kaise Socho

```
Problem milne pe teen sawal pucho:

1. SMALLER VERSION: Is problem ka ek chhota version kya hoga?
   → factorial(n) ka chhota = factorial(n-1)
   → sumToN(n) ka chhota = sumToN(n-1)

2. BASE CASE: Sabse chhota valid input kya hai?
   → factorial → n=0 ya n=1
   → fibonacci → n=0 ya n=1

3. COMBINE: Chhote answer se bada answer kaise banao?
   → factorial(n) = n * factorial(n-1)
   → sumToN(n) = n + sumToN(n-1)
```

---

## LeetCode Problems (aaj solve karo)

| # | Problem | LeetCode Link | Difficulty |
|---|---------|--------------|------------|
| LC 509  | Fibonacci Number | https://leetcode.com/problems/fibonacci-number/ | Easy |
| LC 50   | Pow(x, n) — Fast Exponentiation | https://leetcode.com/problems/powx-n/ | Medium |
| LC 344  | Reverse String (recursion se karo) | https://leetcode.com/problems/reverse-string/ | Easy |
| LC 9    | Palindrome Number | https://leetcode.com/problems/palindrome-number/ | Easy |
| LC 704  | Binary Search (Bonus Q15) | https://leetcode.com/problems/binary-search/ | Easy |

> Print 1-N, Factorial, Sum to N, Count Digits, Reverse Number — ye LeetCode pe seedhe
> available nahi hain (ye concept practice hain). Inhe practice file mein karo.

---

## Self-Check Questions

- [ ] Recursion mein base case kyun zaroori hai? Kya hoga agar nahi likha?
- [ ] Print 1-N aur Print N-1 mein sirf kya difference hai code mein?
- [ ] factorial(5) ka poora call stack draw karo?
- [ ] Fibonacci naive ka time O(2^N) kyun hai?
- [ ] "Print after call" pattern ka kya use hai? (Backtracking ke context mein socho)
- [ ] Space complexity O(N) kyun hoti hai recursion mein?
