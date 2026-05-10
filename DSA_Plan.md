# DSA Study Plan — Beginner to FAANG SDE 2
# Timeline: 6 Months (Jan → Jun style)

> **Starting point:** DSA mein naya hoon
> **End goal:** SDE 2 level (FAANG ready)
> **Daily commitment:** 3–4 hours/day
> **Language:** Java

## Progress Legend
- [ ] Not started
- [~] In progress
- [x] Done

## Difficulty
`E` Easy | `M` Medium | `H` Hard

---

## HOW TO USE THIS PLAN

1. **Ek topic ek baar mein karo** — jump mat karo
2. **Har problem ke liye ye steps follow karo:**
   - Khud socho 20–30 min (bina solution dekhe)
   - Brute force likho pehle, phir optimize karo
   - Code karo, test karo
   - Editorial/video dekho — apne approach se compare karo
   - Agle din phir se likho bina dekhe (spaced repetition)
3. **Time complexity aur space complexity har problem pe likho**
4. **LeetCode pe submit karo** — accepted aaye tabhi done mark karo

---

## PHASE 0 — Foundation (Week 1–2)
> Ye sab karna mandatory hai pehle, warna baaki sab samajh nahi aayega

- [ ] Java basics — arrays, strings, ArrayList, HashMap, HashSet
- [ ] Time Complexity — O(1), O(n), O(n²), O(log n) kya hota hai
- [ ] Space Complexity basics
- [ ] Big O Notation — best, worst, average case
- [ ] Recursion kya hota hai — call stack samajhna
- [ ] Basic recursion problems:
  - [ ] Print 1 to N using recursion
  - [ ] Print N to 1 using recursion
  - [ ] Sum of 1 to N using recursion
  - [ ] Factorial using recursion
  - [ ] Fibonacci using recursion

**Phase 0 complete hone ke baad** — tujhe pata hoga ki O(n²) wala solution slow kyun hota hai aur recursion kaise kaam karta hai.

---

## PHASE 1 — Arrays (Week 3–5)
> Sabse important topic — iska base pakka karo

### Fundamentals (Week 3)
- [x] Basics — traverse, input, output
- [x] Left Rotate by 1 `E`
- [x] Max Consecutive 1s `E`
- [x] Second Largest Element `E`
- [~] Running Sum `E` ← in progress
- [ ] Left / Right Rotate by K places `M`
- [ ] Check if array is sorted `E`
- [ ] Find Union & Intersection of two sorted arrays `M`
- [ ] Linear Search `E`
- [ ] Find Missing Number `E`

### Logic Building (Week 3–4)
- [x] Move Zeros to End `E`
- [x] Remove Duplicates from Sorted Array `E`
- [ ] Single Number — XOR trick `E`
- [ ] Two Sum — HashMap approach `E`
- [ ] Best Time to Buy and Sell Stocks `E`
- [ ] Maximum Subarray — Kadane's Algorithm `M`
- [ ] Sort Colors — Dutch National Flag `M`
- [ ] Majority Element — Moore's Voting `M`

### Medium Problems (Week 4–5)
- [x] Build Array from Permutation `E`
- [x] Reverse String `E`
- [x] Remove Element `E`
- [x] Two Sum II (sorted) `M`
- [ ] Rearrange Array Elements by Sign `M`
- [ ] Leaders in an Array `M`
- [ ] Longest Consecutive Sequence `M`
- [ ] Next Permutation `M`
- [ ] Set Matrix Zeroes `M`
- [ ] Rotate Matrix 90° `M`
- [ ] Spiral Matrix `M`
- [ ] Pascal's Triangle `M`
- [ ] Maximum Product Subarray `M`
- [ ] 3 Sum `M`

### Hard Problems (Week 5)
- [x] Max SubArray (done earlier)
- [ ] Merge Overlapping Intervals `M`
- [ ] Merge Two Sorted Arrays Without Extra Space `H`
- [ ] Subarray with Given XOR `M`
- [ ] Count Inversions — Merge Sort based `H`
- [ ] Median of Two Sorted Arrays `H`

---

