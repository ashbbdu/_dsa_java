import java.util.Arrays;

public class Day05_Practice {

    // ════════════════════════════════════════════════════════════
    // PART A — COMPLEXITY ANALYSIS (Write TC and SC in comments)
    // ════════════════════════════════════════════════════════════

    /*
     * Q1 — Analyze Time & Space Complexity
     * ─────────────────────────────────────
     * Look at the code below. Write TC and SC WITHOUT running it.
     *
     * Code:
     *   for (int i = 0; i < n; i++) { print(i); }
     *   for (int i = 0; i < n; i++) { print(i*2); }
     *
     * Think step by step:
     *   → How many times does each loop run?
     *   → Are the loops nested or sequential?
     *   → Sequential loops: ADD their complexities, then take dominant term
     *   → No extra data structures used → Space?
     *
     * Write your answer here:
     *   TC: O(____)
     *   SC: O(____)
     */
    public static void q1(int n) {
        for (int i = 0; i < n; i++) { System.out.println(i); }
        for (int i = 0; i < n; i++) { System.out.println(i * 2); }
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q2 — Analyze Time & Space Complexity
     * ─────────────────────────────────────
     * Code:
     *   for (int i = 0; i < n; i++) {
     *       for (int j = 0; j < n; j++) {
     *           print(i + j);
     *       }
     *   }
     *
     * Think step by step:
     *   → Outer loop runs n times
     *   → For EACH outer iteration, inner loop runs n times
     *   → Total work = n × n = ?
     *
     * Write your answer:
     *   TC: O(____)
     *   SC: O(____)
     */
    public static void q2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { System.out.println(i + j); }
        }
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q3 — Analyze Time & Space Complexity
     * ─────────────────────────────────────
     * Code:
     *   int k = n;
     *   while (k > 1) {
     *       print(k);
     *       k = k / 2;
     *   }
     *
     * Think step by step:
     *   → k starts at n, then n/2, then n/4, then n/8...
     *   → How many times can you halve n before it reaches 1?
     *   → Answer is log₂(n) — this is the definition of logarithm
     *   → Trace for n=8: k = 8 → 4 → 2 → 1 (stopped) = 3 steps = log₂(8)
     *
     * Write your answer:
     *   TC: O(____)
     *   SC: O(____)
     */
    public static void q3(int n) {
        int k = n;
        while (k > 1) { System.out.println(k); k = k / 2; }
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q4 — Analyze Time & Space Complexity
     * ─────────────────────────────────────
     * Code:
     *   for (int i = 0; i < n; i++) {       ← outer loop
     *       int k = n;
     *       while (k > 1) { k = k / 2; }    ← inner loop
     *   }
     *
     * Think step by step:
     *   → Outer loop: n times
     *   → Inner loop: runs independently for each outer iteration
     *   → Inner loop doesn't depend on i → it always runs log(n) times
     *   → Nested loops multiply: n × log(n) = ?
     *
     * Write your answer:
     *   TC: O(____)
     *   SC: O(____)
     */
    public static void q4(int n) {
        for (int i = 0; i < n; i++) {
            int k = n;
            while (k > 1) { k = k / 2; }
        }
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q5 — Analyze Time & Space Complexity
     * ─────────────────────────────────────
     * Code: (this is fibonacci recursion from Day 4)
     *   int fib(int n) {
     *       if (n <= 1) return n;
     *       return fib(n-1) + fib(n-2);
     *   }
     *
     * Think step by step:
     *   → Draw the recursion tree for n=4
     *   → Each node branches into 2 calls
     *   → Total nodes in a binary tree of depth n = 2^n
     *   → Max depth of the tree = n → stack goes n levels deep
     *
     * Write your answer:
     *   TC: O(____)
     *   SC: O(____) ← space used by call stack, not tree nodes
     */
    public static int q5(int n) {
        if (n <= 1) return n;
        return q5(n - 1) + q5(n - 2);
    }

    // ════════════════════════════════════════════════════════════
    // PART B — ARRAYS (Pending from Phase 1)
    // ════════════════════════════════════════════════════════════

    /*
     * Q6 — Check if Array is Sorted   ★ LeetCode 896
     * ─────────────────────────────────────────────────
     * Problem: Return true if arr is sorted in NON-DECREASING order
     *          (equal adjacent elements are allowed).
     *
     * Example:
     *   Input:  {1, 2, 3, 4, 5}  → true
     *   Input:  {1, 2, 2, 4, 5}  → true   (equal is fine)
     *   Input:  {1, 3, 2, 5, 4}  → false
     *
     * Intuition:
     *   You don't need to look at all pairs at once.
     *   Just check each adjacent pair (arr[i], arr[i+1]).
     *   If ANY pair is out of order (arr[i] > arr[i+1]) → not sorted, stop.
     *   If you finish the whole loop without finding a violation → sorted.
     *
     * Dry Run ({1, 3, 2, 5}):
     *   i=0: arr[0]=1, arr[1]=3 → 1 <= 3 ✓ continue
     *   i=1: arr[1]=3, arr[2]=2 → 3 > 2  ✗ return false immediately
     *
     * Dry Run ({1, 2, 3}):
     *   i=0: 1 <= 2 ✓
     *   i=1: 2 <= 3 ✓
     *   Loop ended without violation → return true
     *
     * Edge Cases:
     *   arr.length == 0 → true (empty array is trivially sorted)
     *   arr.length == 1 → true (single element is always sorted)
     *
     * Test Cases:
     *   {1, 2, 3, 4, 5}  → true
     *   {1, 2, 2, 4, 5}  → true
     *   {1, 3, 2, 5, 4}  → false
     *   {5, 4, 3, 2, 1}  → false
     *   {}               → true
     *
     * Time: O(N)   Space: O(1)
     */
    public static boolean isSorted(int[] arr) {
        return false; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q7 — Missing Number   ★ LeetCode 268
     * ──────────────────────────────────────
     * Problem: Array contains n distinct numbers from 0 to n (one is missing).
     * Find the missing number.
     *
     * Example:
     *   Input:  {3, 0, 1}    → 2   (n=3, range is 0..3, missing is 2)
     *   Input:  {0, 1}       → 2   (n=2, range is 0..2, missing is 2)
     *   Input:  {9,6,4,2,3,5,7,0,1} → 8
     *
     * Intuition:
     *   If no number was missing, sum of 0..n = n*(n+1)/2 (math formula).
     *   Actual sum of the array = sum of numbers present.
     *   The DIFFERENCE is the missing number.
     *
     *   missing = expectedSum - actualSum
     *           = n*(n+1)/2   - sum(arr)
     *
     * Dry Run ({3, 0, 1}):
     *   n = 3  (array length)
     *   expected = 3*4/2 = 6
     *   actual   = 3 + 0 + 1 = 4
     *   missing  = 6 - 4 = 2  ✓
     *
     * Dry Run ({9,6,4,2,3,5,7,0,1}):
     *   n = 9
     *   expected = 9*10/2 = 45
     *   actual   = 9+6+4+2+3+5+7+0+1 = 37
     *   missing  = 45 - 37 = 8  ✓
     *
     * Edge Cases:
     *   {0} → 1   (n=1, expected=1, actual=0, missing=1)
     *   {1} → 0   (n=1, expected=1, actual=1, missing=0)
     *
     * Test Cases:
     *   {3, 0, 1}            → 2
     *   {0, 1}               → 2
     *   {9,6,4,2,3,5,7,0,1} → 8
     *   {0}                  → 1
     *   {1}                  → 0
     *
     * Time: O(N)   Space: O(1)
     */
    public static int missingNumber(int[] arr) {
        return -1; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q8 — Single Number   ★ LeetCode 136
     * ──────────────────────────────────────
     * Problem: Every element appears TWICE except one. Find the single element.
     * Must solve in O(N) time and O(1) space (no HashMap allowed).
     *
     * Example:
     *   Input:  {4, 1, 2, 1, 2}  → 4
     *   Input:  {2, 2, 1}        → 1
     *
     * Intuition — XOR properties:
     *   Property 1: a ^ a = 0   (same number XOR with itself = 0)
     *   Property 2: a ^ 0 = a   (XOR with 0 gives back the number)
     *   Property 3: XOR is commutative and associative (order doesn't matter)
     *
     *   So: 4^1^2^1^2
     *     = 4 ^ (1^1) ^ (2^2)   ← regroup pairs
     *     = 4 ^ 0 ^ 0            ← pairs cancel to 0
     *     = 4  ✓
     *
     * Dry Run ({4, 1, 2, 1, 2}):
     *   result = 0
     *   result = 0^4 = 4
     *   result = 4^1 = 5
     *   result = 5^2 = 7
     *   result = 7^1 = 6
     *   result = 6^2 = 4  ✓
     *
     * Why O(1) space: Just one integer variable — no extra array or map needed.
     *
     * Test Cases:
     *   {4, 1, 2, 1, 2}  → 4
     *   {2, 2, 1}        → 1
     *   {1}              → 1
     *   {0, 1, 0}        → 1
     *
     * Time: O(N)   Space: O(1)
     */
    public static int singleNumber(int[] arr) {
        return 0; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q9 — Rotate Array (Right Rotation)   ★ LeetCode 189
     * ──────────────────────────────────────────────────────
     * Problem: Rotate arr to the right by k steps IN-PLACE.
     *
     * Example:
     *   Input:  arr = {1, 2, 3, 4, 5, 6, 7},  k = 3
     *   Output: {5, 6, 7, 1, 2, 3, 4}
     *
     * What does right rotation mean?
     *   Each element moves k positions to the RIGHT.
     *   Elements that fall off the end wrap around to the front.
     *   k=1: {7, 1, 2, 3, 4, 5, 6}
     *   k=3: {5, 6, 7, 1, 2, 3, 4}
     *
     * Intuition — Three-Reverse Trick (O(1) space):
     *   Observation: last k elements become the new front.
     *   Key insight: reversing helps us move things to the right position cheaply.
     *
     *   Step 1: Reverse the LAST k elements
     *     {1, 2, 3, 4, 5, 6, 7} → {1, 2, 3, 4, | 7, 6, 5}
     *
     *   Step 2: Reverse the FIRST (n-k) elements
     *     {1, 2, 3, 4, | 7, 6, 5} → {4, 3, 2, 1, | 7, 6, 5}
     *
     *   Step 3: Reverse the ENTIRE array
     *     {4, 3, 2, 1, 7, 6, 5} → {5, 6, 7, 1, 2, 3, 4}  ✓
     *
     * Important edge case:
     *   k can be larger than n — e.g., k=10, n=7
     *   Rotating by n = same as original → effective rotation = k % n
     *   Always do: k = k % arr.length FIRST
     *
     * Dry Run ({1,2,3,4,5,6,7}, k=3, n=7):
     *   k = 3 % 7 = 3
     *   Step 1: reverse(arr, 4, 6) → {1,2,3,4,7,6,5}
     *   Step 2: reverse(arr, 0, 3) → {4,3,2,1,7,6,5}
     *   Step 3: reverse(arr, 0, 6) → {5,6,7,1,2,3,4}  ✓
     *
     * Test Cases:
     *   {1,2,3,4,5,6,7}, k=3 → {5,6,7,1,2,3,4}
     *   {1,2},            k=1 → {2,1}
     *   {1,2,3},          k=4 → {3,1,2}  (k=4%3=1, rotate once)
     *
     * Time: O(N)   Space: O(1)
     */
    public static void rotate(int[] arr, int k) {
        // write your solution here
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q10 — Left Rotate by K Places
     * ────────────────────────────────
     * Problem: Rotate arr to the LEFT by k steps IN-PLACE.
     *
     * Example:
     *   Input:  arr = {1, 2, 3, 4, 5},  k = 2
     *   Output: {3, 4, 5, 1, 2}
     *
     * What does left rotation mean?
     *   Each element moves k positions to the LEFT.
     *   k=1: {2, 3, 4, 5, 1}
     *   k=2: {3, 4, 5, 1, 2}
     *
     * Intuition — Three-Reverse Trick (mirror of right rotation):
     *   Left rotation by k = same as right rotation by (n-k)
     *   OR use the same 3-reverse trick with different order:
     *
     *   Step 1: Reverse the FIRST k elements
     *     {1, 2, 3, 4, 5} → {2, 1, | 3, 4, 5}
     *
     *   Step 2: Reverse the LAST (n-k) elements
     *     {2, 1, | 3, 4, 5} → {2, 1, | 5, 4, 3}
     *
     *   Step 3: Reverse the ENTIRE array
     *     {2, 1, 5, 4, 3} → {3, 4, 5, 1, 2}  ✓
     *
     * Test Cases:
     *   {1,2,3,4,5}, k=2  → {3,4,5,1,2}
     *   {1,2,3,4,5}, k=1  → {2,3,4,5,1}
     *   {1,2,3},     k=3  → {1,2,3}  (full rotation = original)
     *
     * Time: O(N)   Space: O(1)
     */
    public static void leftRotate(int[] arr, int k) {
        // write your solution here
    }

    // ════════════════════════════════════════════════════════════
    // PART C — TWO POINTERS
    // ════════════════════════════════════════════════════════════

    /*
     * Q11 — Valid Palindrome   ★ LeetCode 125
     * ─────────────────────────────────────────
     * Problem: A phrase is a palindrome if, after converting all uppercase to
     * lowercase and removing non-alphanumeric characters, it reads the same
     * forward and backward. Return true/false.
     *
     * Example:
     *   Input:  "A man, a plan, a canal: Panama"  → true
     *            cleaned: "amanaplanacanalpanama"   → palindrome
     *   Input:  "race a car"                       → false
     *            cleaned: "raceacar"               → not palindrome
     *   Input:  " "                                → true
     *            cleaned: ""                       → empty = palindrome
     *
     * Intuition — Two Pointers:
     *   left starts at 0, right starts at end.
     *   Skip non-alphanumeric characters (punctuation, spaces).
     *   Compare lowercase versions of left and right chars.
     *   If they don't match → false.
     *   Move both inward. Repeat until left >= right.
     *
     * Key Java methods:
     *   Character.isLetterOrDigit(c)  → skip spaces/punctuation
     *   Character.toLowerCase(c)      → ignore case
     *
     * Dry Run ("A man, a plan, a canal: Panama"):
     *   left=0 ('A'), right=last ('a') → toLowerCase: 'a'=='a' ✓ → move inward
     *   left=1 (' ') → skip, left=2 ('m')
     *   right moves past 'm','a','n','a','P' to next valid...
     *   Continue until left >= right → all matched → true
     *
     * Test Cases:
     *   "A man, a plan, a canal: Panama" → true
     *   "race a car"                     → false
     *   " "                              → true
     *   "0P"                             → false
     *
     * Time: O(N)   Space: O(1)
     */
    public static boolean isPalindrome(String s) {
        return false; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q12 — Two Sum II (Sorted Array)   ★ LeetCode 167
     * ──────────────────────────────────────────────────
     * Problem: Given a 1-indexed sorted array, find two numbers that add up
     * to target. Return their 1-indexed positions. Exactly one solution exists.
     * Must use O(1) extra space.
     *
     * Example:
     *   Input:  {2, 7, 11, 15},  target = 9   → [1, 2]
     *   Input:  {2, 3, 4},       target = 6   → [1, 3]
     *   Input:  {-1, 0},         target = -1  → [1, 2]
     *
     * Intuition — Two Pointers (works because array is SORTED):
     *   left = 0, right = n-1
     *   sum = arr[left] + arr[right]
     *
     *   If sum == target → found! Return [left+1, right+1] (1-indexed)
     *   If sum < target  → need a larger sum → move LEFT pointer right (bigger number)
     *   If sum > target  → need a smaller sum → move RIGHT pointer left (smaller number)
     *
     * Why does this work?
     *   Array is sorted → arr[left] is smallest available, arr[right] is largest.
     *   If sum too small, only way to increase is take a larger left value.
     *   If sum too big, only way to decrease is take a smaller right value.
     *
     * Dry Run ({2, 7, 11, 15}, target=9):
     *   left=0(2), right=3(15): sum=17 > 9 → right--
     *   left=0(2), right=2(11): sum=13 > 9 → right--
     *   left=0(2), right=1(7):  sum=9 == 9 → return [1, 2]  ✓
     *
     * Test Cases:
     *   {2,7,11,15},  target=9   → [1, 2]
     *   {2,3,4},      target=6   → [1, 3]
     *   {-1,0},       target=-1  → [1, 2]
     *
     * Time: O(N)   Space: O(1)
     */
    public static int[] twoSumSorted(int[] arr, int target) {
        return new int[]{}; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q13 — Remove Duplicates from Sorted Array   ★ LeetCode 26
     * ──────────────────────────────────────────────────────────
     * Problem: Remove duplicates IN-PLACE from a sorted array.
     * Return the count of unique elements. Order of unique elements must be preserved.
     *
     * Example:
     *   Input:  {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
     *   Output: 5   (first 5 elements of arr become {0,1,2,3,4})
     *
     * Intuition — Slow-Fast Pointers:
     *   slow = 0  (points to the last confirmed unique element)
     *   fast = 1  (scans ahead looking for new unique elements)
     *
     *   When arr[fast] != arr[slow]:
     *     Found a new unique number! slow++, copy arr[fast] to arr[slow]
     *   When arr[fast] == arr[slow]:
     *     Duplicate — just move fast forward, slow stays.
     *
     * Dry Run ({0, 0, 1, 1, 2}):
     *   slow=0(0), fast=1(0): same → fast++
     *   slow=0(0), fast=2(1): diff → slow=1, arr[1]=1 → {0,1,1,1,2}
     *   slow=1(1), fast=3(1): same → fast++
     *   slow=1(1), fast=4(2): diff → slow=2, arr[2]=2 → {0,1,2,1,2}
     *   fast out of bounds → return slow+1 = 3  ✓
     *
     * Test Cases:
     *   {0,0,1,1,1,2,2,3,3,4} → 5  (arr = {0,1,2,3,4,...})
     *   {1,1,2}                → 2  (arr = {1,2,...})
     *   {1}                    → 1
     *
     * Time: O(N)   Space: O(1)
     */
    public static int removeDuplicates(int[] arr) {
        return 0; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q14 — Move Zeroes   ★ LeetCode 283
     * ──────────────────────────────────
     * Problem: Move all 0s to the END of the array IN-PLACE,
     * while maintaining the RELATIVE ORDER of non-zero elements.
     *
     * Example:
     *   Input:  {0, 1, 0, 3, 12}
     *   Output: {1, 3, 12, 0, 0}
     *
     * Intuition — Slow-Fast Pointers:
     *   slow = 0  (next position for a non-zero element)
     *   fast scans each element
     *
     *   When arr[fast] != 0:
     *     Swap arr[slow] and arr[fast], then slow++
     *     (This moves non-zero to the front, zero shifts to fast's position)
     *   When arr[fast] == 0:
     *     Skip it, only fast moves
     *
     * Dry Run ({0, 1, 0, 3, 12}):
     *   slow=0, fast=0: arr[0]=0, skip, fast++
     *   slow=0, fast=1: arr[1]=1 ≠ 0 → swap(0,1) → {1,0,0,3,12}, slow=1, fast++
     *   slow=1, fast=2: arr[2]=0, skip, fast++
     *   slow=1, fast=3: arr[3]=3 ≠ 0 → swap(1,3) → {1,3,0,0,12}, slow=2, fast++
     *   slow=2, fast=4: arr[4]=12 ≠ 0 → swap(2,4) → {1,3,12,0,0}, slow=3
     *   Result: {1, 3, 12, 0, 0}  ✓
     *
     * Test Cases:
     *   {0, 1, 0, 3, 12}  → {1, 3, 12, 0, 0}
     *   {0}               → {0}
     *   {1}               → {1}
     *   {0, 0, 0, 1}      → {1, 0, 0, 0}
     *
     * Time: O(N)   Space: O(1)
     */
    public static void moveZeros(int[] arr) {
        // write your solution here
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q15 — Container With Most Water   ★ LeetCode 11
     * ──────────────────────────────────────────────────
     * Problem: Given height[], each index is a vertical bar with that height.
     * Two bars form a container. Find the two bars that hold the MOST water.
     *
     * Example:
     *   Input:  height = {1, 8, 6, 2, 5, 4, 8, 3, 7}
     *   Output: 49
     *   Explanation: bars at index 1(h=8) and index 8(h=7)
     *                width = 8-1 = 7, height = min(8,7) = 7, area = 7*7 = 49
     *
     * Intuition — Two Pointers:
     *   Water held = min(height[left], height[right]) × (right - left)
     *   We want to MAXIMIZE this.
     *
     *   Start with widest possible container: left=0, right=n-1.
     *   The SHORTER bar is the bottleneck (water can't go above it).
     *   Moving the TALLER bar inward will never increase area (width shrinks, height can't grow).
     *   So always move the SHORTER bar inward — it's the only chance to find a taller bar.
     *
     * Why move the shorter bar?
     *   Suppose left bar = 3, right bar = 8, width = 10, area = 30.
     *   If we move the right bar (taller one) inward:
     *     new width = 9, new height ≤ 3 (still bounded by left=3), area ≤ 27. Worse!
     *   If we move the left bar (shorter one) inward:
     *     new width = 9, new height might be > 3, area might be > 27. Possible improvement!
     *
     * Dry Run ({1, 8, 6, 2, 5, 4, 8, 3, 7}):
     *   left=0(1), right=8(7): area = min(1,7)*8 = 8,  max=8.  Move left (shorter)
     *   left=1(8), right=8(7): area = min(8,7)*7 = 49, max=49. Move right (shorter)
     *   left=1(8), right=7(3): area = min(8,3)*6 = 18, max=49. Move right
     *   ... continue → max stays 49  ✓
     *
     * Test Cases:
     *   {1,8,6,2,5,4,8,3,7} → 49
     *   {1,1}               → 1
     *   {4,3,2,1,4}         → 16
     *
     * Time: O(N)   Space: O(1)
     */
    public static int maxWater(int[] height) {
        return 0; // replace with your solution
    }

    // Helper: reverse a subarray in-place (you can use this in Q9 and Q10)
    private static void reverse(int[] arr, int start, int end) {
        // hint: swap arr[start] and arr[end], then move both inward
    }

    public static void main(String[] args) {
        // PART A — no output tests, write TC/SC in the comments above

        // PART B
        System.out.println("=== Q6 Is Sorted ===");
        System.out.println(isSorted(new int[]{1, 2, 3, 4, 5}));             // true
        System.out.println(isSorted(new int[]{1, 3, 2, 5, 4}));             // false
        System.out.println(isSorted(new int[]{1, 2, 2, 4, 5}));             // true

        System.out.println("=== Q7 Missing Number ===");
        System.out.println(missingNumber(new int[]{3, 0, 1}));               // 2
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));    // 8
        System.out.println(missingNumber(new int[]{1}));                     // 0

        System.out.println("=== Q8 Single Number ===");
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));         // 4
        System.out.println(singleNumber(new int[]{2, 2, 1}));               // 1

        System.out.println("=== Q9 Right Rotate by K ===");
        int[] arr9 = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr9, 3);
        System.out.println(Arrays.toString(arr9));                           // [5, 6, 7, 1, 2, 3, 4]

        System.out.println("=== Q10 Left Rotate by K ===");
        int[] arr10 = {1, 2, 3, 4, 5};
        leftRotate(arr10, 2);
        System.out.println(Arrays.toString(arr10));                          // [3, 4, 5, 1, 2]

        // PART C
        System.out.println("=== Q11 Valid Palindrome ===");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // true
        System.out.println(isPalindrome("race a car"));                      // false
        System.out.println(isPalindrome(" "));                               // true

        System.out.println("=== Q12 Two Sum Sorted ===");
        System.out.println(Arrays.toString(twoSumSorted(new int[]{2,7,11,15}, 9)));  // [1, 2]
        System.out.println(Arrays.toString(twoSumSorted(new int[]{2,3,4}, 6)));      // [1, 3]

        System.out.println("=== Q13 Remove Duplicates ===");
        int[] arr13 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr13));                         // 5

        System.out.println("=== Q14 Move Zeros ===");
        int[] arr14 = {0, 1, 0, 3, 12};
        moveZeros(arr14);
        System.out.println(Arrays.toString(arr14));                          // [1, 3, 12, 0, 0]

        System.out.println("=== Q15 Container With Most Water ===");
        System.out.println(maxWater(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); // 49
        System.out.println(maxWater(new int[]{1, 1}));                       // 1
    }
}
