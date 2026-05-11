# Day 3 — HashMap + HashSet (Complete Guide)

**Date:** 2026-05-12
**Phase:** Phase 0 — Foundation

---

## Pehle samjho — Problem kya hai Array se?

```java
int[] arr = {10, 20, 30, 40, 50};

// Kya 30 hai array mein?
// Array mein dhundhne ke liye poora scan karna padega → O(N)
for (int x : arr) {
    if (x == 30) // found
}
```

> Array mein search O(N) hai. 10 crore elements mein dhundhna matlab 10 crore steps.
> **Kya O(1) mein search ho sakta hai? Haan — HashMap aur HashSet se.**

---

## PART 1 — HashMap

### Real-world analogy

Socho ek **dictionary** hai:
- Word (key) → Meaning (value)
- "apple" → "a fruit"
- "run" → "to move fast"

Word seedha lookup karo — poori dictionary scan nahi karni. Yahi HashMap karta hai.

```
Key        →    Value
"apple"    →    3
"banana"   →    5
"mango"    →    12
```

---

### Andar se kaise kaam karta hai? (Hashing)

Ye samajhna zaroori hai, warna interview mein puch lenge.

```
Step 1: key diya "apple"
Step 2: hash function run hoti hai → "apple".hashCode() → koi number, say 1234
Step 3: 1234 % buckets_size → bucket number nikalta hai, say bucket #4
Step 4: value us bucket mein store ho jaati hai

GET karte waqt:
Step 1: same key "apple" diya
Step 2: same hash → same bucket #4
Step 3: seedha wahan se value milti hai → O(1)
```

```
Buckets (array of linked lists):
[0] → empty
[1] → empty
[2] → ("banana", 5)
[3] → empty
[4] → ("apple", 3)
[5] → ("mango", 12)
```

> **Yahi reason hai ki HashMap O(1) mein kaam karta hai — seedha bucket pe jaata hai.**
> Worst case O(N) tab hota hai jab sab keys same bucket mein jaayein (hash collision) — but practically ye nahi hota.

---

### HashMap — Poori Syntax ek jagah

```java
import java.util.HashMap;
import java.util.Map;

// Create — andar type likhna zaroori hai (primitive nahi, wrapper class)
// int nahi → Integer  |  char nahi → Character  |  double nahi → Double
HashMap<String, Integer> map = new HashMap<>();

// ─────────────────────────────────────────
// 1. PUT — add karo ya update karo
// ─────────────────────────────────────────
map.put("apple", 3);
map.put("banana", 5);
map.put("apple", 10);   // key already thi → value overwrite hogi
// map = {apple=10, banana=5}

// ─────────────────────────────────────────
// 2. GET — value lo
// ─────────────────────────────────────────
int val = map.get("apple");         // 10

// DANGER: key nahi hai toh null milega → NullPointerException!
int val2 = map.get("mango");        // null → int mein assign kiya toh CRASH

// SAFE way — getOrDefault
int val3 = map.getOrDefault("mango", 0);  // key nahi hai toh 0 return karo
// ye DSA mein SABSE zyada use hota hai

// ─────────────────────────────────────────
// 3. CHECK
// ─────────────────────────────────────────
map.containsKey("apple");      // true  — key hai ya nahi
map.containsValue(5);          // true  — value hai ya nahi
map.isEmpty();                 // false — empty hai ya nahi

// ─────────────────────────────────────────
// 4. REMOVE
// ─────────────────────────────────────────
map.remove("banana");          // key se remove
// map = {apple=10}

// ─────────────────────────────────────────
// 5. SIZE
// ─────────────────────────────────────────
map.size();   // 1

// ─────────────────────────────────────────
// 6. TRAVERSE — 3 ways
// ─────────────────────────────────────────

// Way 1: Key + Value dono chahiye (most common)
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " → " + entry.getValue());
}

// Way 2: Sirf keys
for (String key : map.keySet()) {
    System.out.println(key);
}

// Way 3: Sirf values
for (int v : map.values()) {
    System.out.println(v);
}
```

---

### Sabse Important Pattern — Frequency Count

> DSA ke 70% HashMap problems mein ye pattern use hota hai.
> Isko raat ko uthao toh bhi likhna aana chahiye.

```java
// Problem: "aabbcca" mein har character kitni baar aaya?

String s = "aabbcca";
HashMap<Character, Integer> freq = new HashMap<>();

for (char c : s.toCharArray()) {
    freq.put(c, freq.getOrDefault(c, 0) + 1);
}
// {a=3, b=2, c=2}

// Line by line samjho:
// c = 'a' → freq.getOrDefault('a', 0) = 0 → 0+1=1 → put('a', 1)
// c = 'a' → freq.getOrDefault('a', 0) = 1 → 1+1=2 → put('a', 2)
// c = 'b' → freq.getOrDefault('b', 0) = 0 → 0+1=1 → put('b', 1)
// ... aur aage
```