## PHASE 2 — Patterns (Week 6–8)
> Ye patterns samajh gaya toh 30% FAANG problems solve ho jaate hain

### Two Pointers (Week 6)
- [ ] Valid Palindrome `E`
- [ ] Container With Most Water `M`
- [ ] 3 Sum Closest `M`
- [ ] Remove Duplicates II `M`
- [ ] Trapping Rainwater `H`

### Sliding Window (Week 6–7)
- [ ] Maximum Average Subarray I `E`
- [ ] Longest Substring Without Repeating Characters `M`
- [ ] Longest Repeating Character Replacement `M`
- [ ] Permutation in String `M`
- [ ] Minimum Window Substring `H`
- [ ] Sliding Window Maximum `H`
- [ ] Count of Anagrams `M`

### Binary Search (Week 7–8)
> Binary search sirf sorted array mein nahi hota — ye ek pattern hai

#### Basics
- [ ] Binary Search on sorted array `E`
- [ ] Lower Bound / Upper Bound `E`
- [ ] Find First and Last Position `M`
- [ ] Floor & Ceil in sorted array `M`
- [ ] Search Insert Position `E`

#### On Rotated Arrays
- [ ] Search in Rotated Sorted Array I `M`
- [ ] Search in Rotated Sorted Array II `M`
- [ ] Find Minimum in Rotated Sorted Array `M`
- [ ] Find Peak Element `M`

#### Answer-Space Binary Search (the real FAANG magic)
- [ ] Square Root using BS `E`
- [ ] Koko Eating Bananas `M`
- [ ] Book Allocation Problem `M`
- [ ] Capacity to Ship Packages `M`
- [ ] Aggressive Cows `M`
- [ ] Painter's Partition `M`
- [ ] Kth Element of Two Sorted Arrays `H`
- [ ] Median in Row-wise Sorted Matrix `H`

---

## PHASE 3 — Strings & Bit Manipulation (Week 9)
> Short section — ek hafte mein nipta sakte ho

### Strings
- [ ] Reverse Words in a String `M`
- [ ] Largest Odd Number in a String `E`
- [ ] Longest Common Prefix `E`
- [ ] Valid Anagram `E`
- [ ] Isomorphic Strings `E`
- [ ] Longest Palindromic Substring `M`
- [ ] Count and Say `M`
- [ ] Minimum Window Substring `H`
- [ ] KMP Algorithm (pattern matching) `H` ← ek baar properly samajh lo

### Bit Manipulation
- [ ] AND, OR, XOR, Shifts — basics
- [ ] Check / Set / Toggle Kth bit `E`
- [ ] Count Set Bits `E`
- [ ] Power of Two `E`
- [ ] Single Number I `E`
- [ ] Single Number II (appears 3x) `M`
- [ ] Single Number III (two singles) `M`
- [ ] Generate all subsets using bits `M`
- [ ] Maximum XOR of Two Numbers `M`

---

## PHASE 4 — Linked List (Week 10–11)
> Pointers samajhna zaruri hai — drawing banao har problem mein

### Basics (Week 10)
- [ ] Singly LL — create, traverse, insert at head/tail/position
- [ ] Singly LL — delete from head/tail/position
- [ ] Doubly LL — create, insert, delete

### Standard Problems (Week 10–11)
- [ ] Reverse a Linked List — Iterative + Recursive `E`
- [ ] Middle of Linked List `E`
- [ ] Merge Two Sorted Lists `E`
- [ ] Remove Nth Node from End `M`
- [ ] Add Two Numbers `M`
- [ ] Palindrome Linked List `M`
- [ ] Odd Even Linked List `M`
- [ ] Intersection of Two Linked Lists `E`
- [ ] Detect Cycle — Floyd's Algorithm `M`
- [ ] Find Start of Cycle `M`
- [ ] Rotate a Linked List `M`
- [ ] Clone List with Random Pointer `M`
- [ ] Reverse Nodes in K-Group `H`
- [ ] Sort Linked List — Merge Sort `M`
- [ ] Merge K Sorted Lists `H`
- [ ] Flatten a Multilevel Linked List `M`

---

