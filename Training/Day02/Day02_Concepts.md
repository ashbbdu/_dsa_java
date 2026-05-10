# Day 2 — Strings + ArrayList in Java

**Date:** 2026-05-10
**Phase:** Phase 0 — Foundation
**Status:** [ ] Not Started | [~] In Progress | [x] Done

---

## Concept 1 — Strings in Java

### Important Rule: String is IMMUTABLE
> Matlab ek baar bana, change nahi hota — har operation NEW string banata hai

```java
String s = "hello";

// Length
int len = s.length();           // 5   ← Note: String mein length() hai, array mein length

// Access a character
char c = s.charAt(0);           // 'h'

// Substring
String sub = s.substring(1, 4); // "ell"  (index 1 se 3 tak, 4 excluded)
String sub2 = s.substring(2);   // "llo"  (2 se end tak)

// Compare (KABHI == mat use karo strings ke liye)
String a = "abc";
String b = "abc";
System.out.println(a == b);         // kabhi kabhi true, kabhi false — unreliable!
System.out.println(a.equals(b));    // true — HAMESHA yahi use karo

// Convert
String upper = s.toUpperCase();     // "HELLO"
String lower = s.toLowerCase();     // "hello"

// Contains / IndexOf
boolean has = s.contains("ell");    // true
int idx = s.indexOf('l');           // 2 (pehla occurrence)

// Split
String csv = "a,b,c,d";
String[] parts = csv.split(",");    // ["a", "b", "c", "d"]

// Trim (spaces hatao)
String padded = "  hello  ";
String clean = padded.trim();       // "hello"

// Char to String
char ch = 'x';
String str = String.valueOf(ch);    // "x"

// String to char array
char[] chars = s.toCharArray();     // ['h','e','l','l','o']
```

---

## Concept 2 — StringBuilder (jab String modify karni ho)

> String immutable hai → loop mein `+=` use karo toh O(n²) ho jaata hai!
> StringBuilder use karo → O(n) rehta hai

```java
// BAD — O(n²) — har step mein naya string banta hai
String result = "";
for (int i = 0; i < 1000; i++) {
    result += "a";   // 1000 baar naya string bana!
}

// GOOD — O(n) — ek hi object modify hota rehta hai
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("a");
}
String result = sb.toString();

// Common StringBuilder methods
sb.append("hello");         // add at end
sb.insert(0, "world");      // add at index
sb.reverse();               // reverse in place — BAHUT useful!
sb.deleteCharAt(2);         // delete at index
sb.length();                // length
sb.charAt(0);               // access char
sb.toString();              // convert to String
```

---

## Concept 3 — ArrayList in Java

> Array ki size fixed hoti hai. ArrayList automatically grow hoti hai.

```java
import java.util.ArrayList;

// Create
ArrayList<Integer> list = new ArrayList<>();

// Add
list.add(10);
list.add(20);
list.add(30);           // [10, 20, 30]
list.add(1, 99);        // index 1 pe insert → [10, 99, 20, 30]

// Access
int val = list.get(0);  // 10

// Size
int sz = list.size();   // 4  ← Note: size() hai, length nahi

// Update
list.set(0, 55);        // index 0 ko 55 karo → [55, 99, 20, 30]

// Remove
list.remove(1);         // index 1 hatao → [55, 20, 30]
list.remove(Integer.valueOf(20));  // value 20 hatao (int ke liye Integer.valueOf use karo)

// Contains
boolean has = list.contains(30);    // true

// Traverse
for (int x : list) {
    System.out.println(x);
}

// Convert Array → ArrayList
Integer[] arr = {1, 2, 3};
ArrayList<Integer> fromArr = new ArrayList<>(Arrays.asList(arr));
```

---

## Comparison: Array vs ArrayList

| Feature        | Array         | ArrayList         |
|----------------|---------------|-------------------|
| Size           | Fixed         | Dynamic           |
| Syntax access  | arr[i]        | list.get(i)       |
| Length/Size    | arr.length    | list.size()       |
| Types          | int, char etc | Integer, String   |
| Performance    | Slightly faster | Slightly slower  |

> **Rule:** Jab size pata ho → Array. Jab size pata na ho → ArrayList.

---

## Golden Rules

1. String compare karne ke liye HAMESHA `.equals()` use karo
2. Loop mein String concatenation mat karo — StringBuilder use karo
3. ArrayList mein primitive types nahi jaate → `int` ki jagah `Integer`

---

## Self-Check Questions

- [ ] String aur StringBuilder mein fark pata hai?
- [ ] `==` aur `.equals()` mein kya fark hai?
- [ ] ArrayList mein `int` kyun nahi jaata?
- [ ] `arr.length` vs `list.size()` yaad hai?
