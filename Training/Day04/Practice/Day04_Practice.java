public class Day04_Practice {

    // ════════════════════════════════════════════════════════════
    // PART A — BASIC RECURSION
    // ════════════════════════════════════════════════════════════

    /*
     * Q1 — Print 1 to N
     * ─────────────────
     * Problem: Given a number n, print all numbers from 1 to n using recursion.
     * No loops allowed.
     *
     * Example:
     *   Input:  n = 5
     *   Output: 1 2 3 4 5
     *
     * Intuition:
     *   Think about this: to print 1..5, you first need 1..4 to be printed,
     *   then print 5. But to print 1..4, you need 1..3 first... and so on.
     *   Base case: when n becomes 0, stop.
     *   Key trick: WHERE you put the print statement decides the order.
     *     - Print AFTER recursive call → numbers appear in ASCENDING order
     *     - Print BEFORE recursive call → numbers appear in DESCENDING order
     *
     * Dry Run (n=3):
     *   print1ToN(3)
     *     → print1ToN(2)
     *         → print1ToN(1)
     *             → print1ToN(0) ← BASE CASE, return
     *             ← print 1
     *         ← print 2
     *     ← print 3
     *   Output: 1 2 3  ✓
     *
     * Test Cases:
     *   n=1  → 1
     *   n=5  → 1 2 3 4 5
     *   n=0  → (nothing printed)
     *
     * Time: O(N)   Space: O(N) — call stack N deep
     */
    public static void print1ToN(int n) {
        // write your solution here
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q2 — Print N to 1
     * ─────────────────
     * Problem: Given a number n, print all numbers from n down to 1.
     * No loops allowed.
     *
     * Example:
     *   Input:  n = 5
     *   Output: 5 4 3 2 1
     *
     * Intuition:
     *   Exact same structure as Q1 — only difference is WHERE you put the print.
     *   Print BEFORE the recursive call → current number prints first, then smaller ones.
     *
     * Dry Run (n=3):
     *   printNTo1(3) → print 3
     *     → printNTo1(2) → print 2
     *         → printNTo1(1) → print 1
     *             → printNTo1(0) ← BASE CASE, return
     *   Output: 3 2 1  ✓
     *
     * Test Cases:
     *   n=1  → 1
     *   n=5  → 5 4 3 2 1
     *
     * Time: O(N)   Space: O(N)
     */
    public static void printNTo1(int n) {
        // write your solution here
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q3 — Sum of 1 to N
     * ──────────────────
     * Problem: Given n, return 1 + 2 + 3 + ... + n using recursion.
     *
     * Example:
     *   Input:  n = 5
     *   Output: 15
     *
     * Intuition:
     *   sum(5) = 5 + sum(4)
     *   sum(4) = 4 + sum(3)
     *   sum(3) = 3 + sum(2)
     *   sum(2) = 2 + sum(1)
     *   sum(1) = 1 + sum(0)
     *   sum(0) = 0  ← BASE CASE
     *   Now unwind: 0 → 1 → 3 → 6 → 10 → 15
     *
     * Dry Run (n=4):
     *   sumToN(4)
     *     = 4 + sumToN(3)
     *     = 4 + (3 + sumToN(2))
     *     = 4 + (3 + (2 + sumToN(1)))
     *     = 4 + (3 + (2 + (1 + sumToN(0))))
     *     = 4 + 3 + 2 + 1 + 0 = 10
     *
     * Test Cases:
     *   n=0  → 0
     *   n=1  → 1
     *   n=5  → 15
     *   n=10 → 55
     *
     * Time: O(N)   Space: O(N)
     */
    public static int sumToN(int n) {
        return 0; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q4 — Factorial   ★ LeetCode doesn't have this directly
     * ────────────────
     * Problem: Given n, return n! = n × (n-1) × (n-2) × ... × 1
     *
     * Example:
     *   Input:  n = 5
     *   Output: 120   (5 × 4 × 3 × 2 × 1)
     *
     * Intuition:
     *   factorial(n) = n × factorial(n-1)
     *   You don't know factorial(n) but you know if someone gives you
     *   factorial(n-1), you just multiply n into it.
     *   Base: factorial(0) = 1  and  factorial(1) = 1
     *
     * Dry Run (n=4):
     *   factorial(4)
     *     = 4 × factorial(3)
     *     = 4 × (3 × factorial(2))
     *     = 4 × (3 × (2 × factorial(1)))
     *     = 4 × (3 × (2 × 1))
     *     = 4 × 6 = 24
     *
     * Test Cases:
     *   n=0  → 1   (0! = 1 by definition)
     *   n=1  → 1
     *   n=5  → 120
     *   n=10 → 3628800
     *
     * Time: O(N)   Space: O(N)
     */
    public static long factorial(int n) {
        return 0; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q5 — Fibonacci Number   ★ LeetCode 509
     * ─────────────────────────────────────
     * Problem: fib(0)=0, fib(1)=1, fib(n) = fib(n-1) + fib(n-2)
     * Return the nth Fibonacci number.
     *
     * Example:
     *   Input:  n = 6
     *   Output: 8   (series: 0,1,1,2,3,5,8)
     *
     * Intuition:
     *   Each number is the sum of the two before it.
     *   You need TWO base cases because the recursion goes two levels deep.
     *   Without fib(0)=0 and fib(1)=1, the recursion never stops.
     *
     * Dry Run (n=4):
     *          fib(4)
     *         /       \
     *      fib(3)    fib(2)
     *      /    \    /    \
     *   fib(2) fib(1) fib(1) fib(0)
     *   /    \
     * fib(1) fib(0)
     *
     *   Count the calls: fib(2) computed TWICE, fib(1) computed THREE times.
     *   This is WHY it's O(2^N) — lots of repeated work.
     *   (Solution: Memoization / DP — coming in Phase 10)
     *
     * Test Cases:
     *   n=0  → 0
     *   n=1  → 1
     *   n=6  → 8
     *   n=10 → 55
     *
     * Time: O(2^N) ← SLOW — notice this!
     * Space: O(N)  — max stack depth is N
     */
    public static int fibonacci(int n) {
        return 0; // replace with your solution
    }

    // ════════════════════════════════════════════════════════════
    // PART B — RECURSION ON NUMBERS
    // ════════════════════════════════════════════════════════════

    /*
     * Q6 — Power of a Number (Naive)   ★ LeetCode 50
     * ────────────────────────────────────────────────
     * Problem: Given base and exp, return base^exp using recursion.
     *
     * Example:
     *   Input:  base=2, exp=10
     *   Output: 1024
     *
     * Intuition:
     *   2^10 = 2 × 2^9
     *   2^9  = 2 × 2^8
     *   ...until exp=0 → anything^0 = 1 (base case)
     *
     * Dry Run (base=2, exp=3):
     *   power(2, 3)
     *     = 2 × power(2, 2)
     *     = 2 × (2 × power(2, 1))
     *     = 2 × (2 × (2 × power(2, 0)))
     *     = 2 × (2 × (2 × 1))
     *     = 2 × 4 = 8  ✓
     *
     * Test Cases:
     *   base=2, exp=0  → 1
     *   base=2, exp=1  → 2
     *   base=2, exp=10 → 1024
     *   base=3, exp=4  → 81
     *
     * Time: O(exp)   Space: O(exp)
     */
    public static long powerNaive(int base, int exp) {
        return 0; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q7 — Power of a Number (Fast Exponentiation)   ★ LeetCode 50
     * ──────────────────────────────────────────────────────────────
     * Problem: Same as Q6 but must solve in O(log N).
     *
     * Intuition:
     *   Key insight: if exp is EVEN, you don't need to multiply exp times.
     *   base^8 = base^4 × base^4   → compute base^4 once, multiply with itself
     *   base^4 = base^2 × base^2   → compute base^2 once, multiply with itself
     *   base^2 = base^1 × base^1   → compute base^1 once, multiply with itself
     *   Total: 3 multiplications instead of 7 → O(log N)
     *
     *   If exp is ODD: base^5 = base × base^4
     *   Reduce to even: base^4 = (base^2)^2
     *
     * Dry Run (base=2, exp=8):
     *   powerFast(2, 8) → exp even → half = powerFast(2, 4)
     *     powerFast(2, 4) → exp even → half = powerFast(2, 2)
     *       powerFast(2, 2) → exp even → half = powerFast(2, 1)
     *         powerFast(2, 1) → exp odd  → 2 × powerFast(2, 0)
     *           powerFast(2, 0) → BASE CASE → return 1
     *         ← 2 × 1 = 2
     *       ← 2 × 2 = 4    (half=2, return half*half)
     *     ← 4 × 4 = 16     (half=4, return half*half)
     *   ← 16 × 16 = 256    (half=16, return half*half)
     *   Result: 256  (wait, 2^8 = 256 ✓)
     *
     * Test Cases:
     *   base=2, exp=10 → 1024
     *   base=3, exp=5  → 243
     *   base=2, exp=0  → 1
     *
     * Time: O(log N)   Space: O(log N)
     */
    public static long powerFast(int base, int exp) {
        return 0; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q8 — Count Digits in a Number
     * ──────────────────────────────
     * Problem: Given n, return the count of its digits.
     *
     * Example:
     *   Input:  12345  → 5
     *   Input:  7      → 1
     *
     * Intuition:
     *   Each call, chop off the last digit with n/10.
     *   Count 1 for the current digit.
     *   When n becomes 0, no more digits.
     *
     * Dry Run (n=123):
     *   countDigits(123) = 1 + countDigits(12)
     *                    = 1 + (1 + countDigits(1))
     *                    = 1 + (1 + (1 + countDigits(0)))
     *                    = 1 + 1 + 1 + 0 = 3  ✓
     *
     * Test Cases:
     *   n=0     → 0
     *   n=7     → 1
     *   n=12345 → 5
     *   n=1000  → 4
     *
     * Time: O(digits) ≈ O(log N)   Space: O(log N)
     */
    public static int countDigits(int n) {
        return 0; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q9 — Reverse a Number
     * ─────────────────────
     * Problem: Given n, return its reverse. (reversed starts at 0)
     *
     * Example:
     *   Input:  n=1234, reversed=0
     *   Output: 4321
     *
     * Intuition:
     *   Last digit of n = n % 10
     *   Attach it to reversed: reversed = reversed * 10 + (n % 10)
     *   Remove last digit: n = n / 10
     *   When n = 0, reversed holds the answer.
     *
     * Dry Run (n=123, reversed=0):
     *   Step 1: last=3, reversed = 0*10+3 = 3,  call(12, 3)
     *   Step 2: last=2, reversed = 3*10+2 = 32, call(1,  32)
     *   Step 3: last=1, reversed = 32*10+1= 321,call(0,  321)
     *   Step 4: n=0 → BASE CASE → return 321  ✓
     *
     * Test Cases:
     *   n=1234, reversed=0   → 4321
     *   n=100,  reversed=0   → 1     (leading zeros disappear)
     *   n=7,    reversed=0   → 7
     *
     * Time: O(digits)   Space: O(digits)
     */
    public static int reverseNumber(int n, int reversed) {
        return reversed; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q10 — Check if a Number is a Palindrome   ★ LeetCode 9
     * ────────────────────────────────────────────────────────
     * Problem: Return true if n reads the same forward and backward.
     * Negative numbers are never palindromes.
     *
     * Example:
     *   Input:  121  → true
     *   Input:  123  → false
     *   Input:  -121 → false
     *
     * Intuition:
     *   Use Q9! Reverse the number and compare with original.
     *   If reversed == original → palindrome.
     *   Edge case: negative numbers → directly false.
     *
     * Dry Run (n=121):
     *   original = 121
     *   reversed = reverseNumber(121, 0) = 121
     *   121 == 121 → true  ✓
     *
     * Dry Run (n=123):
     *   reversed = 321
     *   321 != 123 → false  ✓
     *
     * Test Cases:
     *   121    → true
     *   1221   → true
     *   123    → false
     *   -121   → false
     *   10     → false  (reversed is 01 = 1, not 10)
     *
     * Time: O(digits)   Space: O(digits)
     */
    public static boolean isPalindrome(int n) {
        return false; // replace with your solution
    }

    // ════════════════════════════════════════════════════════════
    // PART C — RECURSION ON STRINGS / ARRAYS
    // ════════════════════════════════════════════════════════════

    /*
     * Q11 — Reverse a String   ★ LeetCode 344
     * ─────────────────────────────────────────
     * Problem: Reverse a string using recursion. No StringBuilder.
     *
     * Example:
     *   Input:  "hello"
     *   Output: "olleh"
     *
     * Intuition:
     *   The last character of s goes first in the reversed string.
     *   Then recursively reverse the rest (without last char).
     *   s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1))
     *
     * Dry Run ("abc"):
     *   reverseString("abc")
     *     = 'c' + reverseString("ab")
     *     = 'c' + ('b' + reverseString("a"))
     *     = 'c' + ('b' + ('a' + reverseString("")))
     *     = 'c' + 'b' + 'a' + ""
     *     = "cba"  ✓
     *
     * Test Cases:
     *   "hello" → "olleh"
     *   "a"     → "a"
     *   ""      → ""
     *   "abcde" → "edcba"
     *
     * Time: O(N)   Space: O(N)
     */
    public static String reverseString(String s) {
        return ""; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q12 — Check Palindrome String
     * ──────────────────────────────
     * Problem: Return true if s is a palindrome. Use two-pointer recursion.
     *
     * Example:
     *   Input:  s="racecar", left=0, right=6  → true
     *   Input:  s="hello",   left=0, right=4  → false
     *
     * Intuition:
     *   Compare first and last characters.
     *   If they match → check the middle part (left+1 to right-1).
     *   If they don't match → not a palindrome.
     *   Base: when left >= right, all characters matched → true.
     *
     * Dry Run ("racecar", 0, 6):
     *   s[0]='r', s[6]='r' → match → check(1, 5)
     *   s[1]='a', s[5]='a' → match → check(2, 4)
     *   s[2]='c', s[4]='c' → match → check(3, 3)
     *   left >= right (3 >= 3) → BASE CASE → return true  ✓
     *
     * Test Cases:
     *   "racecar", 0, 6  → true
     *   "abcba",   0, 4  → true
     *   "hello",   0, 4  → false
     *   "a",       0, 0  → true
     *
     * Time: O(N)   Space: O(N)
     */
    public static boolean isPalindromeStr(String s, int left, int right) {
        return false; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q13 — Sum of Array
     * ──────────────────
     * Problem: Return sum of all elements in arr, starting from index i.
     *
     * Example:
     *   Input:  arr={1,2,3,4,5}, i=0
     *   Output: 15
     *
     * Intuition:
     *   sumArray from index i = arr[i] + sumArray from index i+1
     *   Base: when i == arr.length, there are no more elements → return 0.
     *
     * Dry Run ({1,2,3}, i=0):
     *   sumArray({1,2,3}, 0)
     *     = 1 + sumArray({1,2,3}, 1)
     *     = 1 + (2 + sumArray({1,2,3}, 2))
     *     = 1 + (2 + (3 + sumArray({1,2,3}, 3)))
     *     = 1 + 2 + 3 + 0 = 6  ✓
     *
     * Test Cases:
     *   {1,2,3,4,5}, i=0 → 15
     *   {10},         i=0 → 10
     *   {},           i=0 → 0
     *
     * Time: O(N)   Space: O(N)
     */
    public static int sumArray(int[] arr, int i) {
        return 0; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q14 — Find Maximum in Array
     * ────────────────────────────
     * Problem: Return max element in arr from index i onwards.
     *
     * Example:
     *   Input:  arr={3,1,7,2,5}, i=0
     *   Output: 7
     *
     * Intuition:
     *   Max from index i = larger of (arr[i], max from i+1 onwards)
     *   Base: when i == arr.length-1, that's the only element → return arr[i].
     *
     * Dry Run ({3,1,7}, i=0):
     *   findMax(arr, 0) = max(3, findMax(arr, 1))
     *                   = max(3, max(1, findMax(arr, 2)))
     *                   = max(3, max(1, 7))   ← base case: arr[2]=7
     *                   = max(3, 7)
     *                   = 7  ✓
     *
     * Test Cases:
     *   {3,1,7,2,5}, i=0 → 7
     *   {5},          i=0 → 5
     *   {1,2,3,4,5},  i=0 → 5
     *   {5,4,3,2,1},  i=0 → 5
     *
     * Time: O(N)   Space: O(N)
     */
    public static int findMax(int[] arr, int i) {
        return Integer.MIN_VALUE; // replace with your solution
    }

    // ────────────────────────────────────────────────────────────

    /*
     * Q15 — Binary Search (Bonus)   ★ LeetCode 704
     * ──────────────────────────────────────────────
     * Problem: Search target in a sorted array. Return index, or -1 if not found.
     * This is a BONUS — Binary Search fully comes in Phase 2.
     *
     * Example:
     *   Input:  arr={1,3,5,7,9,11}, target=7
     *   Output: 3
     *
     * Intuition:
     *   Array is sorted → middle element splits it into two halves.
     *   If target == arr[mid] → found!
     *   If target < arr[mid]  → target must be in LEFT half → search low..mid-1
     *   If target > arr[mid]  → target must be in RIGHT half → search mid+1..high
     *   Base: low > high → element not present → return -1
     *
     * Dry Run ({1,3,5,7,9,11}, target=7, low=0, high=5):
     *   mid = 2, arr[2]=5  < 7 → search right: low=3, high=5
     *   mid = 4, arr[4]=9  > 7 → search left:  low=3, high=3
     *   mid = 3, arr[3]=7 == 7 → return 3  ✓
     *
     * Test Cases:
     *   {1,3,5,7,9,11}, target=7,  low=0, high=5 → 3
     *   {1,3,5,7,9,11}, target=4,  low=0, high=5 → -1
     *   {5},             target=5,  low=0, high=0 → 0
     *
     * Time: O(log N)   Space: O(log N) — recursive stack
     */
    public static int binarySearch(int[] arr, int target, int low, int high) {
        return -1; // replace with your solution
    }

    public static void main(String[] args) {
        // Q1
        System.out.println("=== Q1 Print 1 to N ===");
        print1ToN(5);                                                     // 1 2 3 4 5

        // Q2
        System.out.println("=== Q2 Print N to 1 ===");
        printNTo1(5);                                                     // 5 4 3 2 1

        // Q3
        System.out.println("=== Q3 Sum 1 to N ===");
        System.out.println(sumToN(5));                                    // 15
        System.out.println(sumToN(0));                                    // 0

        // Q4
        System.out.println("=== Q4 Factorial ===");
        System.out.println(factorial(5));                                 // 120
        System.out.println(factorial(0));                                 // 1

        // Q5
        System.out.println("=== Q5 Fibonacci ===");
        System.out.println(fibonacci(6));                                 // 8
        System.out.println(fibonacci(10));                                // 55

        // Q6
        System.out.println("=== Q6 Power Naive ===");
        System.out.println(powerNaive(2, 10));                            // 1024

        // Q7
        System.out.println("=== Q7 Power Fast ===");
        System.out.println(powerFast(2, 10));                             // 1024
        System.out.println(powerFast(3, 5));                              // 243

        // Q8
        System.out.println("=== Q8 Count Digits ===");
        System.out.println(countDigits(12345));                           // 5
        System.out.println(countDigits(0));                               // 0

        // Q9
        System.out.println("=== Q9 Reverse Number ===");
        System.out.println(reverseNumber(1234, 0));                       // 4321
        System.out.println(reverseNumber(100, 0));                        // 1

        // Q10
        System.out.println("=== Q10 Palindrome Number ===");
        System.out.println(isPalindrome(121));                            // true
        System.out.println(isPalindrome(123));                            // false

        // Q11
        System.out.println("=== Q11 Reverse String ===");
        System.out.println(reverseString("hello"));                       // olleh
        System.out.println(reverseString("abcde"));                       // edcba

        // Q12
        System.out.println("=== Q12 Palindrome String ===");
        System.out.println(isPalindromeStr("racecar", 0, 6));             // true
        System.out.println(isPalindromeStr("hello", 0, 4));               // false

        // Q13
        System.out.println("=== Q13 Sum Array ===");
        System.out.println(sumArray(new int[]{1, 2, 3, 4, 5}, 0));       // 15

        // Q14
        System.out.println("=== Q14 Find Max ===");
        System.out.println(findMax(new int[]{3, 1, 7, 2, 5}, 0));        // 7

        // Q15
        System.out.println("=== Q15 Binary Search ===");
        System.out.println(binarySearch(new int[]{1,3,5,7,9,11}, 7, 0, 5)); // 3
        System.out.println(binarySearch(new int[]{1,3,5,7,9,11}, 4, 0, 5)); // -1
    }
}