## PHASE 5 — Stack & Queue (Week 12)
- [ ] Stack using Array & LinkedList
- [ ] Queue using Array & LinkedList
- [ ] Implement Queue using two Stacks `M`
- [ ] Valid Parentheses `E`
- [ ] Next Greater Element I & II `M`
- [ ] Largest Rectangle in Histogram `H`
- [ ] Trapping Rainwater (stack approach) `H`
- [ ] Asteroid Collision `M`
- [ ] Celebrity Problem `M`
- [ ] Daily Temperatures `M`
- [ ] Decode String `M`
- [ ] Remove K Digits `M`
- [ ] LRU Cache `M`
- [ ] Min Stack `M`
- [ ] LFU Cache `H`

---

## PHASE 6 — Trees (Week 13–15)
> Trees + Graphs = highest weightage in FAANG

### Binary Tree (Week 13–14)
- [ ] Build tree, understand nodes and structure
- [ ] Inorder / Preorder / Postorder — Recursive `E`
- [ ] Inorder / Preorder / Postorder — Iterative `M`
- [ ] Level Order Traversal `M`
- [ ] Zigzag Level Order `M`
- [ ] Height of Binary Tree `E`
- [ ] Diameter of Binary Tree `M`
- [ ] Check Balanced Binary Tree `M`
- [ ] Symmetric Tree `E`
- [ ] Lowest Common Ancestor `M`
- [ ] Maximum Path Sum `H`
- [ ] Print all Root-to-Leaf Paths `M`
- [ ] Vertical Order Traversal `M`
- [ ] Boundary Traversal `M`
- [ ] Construct BT from Inorder + Preorder `M`
- [ ] Serialize and Deserialize Binary Tree `H`
- [ ] Flatten BT to Linked List `M`
- [ ] All Nodes at Distance K `M`
- [ ] Burn Tree from a Leaf `H`

### BST (Week 14)
- [ ] Insert, Delete, Search in BST `E`
- [ ] Floor and Ceil in BST `M`
- [ ] Kth Smallest / Largest in BST `M`
- [ ] Validate BST `M`
- [ ] Inorder Predecessor & Successor `M`
- [ ] Recover BST `H`
- [ ] Largest BST in Binary Tree `H`

### Heaps / Priority Queue (Week 15)
- [ ] Min Heap / Max Heap — understand internals `M`
- [ ] Kth Largest Element `M`
- [ ] Top K Frequent Elements `M`
- [ ] K Closest Points to Origin `M`
- [ ] Merge K Sorted Lists `H`
- [ ] Find Median from Data Stream `H`
- [ ] Task Scheduler `M`
- [ ] Reorganize String `M`

---

## PHASE 7 — Tries + Segment Tree (Week 16)
> SDE 2 level differentiator — log n range queries

### Tries
- [ ] Implement Trie (insert, search, startsWith) `M`
- [ ] Count of Strings with Given Prefix `M`
- [ ] Longest String with All Prefixes `M`
- [ ] Maximum XOR of Two Numbers in Array `M`
- [ ] Word Search II `H`

### Segment Tree & BIT
- [ ] Segment Tree — Range Sum Query + Point Update `H`
- [ ] Segment Tree — Range Minimum Query `H`
- [ ] Binary Indexed Tree (Fenwick Tree) — Prefix Sum `H`
- [ ] Range Sum Query Mutable (LeetCode 307) `M`
- [ ] Count of Smaller Numbers After Self `H`

---

## PHASE 8 — Recursion & Backtracking (Week 17–18)

- [ ] Subsets / Subsequences of String `M`
- [ ] Subset Sum I & II `M`
- [ ] Combination Sum I & II `M`
- [ ] Permutations I & II `M`
- [ ] Letter Combinations of Phone Number `M`
- [ ] Generate All Parentheses `M`
- [ ] Word Search `M`
- [ ] N-Queens `H`
- [ ] Sudoku Solver `H`
- [ ] Palindrome Partitioning `M`
- [ ] Word Break `M`
- [ ] Rat in a Maze `M`

---

## PHASE 9 — Graphs (Week 19–21)

