# Day 1 — Java Arrays + Time/Space Complexity

**Date:** 2026-05-10
**Phase:** Phase 0 — Foundation
**Status:** [ ] Not Started | [~] In Progress | [x] Done

---

## Concept 1 — Java Arrays

```java
// Declaration + Initialization
int[] arr = {3, 1, 4, 1, 5, 9};        // size automatic
int[] arr2 = new int[5];                 // size fixed, default = 0

// Traversal — for loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Enhanced for loop (read-only use karo)
for (int x : arr) {
    System.out.println(x);
}

// arr.length → O(1), koi loop nahi lagta
```

---

## Concept 2 — Time Complexity

> "Kitna time lagega input ke saath scale karne pe?"

| Complexity | Meaning                          | Example         |
|------------|----------------------------------|-----------------|
| O(1)       | Input size se koi fark nahi      | arr[0] access   |
| O(n)       | Input ke saath linearly badhta   | Array traverse  |
| O(n²)      | Nested loop — n × n operations   | Bubble Sort     |
| O(log n)   | Har step mein half ho jaata hai  | Binary Search   |

```java
// O(1) — ek step, seedha access
int first = arr[0];

// O(n) — ek loop, n steps
int sum = 0;
for (int x : arr) sum += x;

// O(n²) — nested loop
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // n × n = n² steps
    }
}
```

---

## Concept 3 — Space Complexity

> "Extra memory kitni use ho rahi hai?"

```java
// O(1) space — sirf ek variable, no extra array
int max = arr[0];
for (int x : arr) {
    if (x > max) max = x;
}

// O(n) space — extra array banaya
int[] copy = new int[arr.length];   // n size ka extra array
```

---

## Golden Rule

> Pehle brute force socho → time/space analyze karo → phir optimize karo

---

## Self-Check Questions

- [ ] Array declare karna aata hai bina errors ke?
- [ ] O(1) aur O(n) mein fark samajh aaya?
- [ ] Space complexity kab O(1) hoti hai?
