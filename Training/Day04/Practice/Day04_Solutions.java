public class Day04_Solutions {

    // ════════════════════════════════════════════════════════════
    // PART A — BASIC RECURSION
    // ════════════════════════════════════════════════════════════

    // Q1 — Print 1 to N
    // Approach: Print AFTER recursive call → numbers unwind in ascending order
    // Other ways: → Use a loop (O(N) time, O(1) space — but loops not allowed here)
    public static void print1ToN(int n) {
        if (n == 0) return;
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    // Q2 — Print N to 1
    // Approach: Print BEFORE recursive call → current number first, then smaller
    // Other ways: → Use a loop counting down
    public static void printNTo1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    // Q3 — Sum of 1 to N
    // Approach: sumToN(n) = n + sumToN(n-1), base: n=0 → 0
    // Other ways: → Math formula n*(n+1)/2 in O(1) time O(1) space
    //             → Iterative loop
    public static int sumToN(int n) {
        if (n == 0) return 0;
        return n + sumToN(n - 1);
    }

    // Q4 — Factorial
    // Approach: factorial(n) = n × factorial(n-1), base: n=0 or n=1 → 1
    // Other ways: → Iterative with a running product variable
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Q5 — Fibonacci   ★ LC 509
    // Approach: Naive recursion — fib(n) = fib(n-1) + fib(n-2), O(2^N)
    // Other ways: → Memoization (HashMap/array) — O(N) time O(N) space
    //             → Bottom-up DP (tabulation)   — O(N) time O(N) space
    //             → Space-optimized DP (two vars) — O(N) time O(1) space
    //             → Matrix exponentiation        — O(log N) time
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // ════════════════════════════════════════════════════════════
    // PART B — RECURSION ON NUMBERS
    // ════════════════════════════════════════════════════════════

    // Q6 — Power Naive   ★ LC 50
    // Approach: base^exp = base × base^(exp-1), base: exp=0 → 1
    // Time: O(exp)  Space: O(exp)
    public static long powerNaive(int base, int exp) {
        if (exp == 0) return 1;
        return base * powerNaive(base, exp - 1);
    }

    // Q7 — Power Fast   ★ LC 50
    // Approach: even exp → compute half once, return half*half (halves the problem)
    //           odd exp  → reduce to even: base × base^(exp-1)
    // Other ways: → Java built-in Math.pow() — but that's cheating in interviews
    //             → Iterative fast exponentiation using bit manipulation
    // Time: O(log N)  Space: O(log N)
    public static long powerFast(int base, int exp) {
        if (exp == 0) return 1;
        if (exp % 2 == 0) {
            long half = powerFast(base, exp / 2);
            return half * half;
        } else {
            return base * powerFast(base, exp - 1);
        }
    }

    // Q8 — Count Digits
    // Approach: chop last digit (n/10) each call, count 1 per call
    // Other ways: → String.valueOf(n).length() — O(log N) but extra space
    //             → Math.floor(Math.log10(n)) + 1 — O(1) but float precision issues
    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    // Q9 — Reverse a Number
    // Approach: last digit = n%10, attach to reversed, call with n/10
    // Other ways: → Convert to String, reverse string, parse back to int
    //             → Iterative: while(n>0) { rev = rev*10 + n%10; n/=10; }
    public static int reverseNumber(int n, int reversed) {
        if (n == 0) return reversed;
        return reverseNumber(n / 10, reversed * 10 + n % 10);
    }

    // Q10 — Palindrome Number   ★ LC 9
    // Approach: reverse the number, compare with original
    // Other ways: → Compare first and last digits iteratively (without full reversal)
    //             → Convert to String, use two-pointer on string
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;
        return n == reverseNumber(n, 0);
    }

    // ════════════════════════════════════════════════════════════
    // PART C — RECURSION ON STRINGS / ARRAYS
    // ════════════════════════════════════════════════════════════

    // Q11 — Reverse String   ★ LC 344
    // Approach: last char + reverse(rest of string)
    // Other ways: → Two-pointer in-place swap (preferred for LC 344 — char[] input)
    //             → StringBuilder.reverse() — O(N) but uses extra space
    //             → Iterative with a char stack
    public static String reverseString(String s) {
        if (s.isEmpty()) return s;
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }

    // Q12 — Palindrome String
    // Approach: compare s[left] and s[right], recurse inward (left+1, right-1)
    // Other ways: → Two-pointer iterative — O(N) time O(1) space (more efficient)
    //             → Reverse string and compare
    public static boolean isPalindromeStr(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindromeStr(s, left + 1, right - 1);
    }

    // Q13 — Sum of Array
    // Approach: arr[i] + sumArray(arr, i+1), base: i==arr.length → 0
    // Other ways: → Iterative running sum
    //             → Arrays.stream(arr).sum()
    public static int sumArray(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sumArray(arr, i + 1);
    }

    // Q14 — Find Max in Array
    // Approach: Math.max(arr[i], findMax(arr, i+1)), base: i==arr.length-1 → arr[i]
    // Other ways: → Iterative with a max variable
    //             → Arrays.stream(arr).max()
    public static int findMax(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return Math.max(arr[i], findMax(arr, i + 1));
    }

    // Q15 — Binary Search   ★ LC 704
    // Approach: check mid, recurse left or right half based on comparison
    // Other ways: → Iterative binary search — O(log N) time O(1) space (preferred)
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        if (target < arr[mid]) return binarySearch(arr, target, low, mid - 1);
        return binarySearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        System.out.println("=== Q1 Print 1 to N ===");
        print1ToN(5); System.out.println();

        System.out.println("=== Q2 Print N to 1 ===");
        printNTo1(5); System.out.println();

        System.out.println("=== Q3 Sum 1 to N ===");
        System.out.println(sumToN(5));    // 15
        System.out.println(sumToN(0));    // 0

        System.out.println("=== Q4 Factorial ===");
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(0)); // 1

        System.out.println("=== Q5 Fibonacci ===");
        System.out.println(fibonacci(6));  // 8
        System.out.println(fibonacci(10)); // 55

        System.out.println("=== Q6 Power Naive ===");
        System.out.println(powerNaive(2, 10)); // 1024

        System.out.println("=== Q7 Power Fast ===");
        System.out.println(powerFast(2, 10)); // 1024
        System.out.println(powerFast(3, 5));  // 243

        System.out.println("=== Q8 Count Digits ===");
        System.out.println(countDigits(12345)); // 5
        System.out.println(countDigits(0));     // 0

        System.out.println("=== Q9 Reverse Number ===");
        System.out.println(reverseNumber(1234, 0)); // 4321
        System.out.println(reverseNumber(100, 0));  // 1

        System.out.println("=== Q10 Palindrome Number ===");
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(123)); // false

        System.out.println("=== Q11 Reverse String ===");
        System.out.println(reverseString("hello")); // olleh
        System.out.println(reverseString("abcde")); // edcba

        System.out.println("=== Q12 Palindrome String ===");
        System.out.println(isPalindromeStr("racecar", 0, 6)); // true
        System.out.println(isPalindromeStr("hello", 0, 4));   // false

        System.out.println("=== Q13 Sum Array ===");
        System.out.println(sumArray(new int[]{1,2,3,4,5}, 0)); // 15

        System.out.println("=== Q14 Find Max ===");
        System.out.println(findMax(new int[]{3,1,7,2,5}, 0)); // 7

        System.out.println("=== Q15 Binary Search ===");
        System.out.println(binarySearch(new int[]{1,3,5,7,9,11}, 7, 0, 5)); // 3
        System.out.println(binarySearch(new int[]{1,3,5,7,9,11}, 4, 0, 5)); // -1
    }
}