### Basics (Week 19)
- [ ] Graph representations (Adjacency List/Matrix)
- [ ] BFS `M`
- [ ] DFS `M`
- [ ] Number of Islands `M`
- [ ] Connected Components `M`
- [ ] Bipartite Check `M`

### Cycle + Topological Sort (Week 19–20)
- [ ] Cycle in Undirected Graph `M`
- [ ] Cycle in Directed Graph `M`
- [ ] Topological Sort — DFS `M`
- [ ] Topological Sort — Kahn's BFS `M`
- [ ] Course Schedule I & II `M`
- [ ] Alien Dictionary `H`
- [ ] Find Eventual Safe States `M`

### Shortest Path (Week 20)
- [ ] Dijkstra's Algorithm `M`
- [ ] Bellman-Ford Algorithm `M`
- [ ] Floyd-Warshall `M`
- [ ] Network Delay Time `M`
- [ ] Path With Minimum Effort `M`

### Advanced Graph (Week 21)
- [ ] Disjoint Set Union (Union-Find) `M`
- [ ] Prim's Algorithm (MST) `M`
- [ ] Kruskal's Algorithm (MST) `M`
- [ ] Accounts Merge `M`
- [ ] Word Ladder I & II `H`
- [ ] Bridges in Graph — Tarjan's `H`
- [ ] Articulation Points `H`
- [ ] Strongly Connected Components — Kosaraju's `H`
- [ ] Clone Graph `M`

---

## PHASE 10 — Dynamic Programming (Week 22–24)
> Sabse tough phase. Alag alag patterns samajhna zaroori hai.

### DP Basics (Week 22)
- [ ] What is memoization vs tabulation vs space optimization
- [ ] Climbing Stairs `E`
- [ ] House Robber I & II `M`
- [ ] Frog Jump `M`
- [ ] Decode Ways `M`

### DP on Subsequences (Week 22–23)
- [ ] Subset Sum `M`
- [ ] Partition Equal Subset Sum `M`
- [ ] 0/1 Knapsack `M`
- [ ] Count Subsets with Given Sum `M`
- [ ] Coin Change I (min coins) `M`
- [ ] Coin Change II (number of ways) `M`
- [ ] Unbounded Knapsack `M`
- [ ] Rod Cutting `M`
- [ ] Target Sum `M`

### DP on Grids (Week 23)
- [ ] Unique Paths I & II `M`
- [ ] Minimum Path Sum `M`
- [ ] Triangle — Minimum Path `M`
- [ ] Minimum Falling Path Sum `M`
- [ ] Cherry Pickup II `H`

### DP on Strings (Week 23–24)
- [ ] Longest Common Subsequence `M`
- [ ] Longest Common Substring `M`
- [ ] Edit Distance `H`
- [ ] Longest Palindromic Subsequence `M`
- [ ] Shortest Common Supersequence `M`
- [ ] Wildcard Matching `H`
- [ ] Regular Expression Matching `H`

### DP on Stocks (Week 24)
- [ ] Buy & Sell Stock II `M`
- [ ] With Cooldown `M`
- [ ] With Transaction Fee `M`
- [ ] At Most 2 Transactions `H`
- [ ] At Most K Transactions `H`

### LIS + Advanced DP (Week 24)
- [ ] Longest Increasing Subsequence O(n²) `M`
- [ ] LIS O(n log n) — Binary Search approach `M`
- [ ] Largest Divisible Subset `M`
- [ ] Matrix Chain Multiplication `H`
- [ ] Burst Balloons `H`
- [ ] Palindrome Partitioning II `H`
- [ ] Bitmask DP `H`

---

## PHASE 11 — Greedy + Math (Week 25)

### Greedy
- [ ] Activity Selection / N Meetings in One Room `M`
- [ ] Minimum Platforms `M`
- [ ] Job Sequencing `M`
- [ ] Fractional Knapsack `M`
- [ ] Jump Game I & II `M`
- [ ] Insert Interval `M`
- [ ] Non-overlapping Intervals `M`
- [ ] Candy Distribution `H`

### Math & Number Theory
- [ ] GCD / LCM — Euclidean Algorithm `E`
- [ ] Sieve of Eratosthenes `M`
- [ ] Prime Factorization `M`
- [ ] Fast Exponentiation (Binary Exponentiation) `M`
- [ ] Modular Arithmetic `M`
- [ ] Count Primes (LeetCode 204) `M`