---

### HashMap — Common Mistakes

```java
// MISTAKE 1: int use karna
HashMap<int, int> map = new HashMap<>();    // WRONG — compile error
HashMap<Integer, Integer> map = new HashMap<>();  // CORRECT

// MISTAKE 2: == se compare karna
if (map.get("apple") == 10) { }     // kabhi kabhi fail karta hai
if (map.get("apple").equals(10)) { } // CORRECT

// MISTAKE 3: get() bina check ke
int x = map.get("mango");           // NullPointerException if key nahi hai
int x = map.getOrDefault("mango", 0); // SAFE
```

---

## PART 2 — HashSet

### Real-world analogy

Socho ek **attendance register** hai — sirf naam likhte hain, koi marks nahi:
- Ek student ka naam ek baar hi likhega (duplicates automatically ignore)
- Kisi naam ko check karna O(1) mein hota hai

> HashMap = Key + Value dono chahiye
> HashSet = Sirf keys chahiye (values nahi)

Internally **HashSet = HashMap jahan value hamesha dummy object hai**

---

### HashSet — Poori Syntax ek jagah

```java
import java.util.HashSet;

HashSet<Integer> set = new HashSet<>();

// ─────────────────────────────────────────
// 1. ADD
// ─────────────────────────────────────────
set.add(10);
set.add(20);
set.add(30);
set.add(10);   // duplicate → silently ignore hoga, koi error nahi
// set = {10, 20, 30}

// ─────────────────────────────────────────
// 2. CONTAINS — O(1)
// ─────────────────────────────────────────
set.contains(20);   // true
set.contains(99);   // false

// ─────────────────────────────────────────
// 3. REMOVE
// ─────────────────────────────────────────
set.remove(20);
// set = {10, 30}

// ─────────────────────────────────────────
// 4. SIZE + EMPTY CHECK
// ─────────────────────────────────────────
set.size();      // 2
set.isEmpty();   // false

// ─────────────────────────────────────────
// 5. TRAVERSE
// ─────────────────────────────────────────
for (int x : set) {
    System.out.println(x);  // order guaranteed nahi hota
}
```

---

### HashSet — Common Pattern (Duplicate Check)

```java
// Kya array mein koi duplicate hai?
int[] arr = {1, 2, 3, 1, 5};

HashSet<Integer> seen = new HashSet<>();
for (int x : arr) {
    if (seen.contains(x)) {
        System.out.println("Duplicate found: " + x);
        return true;
    }
    seen.add(x);
}
return false;

// Kaise kaam karta hai:
// x=1 → seen={} → nahi hai → add → seen={1}
// x=2 → seen={1} → nahi hai → add → seen={1,2}
// x=3 → seen={1,2} → nahi hai → add → seen={1,2,3}
// x=1 → seen={1,2,3} → HAI! → return true
```

---

## PART 3 — Kab kya use karein?

```
Kya dhundhna hai?                         Kya use karein?
─────────────────────────────────────────────────────────
Koi cheez pehle aayi hai ya nahi?    →    HashSet
Duplicate hai ya nahi?               →    HashSet
Unique elements chahiye              →    HashSet
Har element ki count chahiye?        →    HashMap<Element, Integer>
Key se koi value map karni hai?      →    HashMap<Key, Value>
Index se fast access?                →    Array
```

---

## PART 4 — Time & Space Complexity

| Operation       | HashMap  | HashSet  | Array   |
|-----------------|----------|----------|---------|
| Add/Put         | O(1) avg | O(1) avg | O(1)    |
| Get/Contains    | O(1) avg | O(1) avg | O(N)    |
| Remove          | O(1) avg | O(1) avg | O(N)    |
| Traverse        | O(N)     | O(N)     | O(N)    |

> "avg" matlab average case. Interview mein poochha jaaye toh bolo:
> "Average O(1), worst case O(N) due to hash collisions — but in practice O(1)"

---

## Summary — Ek nazar mein

```
HashMap  → Key-Value store  → getOrDefault use karo → Frequency count pattern
HashSet  → Unique values    → contains use karo     → Duplicate check pattern
Array    → Index access     → O(N) search            → Fixed size data
```

---

## Self-Check Questions

- [ ] Bina notes dekhe frequency count pattern likh sakte ho?
- [ ] `getOrDefault` ka purpose kya hai?
- [ ] HashSet mein order kyun guaranteed nahi hota?
- [ ] HashMap ki key primitive kyun nahi ho sakti?
- [ ] Worst case O(N) kyun hota hai HashMap mein?
