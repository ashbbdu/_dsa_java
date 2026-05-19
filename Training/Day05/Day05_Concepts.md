# Day 5 — Time & Space Complexity (Deep Dive) + Arrays Revisit

**Date:** 2026-05-18
**Phase:** Phase 0 — Foundation → Phase 1 — Arrays (Bridge)

---

## Pehle samjho — Complexity kyun zaroori hai?

```
Ek problem solve ho gayi — great!
Ab interviewer poochha: "Is this optimal?"

Agar tujhe complexity nahi pata:
- Tujhe nahi pata tera code fast hai ya slow
- Tujhe nahi pata better solution exist karta hai ya nahi
- Tujhe nahi pata O(n²) se O(n) mein kya farak padta hai

10⁸ operations per second mein:
  O(n)   → n=10⁷: 0.1 second ✅
  O(n²)  → n=10⁴: 1 second   ✅ (barely)
  O(n²)  → n=10⁶: 10,000 seconds = 2.7 hours ❌
```

---

## PART 1 — Big O Notation Rules

### Rule 1: Constants ignore karo

```java
// Ye code 3n + 5 steps leta hai
for (int i = 0; i < n; i++) {     // n steps
    System.out.println(i);         // n steps
    System.out.println(i * 2);     // n steps
}
System.out.println("done");        // 1 step
System.out.println("ok");          // 1 step

// Total: 3n + 2
// Big O: O(n)  ← constant drop karo
```

### Rule 2: Lower order terms ignore karo

```java
// Steps: n² + n + 1
for (int i = 0; i < n; i++) {           // outer: n
    for (int j = 0; j < n; j++) {       // inner: n
        System.out.println(i + j);
    }
}
for (int i = 0; i < n; i++) {           // n
    System.out.println(i);
}
System.out.println("done");              // 1

// Total: n² + n + 1
// Big O: O(n²)  ← sirf dominant term rakhte hain
```

### Rule 3: Different variables alag rakhte hain

```java
// Alag sized arrays ke nested loops
int[] a = new int[n];
int[] b = new int[m];

for (int x : a) {
    for (int y : b) {
        System.out.println(x + y);
    }
}
// Time: O(n × m)  — NOT O(n²)
// Kyunki n aur m independent hain
```

---

## PART 2 — Common Complexities (Speed Order)

```
Fastest → Slowest:

O(1)         — Constant    — Array index access, HashMap get
O(log n)     — Logarithmic — Binary search, balanced BST
O(n)         — Linear      — Single loop, linear search
O(n log n)   — Linearithmic — Merge sort, Heap sort
O(n²)        — Quadratic   — Nested loops, bubble sort
O(2^n)       — Exponential — Fibonacci naive, subsets
O(n!)        — Factorial   — Permutations

With n = 1000:
  O(1)      = 1 operation
  O(log n)  ≈ 10 operations
  O(n)      = 1,000 operations
  O(n²)     = 1,000,000 operations
  O(2^n)    = 10^301 operations  (IMPOSSIBLE)
```

---

## PART 3 — Kaise Calculate Karein? (Step by Step)

```
RULE: Loops count karo

Single loop              → O(n)
Two nested loops         → O(n²)
Three nested loops       → O(n³)
Loop that halves n       → O(log n)
Loop × another loop      → multiply
Two separate loops       → add, then take dominant
```

### Examples

```java
// Example 1: O(n)
for (int i = 0; i < n; i++) {
    // constant work
}

// Example 2: O(n²)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // constant work
    }
}

// Example 3: O(n log n)
for (int i = 0; i < n; i++) {       // n
    int k = n;
    while (k > 1) {                  // log n
        k = k / 2;
    }
}

// Example 4: O(log n)
int k = n;
while (k > 1) {
    k = k / 2;    // k halves each time: n, n/2, n/4... → log₂(n) steps
}

// Example 5: O(n) — NOT O(n²) — inner loop starts from i, not 0
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {   // total pairs = n(n+1)/2 ≈ n²/2 → O(n²)
    }
}
// Technically still O(n²) — triangle pattern
```

---

## PART 4 — Space Complexity

```
Space = extra memory jo code use karta hai (input array count nahi hoti usually)

O(1)   → Fixed variables (int, boolean)
O(n)   → Array ya HashMap of size n
O(n²)  → 2D array of size n×n
O(log n) → Recursion depth of binary search
O(n)   → Recursion depth of linear recursion
```

```java
// Space O(1) — sirf variables
public static int sumArray(int[] arr) {
    int sum = 0;                    // 1 variable
    for (int x : arr) sum += x;
    return sum;
}

// Space O(n) — extra array
public static int[] doubled(int[] arr) {
    int[] result = new int[arr.length];  // n extra space
    for (int i = 0; i < arr.length; i++) result[i] = arr[i] * 2;
    return result;
}

// Space O(n) — HashMap of n entries
public static void frequency(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();  // n entries
    for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);
}
```

---

## PART 5 — Best / Average / Worst Case

```
Interview mein poochha jaaye: "What's the time complexity?"
Pehle pucho: "Which case — best, average, or worst?"

Example: Linear Search
  Array = {1, 2, 3, 4, 5},  target = 3

  Best case:   target = 1 (pehle index pe mila) → O(1)
  Average case: target kisi beech mein mila      → O(n/2) ≈ O(n)
  Worst case:  target = 5 ya nahi hai            → O(n)

Default mein interviewer worst case poochhta hai.
Jab tak kuch aur na pucha jaaye, worst case hi batao.
```

---

## PART 6 — Arrays Revisit (Pending Problems from Day 1-2)