---

## PHASE 12 — System Design (Week 25–28)
> SDE 2 mein System Design bilkul aata hai — skip mat karna

### Concepts to Study
- [ ] How the Internet works (HTTP, DNS, TCP/IP)
- [ ] Client-Server Architecture
- [ ] SQL vs NoSQL — when to use which
- [ ] CAP Theorem
- [ ] ACID properties
- [ ] Indexing, Sharding, Replication
- [ ] Consistent Hashing
- [ ] CDN, Load Balancers
- [ ] Caching strategies (Redis, cache invalidation)
- [ ] Message Queues (Kafka basics)
- [ ] Rate Limiting
- [ ] Microservices vs Monolith

### Practice These Problems
- [ ] Design URL Shortener ← Start here (easiest)
- [ ] Design Twitter Feed
- [ ] Design WhatsApp (Chat System)
- [ ] Design YouTube (Video Streaming)
- [ ] Design Uber (Ride Sharing)
- [ ] Design Google Autocomplete
- [ ] Design Rate Limiter
- [ ] Design Notification System
- [ ] Design Distributed Cache

---

## Revision & Mock Interviews (Week 25–28, parallel)

- [ ] Solve 10 random Medium problems from LeetCode (revision mode)
- [ ] 2 Mock interviews per week on LeetCode / Pramp
- [ ] Redo all Hard problems you marked done earlier
- [ ] Behavioral questions prepare karo (STAR format)

---

## LeetCode Problem Targets (by month's end)

| Month | Cumulative Target | Focus |
|-------|-------------------|-------|
| Month 1 | 40 problems | Arrays, Two Pointers, Sliding Window |
| Month 2 | 90 problems | Binary Search, Strings, Bits, Linked List |
| Month 3 | 140 problems | Stack, Queue, Trees, BST, Heaps |
| Month 4 | 190 problems | Tries, Backtracking, Graphs |
| Month 5 | 250 problems | DP (most time here) |
| Month 6 | 300+ problems | Greedy, Math, Revision, Mocks |

> Difficulty split — 60% Medium, 20% Easy, 20% Hard

---

## 6-Month Week-by-Week Timeline

| Week | Topic |
|------|-------|
| 1–2 | Phase 0 — Java basics + Recursion + Complexity |
| 3–5 | Phase 1 — Arrays (all levels) |
| 6–8 | Phase 2 — Two Pointers, Sliding Window, Binary Search |
| 9 | Phase 3 — Strings + Bit Manipulation |
| 10–11 | Phase 4 — Linked List |
| 12 | Phase 5 — Stack & Queue |
| 13–15 | Phase 6 — Trees, BST, Heaps |
| 16 | Phase 7 — Tries + Segment Tree |
| 17–18 | Phase 8 — Recursion & Backtracking |
| 19–21 | Phase 9 — Graphs |
| 22–24 | Phase 10 — Dynamic Programming |
| 25 | Phase 11 — Greedy + Math |
| 25–28 | Phase 12 — System Design (parallel with revision) |

---

## Daily Routine

```
Morning  (1.5 hrs) : 1 concept study + implement from scratch in Java
Afternoon (1 hr)   : 2 LeetCode problems on current topic
Evening  (30 min)  : Review yesterday's problem — recode without help
Weekend            : 1 mock interview + 1 hard problem attempt
```

---

## Resources

| Resource | Use |
|----------|-----|
| Striver's A2Z (takeuforward.org) | Primary DSA guide — follow topic order |
| NeetCode 150 (neetcode.io) | Best curated FAANG problem list |
| LeetCode (leetcode.com) | Problem practice + contests |
| DDIA — Kleppmann (book) | System Design bible |
| ByteByteGo (bytebytego.com) | System Design visuals |
| Pramp / Interviewing.io | Free mock interviews |
| TLE Eliminators (YouTube) | Hindi explanation for DSA |

---

*Last updated: 2026-05-09*
*Current status: Phase 1 — Arrays (in progress)*
