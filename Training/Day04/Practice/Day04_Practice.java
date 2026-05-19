public class Day04_Practice {

    // ═══════════════════════════════════════════════
    // PART A — BASIC RECURSION PROBLEMS
    // ═══════════════════════════════════════════════

    // Q1 — Print 1 to N (no loop allowed)
    // Input:  n = 5
    // Output: 1 2 3 4 5
    // Hint: Print AFTER the recursive call → ascending
    // Time: O(__)  Space: O(__)
    public static void print1ToN(int n) {

    }

    // Q2 — Print N to 1 (no loop allowed)
    // Input:  n = 5
    // Output: 5 4 3 2 1
    // Hint: Print BEFORE the recursive call → descending
    // Time: O(__)  Space: O(__)
    public static void printNTo1(int n) {

    }

    // Q3 — Sum of 1 to N
    // Input:  n = 5
    // Output: 15  (1+2+3+4+5)
    // Time: O(__)  Space: O(__)
    public static int sumToN(int n) {
        return 0;
    }

    // Q4 — Factorial
    // Input:  n = 5
    // Output: 120  (5! = 5×4×3×2×1)
    // Time: O(__)  Space: O(__)
    public static long factorial(int n) {
        return 0;
    }

    // Q5 — Fibonacci (Naive Recursion)  ← LeetCode 509
    // fib(0)=0, fib(1)=1, fib(n) = fib(n-1) + fib(n-2)
    // Input:  n = 6
    // Output: 8   (0,1,1,2,3,5,8)
    // Time: O(__)  Space: O(__)
    // Note: Ye slow hai — note karo kyun (exponential calls)
    public static int fibonacci(int n) {
        return 0;
    }

    // ═══════════════════════════════════════════════
    // PART B — RECURSION ON NUMBERS
    // ═══════════════════════════════════════════════

    // Q6 — Power of a Number (Naive: O(N))  ← LeetCode 50 (Pow(x, n))
    // Input:  base=2, exp=10
    // Output: 1024
    // Hint: base^exp = base × base^(exp-1), base^0 = 1
    // Time: O(__)  Space: O(__)
    public static long powerNaive(int base, int exp) {
        return 0;
    }

    // Q7 — Power of a Number (Fast: O(log N)) ← IMPORTANT
    // Same input/output as Q6, but efficient
    // Hint: if exp is even → (base^(exp/2))^2
    //       if exp is odd  → base × base^(exp-1)
    // Time: O(__)  Space: O(__)
    public static long powerFast(int base, int exp) {
        return 0;
    }

    // Q8 — Count Digits in a Number using Recursion
    // Input:  n = 12345
    // Output: 5
    // Hint: count = 1 + countDigits(n/10)   base: n==0 → 0
    // Time: O(__)  Space: O(__)
    public static int countDigits(int n) {
        return 0;
    }

    // Q9 — Reverse a Number using Recursion
    // Input:  n = 1234,  reversed = 0 (initially)
    // Output: 4321
    // Hint: last digit = n%10
    //       reversed = reversed*10 + last digit
    //       call with n/10
    // Time: O(__)  Space: O(__)
    public static int reverseNumber(int n, int reversed) {
        return reversed;
    }

    // Q10 — Check if a Number is a Palindrome using Recursion  ← LeetCode 9
    // Input:  n = 121  → true
    // Input:  n = 123  → false
    // Hint: Reverse the number and compare with original
    // Time: O(__)  Space: O(__)
    public static boolean isPalindrome(int n) {
        return false;
    }

    // ═══════════════════════════════════════════════
    // PART C — RECURSION ON STRINGS/ARRAYS
    // ═══════════════════════════════════════════════

    // Q11 — Reverse a String using Recursion  ← LeetCode 344
    // Input:  s = "hello"
    // Output: "olleh"
    // Hint: last char + reverse(rest of string)
    // Time: O(__)  Space: O(__)
    public static String reverseString(String s) {
        return "";
    }

    // Q12 — Check Palindrome String using Recursion
    // Input:  s = "racecar" → true
    // Input:  s = "hello"   → false
    // Hint: first == last → check middle
    //       base: length 0 or 1 → true
    // Time: O(__)  Space: O(__)
    public static boolean isPalindromeStr(String s, int left, int right) {
        return false;
    }

    // Q13 — Sum of Array using Recursion
    // Input:  arr = {1, 2, 3, 4, 5},  i = 0
    // Output: 15
    // Hint: arr[i] + sumArray(arr, i+1)
    //       base: i == arr.length → 0
    // Time: O(__)  Space: O(__)
    public static int sumArray(int[] arr, int i) {
        return 0;
    }

    // Q14 — Find Max in Array using Recursion
    // Input:  arr = {3, 1, 7, 2, 5},  i = 0
    // Output: 7
    // Hint: Math.max(arr[i], findMax(arr, i+1))
    //       base: i == arr.length-1 → arr[i]
    // Time: O(__)  Space: O(__)
    public static int findMax(int[] arr, int i) {
        return Integer.MIN_VALUE;
    }

    // Q15 — Binary Search using Recursion  ← LeetCode 704 (Bonus — Phase 2 preview)
    // Input:  arr = {1, 3, 5, 7, 9, 11},  target = 7
    // Output: 3  (index)
    // Hint: Check middle element
    //       if target < mid → search left half
    //       if target > mid → search right half
    //       if equal → return mid index
    // Time: O(__)  Space: O(__)
    public static int binarySearch(int[] arr, int target, int low, int high) {
        return -1;
    }

    public static void main(String[] args) {
        // PART A
        System.out.println("=== Q1 Print 1 to N ===");
        print1ToN(5);                                           // 1 2 3 4 5

        System.out.println("=== Q2 Print N to 1 ===");
        printNTo1(5);                                           // 5 4 3 2 1

        System.out.println("=== Q3 Sum 1 to N ===");
        System.out.println(sumToN(5));                          // 15

        System.out.println("=== Q4 Factorial ===");
        System.out.println(factorial(5));                       // 120
        System.out.println(factorial(0));                       // 1

        System.out.println("=== Q5 Fibonacci ===");
        System.out.println(fibonacci(6));                       // 8
        System.out.println(fibonacci(10));                      // 55

        // PART B
        System.out.println("=== Q6 Power Naive ===");
        System.out.println(powerNaive(2, 10));                  // 1024

        System.out.println("=== Q7 Power Fast ===");
        System.out.println(powerFast(2, 10));                   // 1024
        System.out.println(powerFast(3, 5));                    // 243

        System.out.println("=== Q8 Count Digits ===");
        System.out.println(countDigits(12345));                 // 5
        System.out.println(countDigits(0));                     // 0

        System.out.println("=== Q9 Reverse Number ===");
        System.out.println(reverseNumber(1234, 0));             // 4321
        System.out.println(reverseNumber(100, 0));              // 1

        System.out.println("=== Q10 Is Number Palindrome ===");
        System.out.println(isPalindrome(121));                  // true
        System.out.println(isPalindrome(123));                  // false

        // PART C
        System.out.println("=== Q11 Reverse String ===");
        System.out.println(reverseString("hello"));             // olleh
        System.out.println(reverseString("abcde"));             // edcba

        System.out.println("=== Q12 Palindrome String ===");
        System.out.println(isPalindromeStr("racecar", 0, 6));   // true
        System.out.println(isPalindromeStr("hello", 0, 4));     // false

        System.out.println("=== Q13 Sum Array ===");
        System.out.println(sumArray(new int[]{1, 2, 3, 4, 5}, 0)); // 15

        System.out.println("=== Q14 Find Max ===");
        System.out.println(findMax(new int[]{3, 1, 7, 2, 5}, 0));  // 7

        System.out.println("=== Q15 Binary Search ===");
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9, 11}, 7, 0, 5)); // 3
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9, 11}, 4, 0, 5)); // -1
    }
}