Ye problems Phase 1 se bachi thi. Aaj inhe karte hain.

### Problem A — Check if Array is Sorted  ← LeetCode 896

```
Input:  {1, 2, 3, 4, 5}  → true
Input:  {1, 3, 2, 5, 4}  → false

Approach: Har adjacent pair check karo
  if arr[i] > arr[i+1] → not sorted
  If poora loop chal gaya → sorted

Time: O(n)   Space: O(1)
```

### Problem B — Find Missing Number in [0..N]  ← LeetCode 268

```
Array mein 0 to n tak ke numbers hain but ek missing hai.
Input:  {3, 0, 1}  → 2   (n=3, sum should be 6, actual sum=4, missing=2)

Approach 1: Sum formula
  Expected sum = n*(n+1)/2
  Actual sum   = array ka sum
  Missing = Expected - Actual

Time: O(n)   Space: O(1)

Approach 2: XOR trick
  XOR of 0..n XOR array elements = missing number
  (kyunki duplicate XOR cancel ho jaate hain)

Time: O(n)   Space: O(1)
```

### Problem C — Single Number (XOR Trick)  ← LeetCode 136

```
Array mein ek element sirf ek baar aata hai, baaki sab do baar.
Input:  {4, 1, 2, 1, 2}  → 4

XOR properties:
  a XOR a = 0   (same numbers cancel)
  a XOR 0 = a   (zero pe XOR = same number)

Approach: Saare elements XOR karo → pairs cancel → sirf single bachta
  4^1^2^1^2 = 4^(1^1)^(2^2) = 4^0^0 = 4

Time: O(n)   Space: O(1)
```

### Problem D — Rotate Array by K Places  ← LeetCode 189

```
Input:  arr = {1, 2, 3, 4, 5, 6, 7},  k = 3
Output: {5, 6, 7, 1, 2, 3, 4}

Approach: Reverse trick (O(1) space)
  Step 1: Reverse last k elements      → {1, 2, 3, 4, 7, 6, 5}
  Step 2: Reverse first (n-k) elements → {4, 3, 2, 1, 7, 6, 5}
  Step 3: Reverse whole array          → {5, 6, 7, 1, 2, 3, 4}

Time: O(n)   Space: O(1)
```

---

## PART 7 — Two Pointers (Intro — Phase 2 Preview)

> Ye Phase 2 ka pehla topic hai — aaj sirf concept, kal full practice.

```
Two pointers = do pointers ek saath chalaao
Mostly sorted arrays mein use hota hai.

Pattern 1: Left-Right (opposite ends se start)
  left = 0, right = n-1
  Dono middle ki taraf aate hain

Pattern 2: Slow-Fast (same side se start)
  slow = 0, fast = 0
  Fast tezi se bhaagta hai

Use cases:
  - Palindrome check            → LC 125
  - Two Sum in sorted array     → LC 167
  - Remove duplicates           → LC 26
  - Container with most water   → LC 11
  - Move zeros                  → LC 283
  - Trapping rainwater          → LC 42  (Phase 2 mein)
```

```java
// Two Pointers — Palindrome Check (O(n), O(1) space)
// LC 125: https://leetcode.com/problems/valid-palindrome/
public static boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
}

// Two Pointers — Two Sum in Sorted Array
// LC 167: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public static int[] twoSumSorted(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
        int sum = arr[left] + arr[right];
        if (sum == target) return new int[]{left, right};
        else if (sum < target) left++;   // sum chhota → left badhao
        else right--;                    // sum bada  → right ghatao
    }
    return new int[]{-1, -1};
}
```

---

## Summary — Aaj kya seekha

```
Big O Rules:
  1. Constants ignore karo
  2. Lower terms ignore karo
  3. Different variables alag rakhte hain

Space Complexity:
  O(1) → fixed variables / no extra data structure
  O(n) → HashMap / extra array / recursion depth

Arrays Pending:
  - Check sorted → single pass, adj comparison
  - Missing number → sum formula ya XOR
  - Single number → XOR trick (pairs cancel)
  - Rotate by K → reverse trick (3 reverses, O(n) time O(1) space)

Two Pointers (Preview):
  - Left-right pattern → palindrome, two sum sorted
  - Opposite ends → converge to center
```

---

## LeetCode Problems (aaj solve karo)

| # | Problem | LeetCode Number | Difficulty |
|---|---------|----------------|------------|
| 1 | Check if Array is Monotonic | LC 896 | Easy |
| 2 | Missing Number | LC 268 | Easy |
| 3 | Single Number | LC 136 | Easy |
| 4 | Rotate Array | LC 189 | Medium |
| 5 | Valid Palindrome | LC 125 | Easy |
| 6 | Two Sum II (sorted array) | LC 167 | Medium |
| 7 | Remove Duplicates from Sorted Array | LC 26 | Easy |
| 8 | Move Zeroes | LC 283 | Easy |
| 9 | Container With Most Water | LC 11 | Medium |

> LC 896 (Monotonic Array) slightly different hai — ascending ya descending dono check karta hai.
> Tum Q6 (Check if Sorted) solve karo first, phir LC 896 submit karo — same logic.

---

## Self-Check Questions

- [ ] O(n²) aur O(n log n) mein n=10⁶ ke saath practically kitna farak hota hai?
- [ ] Inner loop `j = i` se shuru kare toh TC kya hogi? Kyun?
- [ ] Missing number XOR approach kaise kaam karti hai — explain karo?
- [ ] Rotate by K: teen reverse steps kyun chahiye? Draw karo?
- [ ] Two Pointers: `left < right` kyun use kiya, `left <= right` kyun nahi?
